package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.service.api.ISiteUserManager;
import com.we.sew.site.client.view.model.SiteUserViewModel;
import com.we.sew.site.client.web.WebUtil;
import com.we.sew.site.client.web.model.DataBean;
import com.we.sew.site.client.web.model.DataBeanBuilder;
import com.we.sew.site.client.web.model.ModelViewBuilder;
import com.we.sew.site.core.model.SiteUser;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


/**
 * @author vladyslav
 */
@Controller
@RequestMapping(value = WebUtil.Mapping.PROFILE)
public class ProfileController extends AbstractWebController {

	@Autowired
	private ISiteUserManager siteUserManager;

	@Autowired
	private Mapper mapper;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getProfilePage() {
        return ModelViewBuilder.success(WebUtil.View.PROFILE);
    }

    @RequestMapping(value = WebUtil.Mapping.ID, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody DataBean getSiteUserProfile(@PathVariable String id) {
		SiteUser updatedCurrentUser = siteUserManager.findById(id);
        if (updatedCurrentUser == null) {
            return DataBeanBuilder.ok();
        }
        return DataBeanBuilder.ok(mapper.map(updatedCurrentUser, SiteUserViewModel.class));
	}
}
