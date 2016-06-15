package com.we.sew.site.core.repository;

import com.we.sew.site.core.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vladyslav_Yemelianov
 */
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    UserRole findOneByValue(String value);
}
