public class StringMap implements SimpleMap{

	MapNode firstNode;

	public String put(int key, String name){
		MapNode currentNode = firstNode;
		//check if key already exists
		if(firstNode != null){
			while(currentNode != null && currentNode.getKey() != key){
				currentNode = currentNode.getNextNode();
			}
			if(currentNode == null){//key not found
				//search for key
				currentNode = firstNode;
				if(currentNode != null){
					while(currentNode.getNextNode() != null){
						currentNode = currentNode.getNextNode();
					}
					//add new node to the end
					MapNode tempNode = new MapNode(key,name);
					currentNode.setNextNode(tempNode);
				}

			}
		}else{
			firstNode = new MapNode(key,name);
			return name;
		}
		return "";
	}


	public String get(int key){
		String result = null;
		MapNode currentNode = firstNode;
		if(currentNode != null){
			while(currentNode != null && currentNode.getKey() != key){
				currentNode = currentNode.getNextNode();
			}
		}
		if(currentNode != null){
			result = currentNode.getName();
		}
		return result;
	}


	public void remove(int key){
		MapNode currentNode = firstNode;
		MapNode previousNode = null;
		if(currentNode != null){
			while(currentNode != null && currentNode.getKey() != key){
				previousNode=currentNode;

				currentNode = currentNode.getNextNode();
				//currentNode is null if not found
			}
		}
		if(currentNode != null){
			MapNode tempNode = currentNode.getNextNode();
			if(previousNode !=null){
				previousNode.setNextNode(tempNode);
			}
			if(previousNode == null && currentNode.getNextNode() ==null){
				firstNode=null;
			}else if(previousNode==null){
				firstNode=currentNode.getNextNode();
			}
		}
	}

	public boolean isEmpty(){
		if(firstNode == null){
			return true;
		}else{
			return false;
		}
	}
}
