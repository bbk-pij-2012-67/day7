import org.junit.*;
import static org.junit.Assert.*;

public class StringStackTest{

	@Test
	public void testsPush(){
		StringStack stack = new PointerStringStack();
		String element = "";
		String output = "";
		for(int c=1;c<=1000;c++){
			element = Double.toString(Math.random());
			stack.push(element);
			output=stack.peek();
			assertTrue(output.equals(element));
		}
	}

	@Test
	public void testsPop(){
		StringStack stack = new PointerStringStack();
		String element = "";
		String output = "";
		String[] list = new String[1000];
		//load strings
		for(int c=0;c<=999;c++){
			element = Double.toString(Math.random());
			stack.push(element);
			list[c] = element;
		}

		//pop strings from stack and test
		for(int c=999;c>=0;c--){
			output = stack.pop();
			assertTrue(output.equals(list[c]));
		}
		output = stack.pop();
		assertEquals(output,null);
	}
}