package com.we.sew.site.client.service;

import com.we.sew.site.client.bean.UserRegistrationBean;
import com.we.sew.site.client.service.api.ISiteUserService;
import com.we.sew.site.core.model.SiteUser;
import com.we.sew.site.core.repository.SiteUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vladyslav_Yemelianov
 */
@Service
public class SiteUserService implements ISiteUserService {

    @Autowired
    private SiteUserRepository repository;

    @Override
    public SiteUser create(UserRegistrationBean bean) {
        return null;
    }
}
