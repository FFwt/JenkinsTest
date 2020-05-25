package JUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskTest2 {
	@Before
    public void setUp(){
        System.out.println("≤‚ ‘2ø™ º");
    }
    @After
    public void down()
    {
        System.out.println("≤‚ ‘2Ω· ¯\n");
    }
    
	@Test
	public void testCalc1() {
		float a = 1.0f;
		float b = 0.0f;
		float c = -64.0f;
		float[] expecteds = {8.0f,-8.0f };
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
		float a = 4.0f;
		float b = -4.0f;
		float c = 1.0f;
		float[] expecteds = {0.5f,0.5f };
		 float[] results;
		try {
			results = Equation.calc(a, b, c);
			Assert.assertArrayEquals(expecteds, results, 0.0f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

