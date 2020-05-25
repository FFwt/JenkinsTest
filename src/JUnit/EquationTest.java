package JUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JUnit.Equation;
public class EquationTest {
	
	@Before
    public void setUp(){
        System.out.println("≤‚ ‘ø™ º");
    }
    @After
    public void down()
    {
        System.out.println("≤‚ ‘Ω· ¯\n");
    }
    
	@Test
	public void testCalc() {
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
	
	@Test
	public void testCalc3() {
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
	public void testCalc4() {
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
