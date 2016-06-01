package eu.evensson.helloworld.main;

import eu.evensson.helloworld.lib.HelloWorld;

public class Main {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		String output = helloWorld.getString();
		System.out.println(output);
	}
}
