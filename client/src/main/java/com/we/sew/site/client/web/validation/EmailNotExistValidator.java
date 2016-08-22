package com.we.sew.site.client.web.validation;

import com.we.sew.site.client.service.api.ISiteUserManager;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidatorContext;

/**
 * @author vladyslav
 */
public class EmailNotExistValidator extends AbstractBaseValidator<EmailNotExist, String> {
	@Autowired
	private ISiteUserManager userService;

	@Override
	public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
		return userService.findByEmail(email) == null;
	}
}
