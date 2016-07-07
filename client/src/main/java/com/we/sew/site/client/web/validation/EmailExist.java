package com.we.sew.site.client.web.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author vladyslav
 */
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailExistValidator.class)
public @interface EmailExist {

	String message() default "Email already exists";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
