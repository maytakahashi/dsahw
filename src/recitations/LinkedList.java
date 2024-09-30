package recitations;

public class LinkedList{
    int front;

    public static int findMax(Node node, int currentMax){
        //if no more items to check, end the loop of checking
        if(node.next == null){
            return node.item;
        }
        //findMax returns the bigger number of the two
        //recursively run to check 
        return Math.max(currentMax, findMax(node.next, node.item));
    }

    public static Node reverseList(Node front){
        Node left = null;
        Node right = null;

        LinkedList tempList = new LinkedList();
        for(Node ptr=front; ptr.next!=null;ptr=ptr.next){
            right = ptr.next;
            ptr.next = left;
            left = ptr;
        }  
        return 
    }
}
