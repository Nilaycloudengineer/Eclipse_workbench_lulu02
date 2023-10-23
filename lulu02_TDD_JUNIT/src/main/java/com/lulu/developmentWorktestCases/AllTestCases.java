package com.lulu.developmentWorktestCases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lulu.developmentWork.BusinessLogicProcess;

public class AllTestCases {

	// test case 1
	// expect Vs Actually happening
	@Test
	void testCase1() {

		// BuinessLogic -- create its Objects --> invoke method to be tested
		BusinessLogicProcess blp = new BusinessLogicProcess();
		assertEquals(-1, blp.show());
	}

	// test case 2

	@Test
	void testCase2() {
		BusinessLogicProcess blp = new BusinessLogicProcess();
		assertEquals(7, blp.add()); // Assuming add(int no1, int no2) is a method in BusinessLogicProcess
	}

	// test case 3

	@Test
//	@Disabled
	void testCase3() {
		BusinessLogicProcess blp = new BusinessLogicProcess();
		assertEquals(12, blp.multiply()); // Assuming multiply(int no1, int no2) is a method in BusinessLogicProcess
	}
	
	  @Test
	    void testCase4() {
	        BusinessLogicProcess blp = new BusinessLogicProcess();
	        assertEquals(7.5f, blp.calculateFloat()); // Delta value for float comparison
	    }

	  
	
	  @Test
	    void testCase5() {
		  BusinessLogicProcess blp = new BusinessLogicProcess();

	        // Test when condition is true
	       // Boolean resultTrue = BusinessLogicProcess.blp(true);
	        assertEquals(true,blp.checkBoolean());

	        // Test when condition is false
	        //Boolean resultFalse = BusinessLogicProcess.blp(false);
	        //assertFalse(resultFalse);
	       // assertFalse(false,blp.checkBoolean());
	    }
	  
	  @AfterAll
		void someTaskEnd() {
			System.out.println("All done so well!");
		}
	  


		@BeforeAll
		static void someTaskBefore() {
			System.out.println("All done so well!");
		}

}