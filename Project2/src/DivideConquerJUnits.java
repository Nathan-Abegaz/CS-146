import static org.junit.Assert.*;

import org.junit.Test;

public class DivideConquerJUnits {

	@Test
	public void test() {

		DivideConquer test1 = new DivideConquer();
		assertEquals(239, test1.findMaxSubArray(TestCases.input1, 0, TestCases.input1.length - 1));


		DivideConquer test2 = new DivideConquer();
		assertEquals(322, test2.findMaxSubArray(TestCases.input2, 0, TestCases.input2.length - 1));

		DivideConquer test3 = new DivideConquer();
		assertEquals(305, test3.findMaxSubArray(TestCases.input3, 0, TestCases.input3.length - 1));


		DivideConquer test4 = new DivideConquer();
		assertEquals(271, test4.findMaxSubArray(TestCases.input4, 0, TestCases.input4.length - 1));


		DivideConquer test5 = new DivideConquer();
		assertEquals(281, test5.findMaxSubArray(TestCases.input5, 0, TestCases.input5.length - 1));
;

		DivideConquer test6 = new DivideConquer();
		assertEquals(215, test6.findMaxSubArray(TestCases.input6, 0, TestCases.input6.length - 1));


		DivideConquer test7 = new DivideConquer();
		assertEquals(207, test7.findMaxSubArray(TestCases.input7, 0, TestCases.input7.length - 1));


		DivideConquer test8 = new DivideConquer();
		assertEquals(309, test8.findMaxSubArray(TestCases.input8, 0, TestCases.input8.length - 1));


		DivideConquer test9 = new DivideConquer();
		assertEquals(195, test9.findMaxSubArray(TestCases.input9, 0, TestCases.input9.length - 1));

		DivideConquer test10 = new DivideConquer();
		assertEquals(390, test10.findMaxSubArray(TestCases.input10, 0, TestCases.input10.length - 1));


		DivideConquer test11 = new DivideConquer();
		assertEquals(0, test11.findMaxSubArray(TestCases.input11, 0, TestCases.input11.length - 1));


		

		///////Experimental Analysis////////////////////////////
		DivideConquer testRandom100 = new DivideConquer();
		testRandom100.findMaxSubArrayTime(TestCases.input1, 0, TestCases.input1.length - 1);
		
		DivideConquer testRandom200 = new DivideConquer();
		testRandom200.findMaxSubArrayTime(TestCases.random200, 0, TestCases.random200.length - 1);
		
		DivideConquer testRandome500 = new DivideConquer();
		testRandom200.findMaxSubArrayTime(TestCases.random500, 0, TestCases.random500.length - 1);
		
		DivideConquer testRandome1000 = new DivideConquer();
		testRandom200.findMaxSubArrayTime(TestCases.random1000, 0, TestCases.random1000.length - 1);
		
		DivideConquer testRandome2000 = new DivideConquer();
		testRandome2000.findMaxSubArrayTime(TestCases.random2000, 0, TestCases.random2000.length - 1);
		
		DivideConquer testRandome3000 = new DivideConquer();
		testRandome3000.findMaxSubArrayTime(TestCases.random3000, 0, TestCases.random3000.length - 1);
		
	}
}