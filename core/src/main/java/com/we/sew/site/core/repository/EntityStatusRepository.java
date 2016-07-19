package com.we.sew.site.core.repository;

import com.we.sew.site.core.model.EntityStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vladyslav_Yemelianov
 */
@Repository
public interface EntityStatusRepository extends JpaRepository<EntityStatus, Integer> {
	EntityStatus findOneByValue(String value);
}
