package com.nt.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nt.Example;

public class JunitExampleTest {
	
	@Before
	public void beforClass() {
		System.out.println("This Is @Befor");
	}
	
	@Test
	public void testM1() {
		Example example = new Example();
		example.m1(10, 20);
		assertEquals(30, 30);
	}
	
	@After
	public void afterClass() {
		System.out.println("This Is @After");
	}

}
