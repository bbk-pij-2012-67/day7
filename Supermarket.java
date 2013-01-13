public class Supermarket{
	PersonQueue queue = new ArrayShopperPersonQueue();

	void addPerson(Person person){
		queue.insert(person);
		System.out.println(person.name + " has joined the queue.");

	}

	void servePerson(){
		Person servedPerson = queue.retrieve();
		if(servedPerson != null){
			System.out.println(servedPerson.name + " has been served.");
		}else{
			System.out.println("There is no one left in the queue.");
		}
	}

	public static void main(String[] args){
		Supermarket market = new Supermarket();
		Person carol = new Person();
		carol.name = "Carol White";
		carol.age = 22;
		Person steve = new Person();
		steve.name = "Steven Daley";
		steve.age = 44;
		Person daphne = new Person();
		daphne.name = "Daphne Lunt";
		daphne.age = 32;
		Person maxine = new Person();
		maxine.name = "Maxine Garrington-Miller";
		maxine.age = 89;
		Person irene = new Person();
		irene.name = "Irene White";
		irene.age = 75;

		market.addPerson(carol);
		market.addPerson(steve);
		market.addPerson(daphne);
		market.addPerson(maxine);
		market.addPerson(irene);
		System.out.print("\n");
		for(int c=1;c<10;c++){
			market.servePerson();
		}

	}
}