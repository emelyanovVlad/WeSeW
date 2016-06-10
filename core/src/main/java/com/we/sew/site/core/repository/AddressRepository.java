package com.we.sew.site.core.repository;

import com.we.sew.site.core.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vladyslav_Yemelianov
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}