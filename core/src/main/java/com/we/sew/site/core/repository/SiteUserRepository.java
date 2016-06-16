package com.we.sew.site.core.repository;

import com.we.sew.site.core.model.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vladyslav_Yemelianov
 */
@Repository
public interface SiteUserRepository extends JpaRepository<SiteUser, String> {
    SiteUser findOneByEmail(String email);
}
