package org.svenehrke.checkout.cdi.javase;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application {

	@Inject
	SomeOtherBean someOtherBean;


	public void run() {
		System.out.println("-> Application.run");
		someOtherBean.sayHello();
	}
}
