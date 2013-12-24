package org.svenehrke.checkout.cdi.javase;

public class FancyWelcomeMessage implements WelcomeMessage {
	@Override
	public String greet(final String name) {
		return "Welcome " + name + "!";
	}
}
