package junit.JunitMyql;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestJUnit {
	
	String msg = "gaurang is here";
	DataUtil du = new DataUtil();
	
	
	@Test
	public void testGetMessage() {
		du.viewSomeData();
		assertTrue(true);
		//fail();
	}
}

