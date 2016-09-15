package com.we.sew.site.client.service.api;

import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.core.model.SiteUser;

import java.util.List;

/**
 * @author Vladyslav_Yemelianov
 */
public interface ISiteUserManager {
    SiteUser create(SiteUserRegistrationCommand bean);

	SiteUser check(String email, String password);

    SiteUser findByEmail(String email);

	SiteUser findById(String id);

    List<SiteUser> findAll();
}
