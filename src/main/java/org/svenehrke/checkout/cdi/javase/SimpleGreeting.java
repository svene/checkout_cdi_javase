package org.svenehrke.checkout.cdi.javase;


import javax.enterprise.inject.Alternative;

@Alternative
public class SimpleGreeting implements Greeting {
	@Override
	public String greet(final String name) {
		return null;
	}
}
