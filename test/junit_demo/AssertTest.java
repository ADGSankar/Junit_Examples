package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean cond=true;
		assertEquals(1,1);
		assertTrue(cond);
		assertFalse(!cond);
		
	}

}
