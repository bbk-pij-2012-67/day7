public class MapProg{
	public static void main(String[] args){
		SimpleMap myMap = new StringMap();
		myMap.put(1,"January");
		myMap.put(2, "February");
		myMap.put(3,"March");
		myMap.put(4,"April");
		myMap.put(5,"May");

		System.out.println("String at key 1 is " + myMap.get(1));
		System.out.println("String at key 2 is " + myMap.get(2));
		System.out.println("String at key 3 is " + myMap.get(3));
		System.out.println("String at key 4 is " + myMap.get(4));
		System.out.println("String at key 5 is " + myMap.get(5));

		myMap.remove(3);

		System.out.println("\nString at key 1 is " + myMap.get(1));
		System.out.println("String at key 2 is " + myMap.get(2));
		System.out.println("String at key 3 is " + myMap.get(3));
		System.out.println("String at key 4 is " + myMap.get(4));
		System.out.println("String at key 5 is " + myMap.get(5));
	}
}