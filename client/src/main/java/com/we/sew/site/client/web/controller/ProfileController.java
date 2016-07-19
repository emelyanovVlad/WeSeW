package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.web.WebUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vladyslav
 */
@Controller
@RequestMapping(value = WebUtil.Mapping.PROFILE)
public class ProfileController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getSelfProfile() {

	}
}
