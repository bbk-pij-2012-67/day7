import java.util.Arrays;

public class ArrayShopperPersonQueue implements PersonQueue{

	private Person[] person = new Person[3];

	public ArrayShopperPersonQueue(){
		for(int c=0;c<this.person.length;c++){
			person[c] = null;
		}
	}


	public void insert(Person person){
		//find available space
		int i = 0;
		int freeIndex=0;
		while(i<this.person.length && this.person[i] != null){//scan the length of the array.
			i++;
		}
		if(i <this.person.length && this.person[i] == null){
			freeIndex = i;
		}else if(i == this.person.length){
			Person[] tempPerson = new Person[this.person.length*2];
			tempPerson = Arrays.copyOf(this.person,this.person.length*2);
			freeIndex = this.person.length;
			this.person = tempPerson;
			tempPerson = null;

		}
		this.person[freeIndex] = person;
	}

	public Person retrieve(){
		//remove contents at index 0
		Person firstPerson = this.person[0];
		for(int c = 1;c < this.person.length;c++){
			this.person[c-1] = this.person[c];
		}
		this.person[this.person.length-1] = null;
		return firstPerson;
	}
}


