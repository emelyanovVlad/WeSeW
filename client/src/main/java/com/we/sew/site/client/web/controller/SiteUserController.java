package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.client.service.api.ISiteUserManager;
import com.we.sew.site.client.view.model.SiteUserViewModel;
import com.we.sew.site.client.web.WebUtil;
import com.we.sew.site.client.web.model.DataBean;
import com.we.sew.site.client.web.model.DataBeanBuilder;
import com.we.sew.site.client.web.model.ModelViewBuilder;
import com.we.sew.site.core.model.SiteUser;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vladyslav_Yemelianov
 */
@Controller
@Validated
public class SiteUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SiteUserController.class);

    @Autowired
    private ISiteUserManager userManager;

    @Autowired
    private Mapper mapper;

    @RequestMapping(value = WebUtil.Mapping.JOIN, method = RequestMethod.GET)
    public String joinPage() {
        return WebUtil.View.JOIN;
    }

    @RequestMapping(value = WebUtil.Mapping.JOIN, method = RequestMethod.POST)
    public ModelAndView join(@Valid SiteUserRegistrationCommand userModel, BindingResult result) {
        if (result.hasErrors()) {
            return ModelViewBuilder.error(WebUtil.View.JOIN, result);
        }
		SiteUser siteUser = userManager.create(userModel);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(siteUser.toString() + " joined to site.");
        }
        return ModelViewBuilder.success(WebUtil.View.HOME);
    }

    @RequestMapping(value = WebUtil.Mapping.USER + WebUtil.Mapping.LIST, method = RequestMethod.GET, produces = WebUtil.JSON)
    public @ResponseBody DataBean usersList() {
        List<SiteUser> allUsers = userManager.findAll();
        return DataBeanBuilder.ok(allUsers.stream()
                .map(user -> mapper.map(user, SiteUserViewModel.class))
                .collect(Collectors.toList()));
    }
}
