package com.we.sew.site.client.util.converter;

import com.we.sew.site.client.view.command.SiteUserRegistrationCommand;
import com.we.sew.site.core.model.SiteUser;
import org.springframework.util.DigestUtils;

/**
 * @author vladyslav
 */
public class RegistrationBeanConverter extends CommandConverter<SiteUserRegistrationCommand, SiteUser> {
	public RegistrationBeanConverter() {
		super(SiteUserRegistrationCommand.class, SiteUser.class);
	}

	@Override
	public SiteUser convertTo(SiteUserRegistrationCommand source, SiteUser destination) {
		destination = new SiteUser();
		destination.setEmail(source.getEmail());
		destination.setPassword(DigestUtils.md5DigestAsHex(source.getPassword().getBytes()));
		destination.setFirstName(source.getFirstName());
		destination.setLastName(source.getLastName());
		return destination;
	}

}
