package com.simplilearn.ConditionalTesting;

import org.junit.jupiter.api.function.Executable;

public class MyExecutable implements Executable {

	@Override
	public void execute() throws Throwable {
System.out.println("From my executable class");

	}

}
