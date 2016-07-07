package com.we.sew.site.client.service.api;

import com.we.sew.site.client.bean.UserRegistrationModel;
import com.we.sew.site.core.model.SiteUser;

/**
 * @author Vladyslav_Yemelianov
 */
public interface ISiteUserManager {
    SiteUser create(UserRegistrationModel bean);

    SiteUser findByEmail(String email);
}
