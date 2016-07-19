package com.we.sew.site.client.service.api;

import com.we.sew.site.core.model.EntityStatus;

/**
 * @author vladyslav
 */
public interface IEntityStatusManager {
	EntityStatus findOne(String value);
}
