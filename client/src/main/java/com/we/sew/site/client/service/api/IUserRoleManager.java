package com.we.sew.site.client.service.api;

import com.we.sew.site.core.model.UserRole;

/**
 * @author Vladyslav_Yemelianov
 */
public interface IUserRoleManager {
    UserRole findByName(String name);
}
