package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.bean.UserRegistrationBean;
import com.we.sew.site.client.service.api.ISiteUserService;
import com.we.sew.site.client.web.WebUtil;
import com.we.sew.site.client.web.controller.api.AbstractWebController;
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
import java.util.Map;

/**
 * @author Vladyslav_Yemelianov
 */
@Controller
@Validated
public class SiteUserController extends AbstractWebController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SiteUserController.class);

    @Autowired
    private ISiteUserService userService;

    @RequestMapping(value = WebUtil.Mapping.JOIN, method = RequestMethod.GET)
    public String joinPage() {
        return WebUtil.View.JOIN;
    }

    @RequestMapping(value = WebUtil.Mapping.JOIN, method = RequestMethod.POST)
    public ModelAndView join(@Valid UserRegistrationBean userBean, BindingResult result) {
        ModelAndView joinModel = new ModelAndView();
        if (result.hasErrors()) {
            joinModel.setViewName(WebUtil.View.JOIN);
            Map<String, String> errors = getErrorsFrom(result);
            joinModel.addObject(WebUtil.Consts.ERRORS, errors);

            return joinModel;
        }
        SiteUser siteUser = userService.create(userBean);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(siteUser.toString() + " joined to site.");
        }
        joinModel.setViewName(WebUtil.redirect(WebUtil.View.HOME));
        return joinModel;
    }
}
