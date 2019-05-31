package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;


import logic.Logic;

public class guessTest {
	Logic l;
	
	
	@Before
	public void setUp() {
		l = new Logic();
	}
	
	@Test
	public void winConditionTest() {
		assertEquals("Didn't work"
				,true
				,l.winCondition(10, 10));
		assertNotEquals("Didn't work"
				,true
				,l.winCondition(10, 11));
	}
	
	@Test
	public void higherLowerTest() {
		assertEquals("Higher doesn't work bro"
				,"Lower"
				,l.higherLower(10, 5));
		assertNotEquals("Lower doesn't work bro"
				,"Lower"
				,l.higherLower(5, 10));
	}
}
