public class OldFirstShopperPersonQueue implements PersonQueue{

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
		Person oldestPerson = firstPerson;
		if(firstPerson != null){
			Person previousPerson = null;
			Person currentPerson = firstPerson;
			//scan list to find oldest person
			if(firstPerson != null){
				while(currentPerson.nextPerson !=null){
					if(currentPerson.nextPerson.age > oldestPerson.age){
						previousPerson = currentPerson;
						oldestPerson = currentPerson.nextPerson;
					}
					currentPerson = currentPerson.nextPerson;
				}
			}
			if(previousPerson == null){
				firstPerson = oldestPerson.nextPerson;
			}else{
				previousPerson.nextPerson = oldestPerson.nextPerson;
			}
		}
		return oldestPerson;
	}
}


