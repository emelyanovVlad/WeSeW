package com.we.sew.site.client.service;

import com.we.sew.site.client.service.api.IEntityStatusManager;
import com.we.sew.site.core.model.EntityStatus;
import com.we.sew.site.core.repository.EntityStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vladyslav
 */
@Service
public class EntityStatusManager implements IEntityStatusManager {
	@Autowired
	private EntityStatusRepository entityStatusRepository;

	@Override
	public EntityStatus findOne(String value) {
		return entityStatusRepository.findOneByValue(value);
	}
}
