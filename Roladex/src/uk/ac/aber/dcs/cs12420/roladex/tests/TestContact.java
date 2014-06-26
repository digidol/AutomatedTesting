package uk.ac.aber.dcs.cs12420.roladex.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.aber.dcs.cs12420.roladex.Contact;

public class TestContact {

	@Test
	public void testCreateContact() {
		Contact contact = new Contact();
		assertEquals("Incorrect name", "unknown", contact.getName());
		assertNull("Incorrect value", contact.getPhone()); 
	}
	
	@Test
	public void testCreateContactWithParameters() {
		Contact contact = new Contact("Neil", "1528");
		assertEquals("Incorrect name", "Neil", contact.getName());
		assertEquals("Incorrect value", "1528", contact.getPhone()); 
	}
	
	@Test 
	public void testToStringWithDefaultConstructor() { 
	    Contact contact = new Contact(); 
	    assertEquals("Incorrect value", "unknown  null", contact.toString()); 
	}
	
	@Test 
	public void testToStringWithConstructorWithParameters() { 
	    Contact contact = new Contact("Neil", "1528"); 
	    assertEquals("Incorrect value", "Neil  1528", contact.toString()); 
	}
	
	@Test 
	public void testSetName() { 
		Contact contact = new Contact(); 
		contact.setName("Jim"); 
		
		assertEquals("Invalid name", "Jim", contact.getName());
	}
	
	@Test 
	public void testEqualsContactsWithSameName() { 
		Contact one = new Contact("April", "1234");
		Contact two = new Contact("April", "2222");
		assertTrue("Should be equal", one.equals(two));
	}
	
	@Test 
	public void testEqualsContactsWithDifferentNames() { 
		Contact one = new Contact("April", "1111");
		Contact two = new Contact("Brenda", "1234");
		
		// note, a different version of assertFalse - 
		// the comment parameter is optional on most
		// of the JUnit methods
		assertFalse(one.equals(two)); 
	}
	
	@Test 
	public void testEqualsWithStringNotContact() { 
		Contact contact = new Contact("Neil", "1528"); 
		String s = "Neil";
		assertFalse("Not false", contact.equals(s)); 
	}
	
	@Test 
	public void testEqualsWithNull() { 
		Contact contact = new Contact(); 
		assertFalse("Not false", contact.equals(null)); 
	}
	
	/*@Test 
	public void testReadKeyboard() { 
	    Contact contact = new Contact(); 
	    contact.readKeyboard(); 
	    assertEquals("Neil", contact.getName());
	    assertEquals("1200", contact.getPhone()); 
    }*/
	
	@Test 
	public void testCompareToWithEqualNames() { 
		Contact one = new Contact("April", "1111");
		Contact two = new Contact("April", "1234");
		
		assertEquals(0, one.compareTo(two));
	}
	
	@Test 
	public void testCompareToWithOneLessThanOther() { 
		Contact one = new Contact("April", "1111");
		Contact two = new Contact("Brenda", "1234");
		
		assertTrue(one.compareTo(two) < 0);
	}

	@Test 
	public void testCompareToWithOneGreaterThanOther() { 
		Contact one = new Contact("April", "1111");
		Contact two = new Contact("Brenda", "1234");
		
		assertTrue(two.compareTo(one) > 0);
	}
}




