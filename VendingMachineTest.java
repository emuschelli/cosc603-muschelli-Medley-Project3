package edu.towson.cis.cosc603.project4.vendingmachine;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 4/10/16 2:11 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/** Declaring necessary test objects for {@link VendingMachine} */
	/** Vending machine items, slotA, slotB, slotC, slotD, and snickers */
	/** Vending machine myMachine and Vending machine exception machineException */

	VendingMachineItem slotD;
	VendingMachine myMachine;
	VendingMachineException machineException;
	VendingMachineItem snickers;	
	Double balance;

	
	/**
	 * 
	 * 
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	@Test
	/**
	 * Testing the addItem() method to see if items can be added to a given slot. 
	 * Setting the slots A, B, C, and D with vending machine item names 
	 * and price values by instantiating the VendingMachineItem class.
	 * 
	 */
	
	public void testAddItem() {
		
		VendingMachine money = new VendingMachine();
		money.balance = 1.00;
		VendingMachineItem mySlotA = new VendingMachineItem("Chips", 1.00);
		String code = "A";
		money.addItem(mySlotA, code);
	}
	
	@Test
	/**
	 * Testing the addItem() method to check for condition when slot is already occupied. 
	 * In this situation, we decided to add an item for slot B to slot A.  The test should
	 * throw an exception for "slot already occupied".
	 *
	 */
	public void testAddItem_SlotOccupied() throws VendingMachineException {
		
		VendingMachine money = new VendingMachine();
		money.balance = 1.00;		
		VendingMachineItem mySlotA = new VendingMachineItem("Chips", 1.00);
		VendingMachineItem mySlotB = new VendingMachineItem("Crackers", 1.00);
		String code = "A";
		money.addItem(mySlotA, code);
		money.addItem(mySlotB, code);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	@Test
	/**
	 * Testing the makePurchase() method to ensure that balance is sufficient
	 * to purchase a given vending machine item.  The test used the assertTrue
	 * assertion to test if a purchase can be made or comparing the boolean
	 * value of "purchase" with assertEquals.
	 * 
	 */
	public void testMakePurchase_Item() {
		
		myMachine.insertMoney(10.00);
		assertTrue(myMachine.makePurchase(VendingMachine.A_CODE));
		
	}
	@Test
	public void testMakePurchase_Item1() {
		
		VendingMachine money = new VendingMachine();
		money.balance = 1.00;
		String code = "B";
		boolean purchase = money.makePurchase(code);
		assertEquals(false, purchase);
		
	}
	@Test
	public void testMakePurchase_Item2() {
			
		VendingMachine money = new VendingMachine();
		money.balance = 1.00;
		String code = "C";
		boolean purchase = money.makePurchase(code);
		assertEquals(false, purchase);
			
	}

	@Test
		public void testMakePurchase_Item3() {
			
		VendingMachine money = new VendingMachine();
		money.balance = 1.00;
		String code = "D";
		boolean purchase = money.makePurchase(code);
		assertEquals(false, purchase);
			
	}
		
	@Test
	public void testMakePurchase_NotNull() {
				
		VendingMachineItem noName = new VendingMachineItem("", 0.00);
		noName = new VendingMachineItem(null,0.00);		
		assertNotNull(noName);
	}

	
	@Test
	/**
	 * Testing to ensure that balance is enough to purchase the vending machine item.
	 * assertNotEquals is the assertion used since the balance wasn't enough to buy "Gum"
	 * if it cost 50 cents and our balance previously was 25 cents.
	 */
	public void testMakePurchase_testBalance() {
		// Test to see if can make a purchase based on the balance
		slotD = new VendingMachineItem("Gum", 0.50);
		balance = 0.25;
		assertNotEquals(0.25, slotD.getPrice(), 0.001);
	}	

	
	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		slotD = new VendingMachineItem("Soda", 4.00);
		
		myMachine = new VendingMachine();
		machineException = new VendingMachineException();
		snickers = new VendingMachineItem ("Snickers", 1.0);
		myMachine.addItem (snickers, VendingMachine.A_CODE);

	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
		slotD = null;
		snickers = null;
		balance = 0.0;
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/10/16 2:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}