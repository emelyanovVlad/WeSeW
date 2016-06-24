package com.we.sew.site.client.service;

import com.we.sew.site.client.bean.UserRegistrationModel;
import com.we.sew.site.client.service.api.ISiteUserService;
import com.we.sew.site.client.service.api.IUserRoleService;
import com.we.sew.site.client.util.ActiveRoles;
import com.we.sew.site.client.util.adapter.SiteUserAdapter;
import com.we.sew.site.core.model.SiteUser;
import com.we.sew.site.core.model.UserRole;
import com.we.sew.site.core.repository.SiteUserRepository;
import com.we.sew.site.core.util.filler.CreationTimeEntityInfoFiller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Vladyslav_Yemelianov
 */
@Service
public class SiteUserService implements ISiteUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SiteUserService.class);

    @Autowired
    private SiteUserRepository repository;
    @Autowired
    private IUserRoleService userRoleService;
    @Autowired
    private SiteUserAdapter userAdapter;
    @Autowired
    private CreationTimeEntityInfoFiller creationTimeEntityInfoFiller;

    @Override
    public SiteUser create(UserRegistrationModel bean) {
        SiteUser adaptedUser = userAdapter.adapt(bean);
        creationTimeEntityInfoFiller.fill(adaptedUser);
        UserRole clientRole = userRoleService.findByName(ActiveRoles.CLIENT.toString());
        adaptedUser.setUserRole(clientRole);
        adaptedUser.setId(UUID.randomUUID().toString());

        SiteUser savedUser = repository.save(adaptedUser);
        LOGGER.debug(adaptedUser.toString() + " was created");
        return savedUser;
    }

    @Override
    public SiteUser findByEmail(String email) {
        return repository.findOneByEmail(email);
    }
}
