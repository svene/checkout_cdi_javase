package org.svenehrke.checkout.cdi.javase;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application {

	@Inject
	WelcomeMessage welcomeMessage;

	@Inject
	Greeting greeting;

	public void run() {

		System.out.println(welcomeMessage.greet("Sven"));

		System.out.println(greeting.greet("Sven"));
	}
}
