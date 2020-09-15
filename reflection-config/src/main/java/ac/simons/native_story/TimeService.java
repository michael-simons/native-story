package ac.simons.native_story;

import java.time.Instant;

public class TimeService {

	private final static Instant STARTED_AT = Instant.now();

	public Instant getStartupTime() {
		return STARTED_AT;
	}
}
