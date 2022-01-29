import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(100);
		g1.addScore(86);
		g1.addScore(69);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
	}
	
	@Test
	void addScore() {
		assertTrue(g1.toString().equals("50.0 75.0 100.0 86.0 69.0 "));
		assertEquals(5.0, g1.getScoreSize(), .01);
	}
	
	@Test
	void testSum() {
		assertEquals((50 + 75 + 100 + 86 + 69), g1.sum(), .0001);
	}
	
	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
	}
	
	@Test
	void testFinalScore() {
		assertEquals((75.0 + 100.0 + 86.0 + 69.0), g1.finalScore(), .0001);
	}

}
