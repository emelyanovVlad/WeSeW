package com.we.sew.site.core.repository;

import com.we.sew.site.core.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vladyslav_Yemelianov
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
