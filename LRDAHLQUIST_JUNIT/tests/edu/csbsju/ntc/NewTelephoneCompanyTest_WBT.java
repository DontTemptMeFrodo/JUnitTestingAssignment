package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//
public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	 }

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsNegStart() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsNegStartBoudary() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsOverLimit() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsOverLimitBoundary() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsOverLimitBoundary2() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsPast60() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsPast60Boundary() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsPast60Boundary2() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsNegDurationWithIncorrectST() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsLengthBoundary() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeFailsNegativeDurationBoundary() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testComputeChargeDiscountedStartimeAndDuration1() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double expected = 1768.0;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartimeAndDuration2() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double expected = 1078.48;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartimeAndDuration3() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double expected = 1078.48;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartimeAndDuration4() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double expected = 1149.20;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartime1() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double expected = 1248.00;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartime2() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double expected = 1227.20;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartime3() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double expected = 20.80;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartime4() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double expected = 208.0;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartime5() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double expected = 208.0;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedStartime6() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double expected = 208.0;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedDuration1() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double expected = 2298.40;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeDiscountedDuration2() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double expected = 2156.96;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeNoDiscount1() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double expected = 1664.00;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeNoDiscount2() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double expected = 41.60;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeNoDiscount3() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double expected = 2454.40;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}
	
	@Test
	public void testComputeChargeNoDiscount4() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double expected = 2496.00;
		double actual = ntc.computeCharge();
		assertTrue("The expected output was "+expected+" method returned "+actual, expected==actual);
		
	}

}
