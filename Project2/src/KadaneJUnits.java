/*
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class KadaneJUnits {

	@Test
	public void test() {


		KadaneAlgorithm test1 = new KadaneAlgorithm();
		assertEquals(239,test1.findMaxSubArray(TestCases.input1));
		assertEquals(77,test1.arrive);
		assertEquals(97,test1.depart);
		
		KadaneAlgorithm test2 = new KadaneAlgorithm();
		assertEquals(322,test2.findMaxSubArray(TestCases.input2));
		assertEquals(50,test2.arrive);
		assertEquals(99,test2.depart);
		
		KadaneAlgorithm test3 = new KadaneAlgorithm();
		assertEquals(305, test3.findMaxSubArray(TestCases.input3));
		assertEquals(17,test3.arrive);
		assertEquals(39,test3.depart);
		
		KadaneAlgorithm test4 = new KadaneAlgorithm();
		assertEquals(271,test4.findMaxSubArray(TestCases.input4));
		assertEquals(60,test4.arrive);
		assertEquals(98,test4.depart);
		
		KadaneAlgorithm test5 = new KadaneAlgorithm();
		assertEquals(281,test5.findMaxSubArray(TestCases.input5));
		assertEquals(54,test5.arrive);
		assertEquals(77,test5.depart);
	
		KadaneAlgorithm test6 = new KadaneAlgorithm();
		assertEquals(215,test6.findMaxSubArray(TestCases.input6));
		assertEquals(64,test6.arrive);
		assertEquals(99,test6.depart);
		
		KadaneAlgorithm test7 = new KadaneAlgorithm();
		assertEquals(207,test7.findMaxSubArray(TestCases.input7));
		assertEquals(38,test7.arrive);
		assertEquals(86,test7.depart);

		KadaneAlgorithm test8 = new KadaneAlgorithm();
		assertEquals(309,test8.findMaxSubArray(TestCases.input8));
		assertEquals(3,test8.arrive);
		assertEquals(48,test8.depart);
		
		KadaneAlgorithm test9 = new KadaneAlgorithm();
		assertEquals(195,test9.findMaxSubArray(TestCases.input9));
		assertEquals(34,test9.arrive);
		assertEquals(58,test9.depart);
		
		KadaneAlgorithm test10 = new KadaneAlgorithm();
		assertEquals(390,test10.findMaxSubArray(TestCases.input10));
		assertEquals(4,test10.arrive);
		assertEquals(45,test10.depart);
		
		KadaneAlgorithm test11 = new KadaneAlgorithm();
		assertEquals(0,test11.findMaxSubArray(TestCases.input11));
		assertEquals(-1,test11.arrive);
		assertEquals(0,test11.depart);	
		
		///////Experimental Analysis////////////////////////////
		KadaneAlgorithm testRandom100 = new KadaneAlgorithm();
		testRandom100.findMaxSubArrayTime(TestCases.input1);
		
		KadaneAlgorithm testRandom200 = new KadaneAlgorithm();
		testRandom200.findMaxSubArrayTime(TestCases.random200);
		
		KadaneAlgorithm testRandome500 = new KadaneAlgorithm();
		testRandom200.findMaxSubArrayTime(TestCases.random500);
		
		KadaneAlgorithm testRandome1000 = new KadaneAlgorithm();
		testRandom200.findMaxSubArrayTime(TestCases.random1000);
		
		KadaneAlgorithm testRandome2000 = new KadaneAlgorithm();
		testRandome2000.findMaxSubArrayTime(TestCases.random2000);
		
		KadaneAlgorithm testRandome3000 = new KadaneAlgorithm();
		testRandome3000.findMaxSubArrayTime(TestCases.random3000);
			


	}

}
