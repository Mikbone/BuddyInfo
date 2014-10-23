import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BuddyInfoTest {

	private BuddyInfo buddy1 = null, buddy2 = null, buddy3 = null, buddy4 = null;
	
	@Before
	public void setUp() throws Exception {
		buddy1 = new BuddyInfo("Bob","123 Street St.","123 456 7890",18,"Hi");
		buddy2 = new BuddyInfo("Clair","124 Street St.","123 456 7891",17,"Shut up Dad");
		buddy3 = new BuddyInfo("Bill","124 Street St.","123 456 7891",88,"Get off my damn lawn!");
		buddy4 = new BuddyInfo(buddy1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuddyInfoBuddyInfo() {
		assertEquals("buddy1 should equal buddy4",buddy1,buddy4);
	}

	@Test
	public void testGetName() {
		assertEquals("Name of buddy1 should be Bob.", "Bob", buddy1.getName());
	}

	@Test
	public void testSetName() {
		buddy3.setName("Mikbone");
		assertEquals("Name of buddy3 should be Mikbone","Mikbone",buddy3.getName());
	}

	@Test
	public void testGetGreeting() {
		assertEquals("Greeting of buddy1 should be 'Hi'","Hi",buddy1.getGreeting());
	}

	@Test
	public void testSetGreeting() {
		buddy3.setGreeting("Party on my lawn");
		assertEquals("Greeting of buddy3 should be 'Party on my lawn'","Party on my lawn",buddy3.getGreeting());
	}
	@Test
	public void testGetAge() {
		assertEquals("Age of buddy1 should be 18",18,buddy1.getAge());
	}
	
	@Test
	public void testSetAge() {
		buddy3.setAge(20);
		assertEquals("Age of buddy3 should be 20",20,buddy3.getAge());
	}

	@Test
	public void testIsOver18() {
		assertEquals("buddy1.IsOver18 should be true",true,buddy1.isOver18());
		assertEquals("buddy2.IsOver18 should be false",false,buddy2.isOver18());
	}

}
