package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.web.WebUtil;
import com.we.sew.site.core.model.SiteUser;

import javax.servlet.http.HttpSession;

/**
 * @author vladyslav
 */
public abstract class AbstractWebController {

	protected void setLoggedUser(HttpSession session, SiteUser loggedUser) {
		session.setAttribute(WebUtil.Consts.LOGGED_USER, loggedUser);
		session.setAttribute(WebUtil.Consts.LOGGED, true);
	}

	protected SiteUser getLoggedUser(HttpSession session) {
		return (SiteUser) session.getAttribute(WebUtil.Consts.LOGGED_USER);
	}
}
