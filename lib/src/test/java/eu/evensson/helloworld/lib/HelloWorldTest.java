package eu.evensson.helloworld.lib;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void testName() throws Exception {
		HelloWorld helloWorld = new HelloWorld();
		assertThat(helloWorld.getString(), is("Hello World!"));
	}
}
