package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.service.api.ISiteUserManager;
import com.we.sew.site.client.web.WebUtil;
import com.we.sew.site.core.model.SiteUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.security.Principal;

/**
 * @author Vladyslav_Yemelianov
 */
@Controller
public class SessionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SessionController.class);

    @Autowired
    private ISiteUserManager userService;

    @RequestMapping(value = WebUtil.Mapping.AUTH, method = RequestMethod.GET)
    public String saveUser(HttpSession session, Principal principal) {
        String authorizedUserName = principal.getName();
        SiteUser authorizedUser = userService.findByEmail(authorizedUserName);

        session.setAttribute(WebUtil.Consts.LOGGED_USER, authorizedUser);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(authorizedUserName + " logged in");
        }

        return WebUtil.redirect(WebUtil.Mapping.ROOT);
    }
}
