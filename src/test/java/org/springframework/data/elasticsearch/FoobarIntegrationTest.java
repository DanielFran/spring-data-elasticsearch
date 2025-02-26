package org.springframework.data.elasticsearch;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.elasticsearch.junit.jupiter.SpringIntegrationTest;

/**
 * @author Peter-Josef Meisch
 */
@SpringIntegrationTest
@Foobar
public abstract class FoobarIntegrationTest {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Test
	@DisplayName("should run test")
	void shouldRunTest() {

		int answer = 42;

		assertThat(answer).isEqualTo(42);
	}
}
