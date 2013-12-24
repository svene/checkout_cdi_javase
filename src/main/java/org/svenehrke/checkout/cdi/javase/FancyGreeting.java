package org.svenehrke.checkout.cdi.javase;


import javax.enterprise.inject.Alternative;

@Alternative
public class FancyGreeting implements Greeting {

	@Override
	public String greet(String name) {
		return "Hello " + name + "!";
	}
}
