import static org.junit.Assert.*;

import org.junit.Test;

public class BruteForceJUnits {

	@Test
	public void test() {
		

		BruteForce test1 = new BruteForce();
		assertEquals(239,test1.findMaxSubArray(TestCases.input1));
		assertEquals(77,test1.arrive);
		assertEquals(97,test1.depart);
		
		BruteForce test2 = new BruteForce();
		assertEquals(322,test2.findMaxSubArray(TestCases.input2));
		assertEquals(50,test2.arrive);
		assertEquals(99,test2.depart);
		
		BruteForce test3 = new BruteForce();
		assertEquals(305, test3.findMaxSubArray(TestCases.input3));
		assertEquals(17,test3.arrive);
		assertEquals(39,test3.depart);
		
		BruteForce test4 = new BruteForce();
		assertEquals(271,test4.findMaxSubArray(TestCases.input4));
		assertEquals(60,test4.arrive);
		assertEquals(98,test4.depart);
		
		BruteForce test5 = new BruteForce();
		assertEquals(281,test5.findMaxSubArray(TestCases.input5));
		assertEquals(54,test5.arrive);
		assertEquals(77,test5.depart);
	
		BruteForce test6 = new BruteForce();
		assertEquals(215,test6.findMaxSubArray(TestCases.input6));
		assertEquals(64,test6.arrive);
		assertEquals(99,test6.depart);
		
		BruteForce test7 = new BruteForce();
		assertEquals(207,test7.findMaxSubArray(TestCases.input7));
		assertEquals(38,test7.arrive);
		assertEquals(86,test7.depart);

		BruteForce test8 = new BruteForce();
		assertEquals(309,test8.findMaxSubArray(TestCases.input8));
		assertEquals(3,test8.arrive);
		assertEquals(48,test8.depart);
		
		BruteForce test9 = new BruteForce();
		assertEquals(195,test9.findMaxSubArray(TestCases.input9));
		assertEquals(34,test9.arrive);
		assertEquals(58,test9.depart);
		
		BruteForce test10 = new BruteForce();
		assertEquals(390,test10.findMaxSubArray(TestCases.input10));
		assertEquals(4,test10.arrive);
		assertEquals(45,test10.depart);
		
		BruteForce test11 = new BruteForce();
		assertEquals(0,test11.findMaxSubArray(TestCases.input11));
		assertEquals(-1,test11.arrive);
		assertEquals(0,test11.depart);	
		
		
		///////Experimental Analysis////////////////////////////
		BruteForce testRandom100 = new BruteForce();
		testRandom100.findMaxSubArrayTime(TestCases.input1);
		
		BruteForce testRandom200 = new BruteForce();
		testRandom200.findMaxSubArrayTime(TestCases.random200);
		
		BruteForce testRandome500 = new BruteForce();
		testRandome500.findMaxSubArrayTime(TestCases.random500);
		
		BruteForce testRandome1000 = new BruteForce();
		testRandome1000.findMaxSubArrayTime(TestCases.random1000);
		
		BruteForce testRandome2000 = new BruteForce();
		testRandome2000.findMaxSubArrayTime(TestCases.random2000);
		
		BruteForce testRandome3000 = new BruteForce();
		testRandome3000.findMaxSubArrayTime(TestCases.random3000);
		

		
	}

}
