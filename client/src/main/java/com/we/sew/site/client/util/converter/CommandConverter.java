package com.we.sew.site.client.util.converter;

import org.dozer.DozerConverter;

/**
 * @author vladyslav
 */
public abstract class CommandConverter<A, B> extends DozerConverter<A, B> {
	/**
	 * Defines two types, which will take part transformation.
	 * As Dozer supports bi-directional mapping it is not known which of the classes is source and
	 * which is destination. It will be decided in runtime.
	 *
	 * @param prototypeA type one
	 * @param prototypeB type two
	 */
	public CommandConverter(Class<A> prototypeA, Class<B> prototypeB) {
		super(prototypeA, prototypeB);
	}

	@Override
	public A convertFrom(B source, A destination) {
		return null;
	}
}
