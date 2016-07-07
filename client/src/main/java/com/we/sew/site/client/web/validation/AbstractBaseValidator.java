package com.we.sew.site.client.web.validation;

import javax.validation.ConstraintValidator;
import java.lang.annotation.Annotation;

/**
 * Abstract validator was implemented to store common data for all validator
 * and to not implement redundant {@code initialize} method.
 *
 * @author vladyslav
 */
public abstract class AbstractBaseValidator<A extends Annotation, T> implements ConstraintValidator<A, T> {

	@Override
	public void initialize(A constraintAnnotation) {

	}
}
