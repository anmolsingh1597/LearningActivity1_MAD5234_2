import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class JunitTester {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testAdd() {
		Calculator la = new Calculator();
		float expectedResult = la.Add(12, 12);
		float result = 24;
		String str = "Junit is working fine"; 
		assertEquals("Junit is working fine", str);
		assertEquals(expectedResult, result,0.0);
	}
}
