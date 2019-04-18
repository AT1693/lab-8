import static org.junit.Assert.*;

import org.junit.Test;

public class checkaddstrings {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JUnitClass h= new JUnitClass();
		String result=h.addstrings("hello","world");
		assertEquals("helloworld",result);
	}

}