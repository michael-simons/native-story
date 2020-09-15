package ac.simons.native_story;

import java.lang.reflect.Method;

public class Application {

	public static void main(String... a) {

		Service service = new ServiceFactory().getService();

		System.out.println(service.sayHelloTo("GraalVM"));
		System.out.println(invokeGreetingFromResource(service, "getGreetingFromResource"));
	}

	static String invokeGreetingFromResource(Service service, String theName) {

		try {
			Method method = Service.class.getMethod(theName);
			return (String) method.invoke(service);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
