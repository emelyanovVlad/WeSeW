package com.we.sew.site.client.service;

import com.we.sew.site.client.service.api.IEntityStatusManager;
import com.we.sew.site.client.util.EntityStatuses;
import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.client.service.api.ISiteUserManager;
import com.we.sew.site.client.service.api.IUserRoleManager;
import com.we.sew.site.client.util.ActiveRoles;
import com.we.sew.site.client.util.adapter.SiteUserAdapter;
import com.we.sew.site.core.model.EntityStatus;
import com.we.sew.site.core.model.SiteUser;
import com.we.sew.site.core.model.UserRole;
import com.we.sew.site.core.repository.SiteUserRepository;
import com.we.sew.site.core.util.filler.CreationTimeEntityInfoFiller;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @author Vladyslav_Yemelianov
 */
@Service
public class SiteUserManager implements ISiteUserManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(SiteUserManager.class);

    @Autowired
    private SiteUserRepository repository;
    @Autowired
    private IUserRoleManager userRoleManager;
	@Autowired
	private IEntityStatusManager statusManager;
	@Autowired
	private Mapper dozerMapper;
    @Autowired
    private CreationTimeEntityInfoFiller creationTimeEntityInfoFiller;

    @Override
    public SiteUser create(SiteUserRegistrationCommand bean) {
		SiteUser adaptedUser = dozerMapper.map(bean, SiteUser.class);
        creationTimeEntityInfoFiller.fill(adaptedUser);
        UserRole clientRole = userRoleManager.findByName(ActiveRoles.CLIENT.toString());
        adaptedUser.setUserRole(clientRole);
		EntityStatus active = statusManager.findOne(EntityStatuses.ACTIVE.toString());
		adaptedUser.setStatus(active);

		SiteUser savedUser = repository.save(adaptedUser);
        LOGGER.debug(adaptedUser.toString() + " was created");
        return savedUser;
    }

	@Override
	public SiteUser check(String email, String password) {
		SiteUser siteUser = repository.findOneByEmail(email);
		if (siteUser == null) {
			return null;
		}
		String hashedPass = DigestUtils.md5DigestAsHex(password.getBytes());
		if (!hashedPass.equals(siteUser.getPassword())) {
			return null;
		}
		return siteUser;
	}

	@Override
    public SiteUser findByEmail(String email) {
        return repository.findOneByEmail(email);
    }

	@Override
	public SiteUser findById(String id) {
		return repository.findOne(id);
	}
}
