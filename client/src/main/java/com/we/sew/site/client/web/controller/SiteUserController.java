package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.client.service.api.ISiteUserManager;
import com.we.sew.site.client.web.WebUtil;
import com.we.sew.site.client.web.controller.api.AbstractWebController;
import com.we.sew.site.client.web.model.ModelViewBuilder;
import com.we.sew.site.core.model.SiteUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @author Vladyslav_Yemelianov
 */
@Controller
@Validated
public class SiteUserController extends AbstractWebController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SiteUserController.class);

    @Autowired
    private ISiteUserManager userService;

    @RequestMapping(value = WebUtil.Mapping.JOIN, method = RequestMethod.GET)
    public String joinPage() {
        return WebUtil.View.JOIN;
    }

    @RequestMapping(value = WebUtil.Mapping.JOIN, method = RequestMethod.POST)
    public ModelAndView join(@Valid SiteUserRegistrationCommand userModel, BindingResult result) {
        if (result.hasErrors()) {
            return ModelViewBuilder.error(WebUtil.View.JOIN, result);
        }
		SiteUser siteUser = userService.create(userModel);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(siteUser.toString() + " joined to site.");
        }
        return ModelViewBuilder.success(WebUtil.View.HOME);
    }
}
