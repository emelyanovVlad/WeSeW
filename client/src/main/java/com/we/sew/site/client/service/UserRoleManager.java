package com.we.sew.site.client.service;

import com.we.sew.site.client.service.api.IUserRoleManager;
import com.we.sew.site.core.model.UserRole;
import com.we.sew.site.core.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vladyslav_Yemelianov
 */
@Service
public class UserRoleManager implements IUserRoleManager {
    private static final String PREFIX = "ROLE_";

    @Autowired
    private UserRoleRepository repository;

    @Override
    public UserRole findByName(String name) {
        return repository.findOneByValue(PREFIX + name);
    }
}
