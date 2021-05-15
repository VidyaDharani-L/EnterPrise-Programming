package com.klu.student.StudentValidation;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sample {

	@Test
	public void test() {
		StudentCheck sc = new StudentCheck();
		assertEquals("You are CSE Student",sc.check(3500));

	}

}
