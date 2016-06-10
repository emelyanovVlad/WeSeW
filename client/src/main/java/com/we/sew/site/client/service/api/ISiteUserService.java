package com.we.sew.site.client.service.api;

import com.we.sew.site.client.bean.UserRegistrationBean;
import com.we.sew.site.core.model.SiteUser;

/**
 * @author Vladyslav_Yemelianov
 */
public interface ISiteUserService {
    SiteUser create(UserRegistrationBean bean);
}
