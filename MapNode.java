public class MapNode{
	private int key;
	private String name;
	private MapNode nextNode;

	public MapNode(int key, String name){
		this.key = key;
		this.name = name;
		nextNode = null;
	}

	public void setKey(int key){
		this.key = key;
	}

	public int getKey(){
		return this.key;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setNextNode(MapNode nextNode){
		this.nextNode = nextNode;
	}

	public MapNode getNextNode(){
		return this.nextNode;
	}
}