import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddressBookTest {
	private BuddyInfo buddy1 = null, buddy2 = null;
	private AddressBook book = null;
	@Before
	public void setUp() throws Exception {
		book = new AddressBook("The AddressBook");
		buddy1 = new BuddyInfo("Bob","123 Street St.","123 456 7890",18,"Hi");
		buddy2 = new BuddyInfo("Clair","124 Street St.","123 456 7891",17,"Shut up Dad");
	}

	@Test
	public void testSize() {
		assertEquals("Book should be empty",0,book.size());
		book.addBuddy(buddy1);
		assertEquals("Book should have 1 buddy",1,book.size());
		book.addBuddy(buddy2);
		assertEquals("Book should have 2 buddies",2,book.size());
	}

	@Test
	public void testClear() {
		book.clear();
		assertEquals("Book should be clear",0,book.size());
	}

}
