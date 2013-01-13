import org.junit.*;
import static org.junit.Assert.*;

public class SimpleMapTest{

	@Test
	public void testsPut(){
		SimpleMap testMap = new StringMap();

		for (int c=1;c<=10;c++){

			String input = Double.toString(Math.random());
			testMap.put(c,input);
			String output = testMap.get(c);
			assertEquals(output,input);
		}
	}

	@Test
	public void testsIsEmpty(){
		SimpleMap testMap = new StringMap();
		boolean output=true;
		for (int c=1;c<=10;c++){

			String input = Double.toString(Math.random());
			testMap.put(c,input);
		}
		for (int c=1;c<=9;c++){
			testMap.remove(c);
			output = testMap.isEmpty();
			assertFalse(output);
		}
		testMap.remove(10);
		output = testMap.isEmpty();
		assertTrue(output);
	}
}