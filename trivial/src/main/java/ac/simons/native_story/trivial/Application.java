package ac.simons.native_story.trivial;

public class Application {

	public static void main(String... args) {

		System.out.println("Hello, " + (args.length == 0 ? "User" : args[0]));
	}
}
