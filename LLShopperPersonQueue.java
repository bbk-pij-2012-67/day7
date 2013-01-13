public class LLShopperPersonQueue implements PersonQueue{

	private Person firstPerson;
	public void insert(Person person){
		if(firstPerson != null){	//check if the queue is not empty
			Person currentPerson = firstPerson;
			while(currentPerson.nextPerson != null){
				currentPerson = currentPerson.nextPerson;
		}//check if at the end of the queue
		currentPerson.nextPerson = person;
		person.nextPerson = null;

		}else{
			firstPerson = person;  //if empty, add the first person.
			firstPerson.nextPerson = null;
		}
	}

	public Person retrieve(){
		Person personToGo = firstPerson;
		if(firstPerson != null){
			firstPerson = firstPerson.nextPerson;
		}
		return personToGo;
	}
}


