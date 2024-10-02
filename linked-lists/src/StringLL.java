//Linked lists are mode up of nodes, which each have:


public class StringLL {
	StringNode front;
	
	public void addFront(String newItem){
		StringNode oldFront = front; //temp var to store old node
		front = new StringNode(); //make new empty node in front
		front.item = newItem; //set item of new node
		front.next = oldFront; //point new node to old front node
	}
	
	public void print(){ //traverse a linked list
		StringNode ptr = front;
			while(ptr != null){
				System.out.println(ptr + " -> ");
				ptr = ptr.next;
			}
	}

	public void addEnd(String str){
		StringNode newNode = new StringNode();
		newNode.item = str;

		//if list is empty, set newNode to head.
		if(front == null){
			front = newNode;
		}

		//if list is not empty, traverse to end and set last node to newNode
		else{
			StringNode ptr = front;
			while(ptr.next != null){
				ptr = ptr.next;
			}
			ptr.next = newNode;
		}
	}

	public void remove(String data){
		if(front.item == data){
			front = front.next;
		}
		else{
			StringNode ptr = front;
			while(ptr.next.item != data && (ptr.next.next != null)){
				ptr = ptr.next;
			}
			ptr.next = ptr.next.next;
		}
	}
}
	