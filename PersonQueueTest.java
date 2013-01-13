import org.junit.*;
import static org.junit.Assert.*;

public class PersonQueueTest{

	@Test
	public void testInsert(){
		PersonQueue queue = new ArrayShopperPersonQueue();

		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		queue.insert(person1);
		queue.insert(person2);
		queue.insert(person3);
		Person outputPerson1 = queue.retrieve();
		Person outputPerson2 = queue.retrieve();
		Person outputPerson3 = queue.retrieve();

		assertEquals(outputPerson1,person1);
		assertEquals(outputPerson2,person2);
		assertEquals(outputPerson3,person3);
	}
}

