package ac.simons.native_story.svm;

import ac.simons.native_story.Service;
import ac.simons.native_story.ServiceImpl;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(className = "ac.simons.native_story.ServiceFactory")
final class Target_ac_simons_native_story_ServiceFactory {

	@Substitute
	private Service getService() {
		return new ServiceImpl();
	}
}

@TargetClass(className = "ac.simons.native_story.Application")
final class Target_ac_simons_native_story_Application {

	@Substitute
	private static String invokeGreetingFromResource(Service service, String theName) {

		return "#" + theName + " on " + service + " should have been called.";
	}
}


class CustomSubstitutions {
}
