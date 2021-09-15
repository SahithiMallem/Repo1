package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	
	public void testAdd() {
		int num1=10;int num2=20;
		assertEquals(30, Main.add(num1, num2));
	}
	@Test
	public void testCompare() {
		int num1=10;int num2=10;
		assertTrue(Main.compare(num1, num2));
	}
	
	@Test
	public void testObjects() {
		Flight flight=new Flight(100, "Hyderabad", "Bombay");
		Flight flight1=new Flight(101, "Banglore", "chennai");
		//Flight flight1=flight;
		//assertEquals(flight, flight1);
		assertEquals("Objects not equal", flight, flight1);
	}
}
