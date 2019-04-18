import static org.junit.Assert.*;

import org.junit.Test;

public class checkaddnumbers {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JUnitClass h= new JUnitClass();
		int result=h.addnumbers(9, 10);
		assertEquals(19,result);
	}

}