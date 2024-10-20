import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook g1, g2, g3;

	@BeforeEach
	void setUp() throws Exception {
		// 1.	In the setUp method of GradebookTester, create 
		// at least two objects of Gradebook to hold 5 scores.  
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50.0);
		g1.addScore(60.0);
		g1.addScore(70.0);
		g1.addScore(80.0);
		g1.addScore(90.0);

	}

	@AfterEach
	void tearDown() throws Exception {
		// 2.	In the teardown method of GradebookTester, set the two objects of Gradebook to null.
		g1 = g2 = null;
	}

	
	@Test
	void testAddScore() {
		assertEquals(5, g1.getScoreSize());

	}

	@Test
	void testSum() {
		assertEquals(350, g1.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(300, g1.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5, g1.getScoreSize());
	}

	@Test
	void testToString() {
		// assertEquals("55.0 75.0 ", g1.toString());
		//assertEquals("50.0 75.0", g1.toString());
		assertTrue(g1.toString().equals("50.0 60.0 70.0 80.0 90.0 "));
		
	}

}
