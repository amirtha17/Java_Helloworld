import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHelloworld {
	
	
	@Test
	public void testResult() {
		Helloworld ob = new Helloworld();
		String output = ob.Result();
		assertEquals("Hello Subhashri",output);
	}

}
