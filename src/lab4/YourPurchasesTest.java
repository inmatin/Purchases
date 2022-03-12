package lab4;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * File Name: YourPurchasesTest.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 04<br>
 * Date: Feb 14th, 2022<br>
 * <p>
 */

/**
 * Purpose:<br>
 * JUnit Test is a method contained in a class used for testing.<br>  
 * 
 * <p>
 * Class List: {@link YourPurchases}, {@link YourPurchasesTest}
 * 
 * <p>
 * 
 * @author Ishtiaque Matin, ID# 041042199
 * @version Modified: Feb 14th, 2022
 * @since JDK 1.8
 * @see YourPurchases
 * @see YourPurchasesTest
 *
 */

public class YourPurchasesTest {
	private static final double EPSILON = 1E-12;

	/**
	 * methods annotated with the @BeforeClass annotation are executed only once
	 * before running all tests.
	 */
	@BeforeClass
	public static void test() {
		System.out.println("We are starting the test");
	}

	/**
	 * methods annotated with the @BAfterClass annotation are executed only once
	 * after running all tests.
	 */
	@AfterClass
	public static void complete() {
		System.out.println("\nWe have completed the test");
	}

	/**
	 * methods annotated with the @Before annotation are run before each test
	 */
	@Before
	public void startTest() {
		System.out.println("\nTest Started");
	}

	/**
	 * methods annotated with the @After annotation are run after each test
	 */
	@After
	public void finihsTest() {
		System.out.println("Test Completed");
	}

	@Test
	public void twoPurchases() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 0.25;

		/**
		 * Causes this test method to fail if the given two values are not equal to each
		 * other. (For objects, it uses the equals method to compare them.) The first of
		 * the two values is considered to be the result that you expect; the second is
		 * the actual result produced by the class under test.
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 * 
		 */
		try {
			/**
			 * EPSILON used as a tolerance
			 */
			Assert.assertEquals(expected, register.giveChange(), EPSILON);
		} catch (AssertionError e) {
			Assert.fail("Assert Equals Failed");

		}
	}

	// YOUR TASKS ARE STATED HERE:
	// RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR
	// WHILE YOU DEMO, MODIFY THIS TEST CASE SUITE TO SHOW AN EXAMPLE OF AN
	// UNSUCCESSFUL EXECUTION
	// IMPROVE THIS CODE BY ADDING JUST ONE MORE TEST CASE (NOT ALREADY STATED IN
	// THIS CODE)
	// RUN AND DEMO YOUR NEW TEST CASE SUITE

	// ADD NEW TEST CASES HERE!!!
	// USE A DIFFERENT ASSERTION (NOT assertEquals) IN AT LEAST ONE OF YOUR TESTS.

	@Test
	public void assertTrue() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 1;
		

		/**
		 * Causes this test method to fail if the given two is greater than the other is not true.
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 */
		try {
			Assert.assertTrue(expected>register.giveChange());
		} catch (AssertionError e) {
			Assert.fail("Assert True Failed");
		}
	}

	@Test
	public void assertFalse() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 1;

		/**
		 * Causes this test method to fail if the given two is less than the other is not true.
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 */
		try {
			Assert.assertFalse(expected<register.giveChange());
		} catch (AssertionError e) {
			Assert.fail("Assert False Failed");
		}
	}

	@Test
	public void assertNotEquals() {
		YourPurchases register = new YourPurchases();
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.receivePayment(2, 0, 5, 0, 0);
		double expected = 0.40; // should be 0.25

		/**
		 * Causes this test method to fail if the given two values are equal to each
		 * other. (For objects, it uses the equals method to compare them.)
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 */
		try {
			Assert.assertNotEquals(expected, register.giveChange(), EPSILON);
		} catch (AssertionError e) {
			Assert.fail("Assert Not Equals Failed");
		}
	}

	@Test
	public void assertNull() {
		String expected = null;

		/**
		 * Causes this test method to fail if the given value is not null.
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 * 
		 */
		try {
			Assert.assertNull(expected);
		} catch (AssertionError e) {
			Assert.fail("Assert Null Failed");
		}
	}

	@Test
	public void assertNotNull() {
		String expected = "null";

		/**
		 * Causes this test method to fail if the given value is null.
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 * 
		 */
		try {
			Assert.assertNotNull(expected);
		} catch (AssertionError e) {
			Assert.fail("Assert Not Null Failed");
		}
	}

	@Test
	public void assertSame() {
		String number1 = "Happy";
		String number2 = "Happy";

		/**
		 * Identical to assertEquals and assertNotEquals respectively, except that for
		 * objects, it uses the == operator rather than the equals method to compare
		 * them. (The difference is that two objects that have the same state might be
		 * equals to each other, but not == to each other. An object is only == to
		 * itself.)
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 * 
		 */

		try {
			Assert.assertSame(number1, number2);
		} catch (AssertionError e) {
			Assert.fail("Assert Same Failed");
		}
	}

	@Test
	public void assertNotSame() {
		String number1 = "Happy";
		String number2 = "Sad";

		/**
		 * Identical to assertEquals and assertNotEquals respectively, except that for
		 * objects, it uses the == operator rather than the equals method to compare
		 * them. (The difference is that two objects that have the same state might be
		 * equals to each other, but not == to each other. An object is only == to
		 * itself.)
		 * 
		 * @see AssertionError
		 * 
		 * @see Assert.fail - gives the message on which assertion error
		 * 
		 */

		try {
			Assert.assertNotSame(number1, number2);
		} catch (AssertionError e) {
			Assert.fail("Assert Not Same Failed");
		}
	}
}
