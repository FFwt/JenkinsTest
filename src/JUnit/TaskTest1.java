package JUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskTest1 {
	@Before
    public void setUp(){
        System.out.println("≤‚ ‘1ø™ º");
    }
    @After
    public void down()
    {
        System.out.println("≤‚ ‘1Ω· ¯\n");
    }
    
	@Test
	public void testCalc1() {
		float a = 1.0f;
		float b = 2.0f;
		float c = 1.0f;
		float[] expecteds = {-1.0f,-1.0f };
		 float[] results;
		try {
			results = Equation.calc(a, b, c);
			Assert.assertArrayEquals(expecteds, results, 0.0f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCalc2() {
		float a = 1.0f;
		float b = -2.0f;
		float c = 1.0f;
		float[] expecteds = {1.0f,1.0f };
		 float[] results;
		try {
			results = Equation.calc(a, b, c);
			Assert.assertArrayEquals(expecteds, results, 0.0f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}