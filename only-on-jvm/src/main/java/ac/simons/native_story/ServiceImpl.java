package ac.simons.native_story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {

	private final TimeService timeService = new TimeService();

	@Override
	public String sayHelloTo(String name) {
		return "Hello " + name + " from ServiceImpl at " + timeService.getStartupTime();
	}

	@Override
	public String getGreetingFromResource() {
		try (BufferedReader reader = new BufferedReader(
			new InputStreamReader(this.getClass().getResourceAsStream("/content/greeting.txt")))) {

			return reader.lines()
				.collect(Collectors.joining(System.lineSeparator()));
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}
