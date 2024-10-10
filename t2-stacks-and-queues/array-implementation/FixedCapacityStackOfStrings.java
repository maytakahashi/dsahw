public class FixedCapacityStackOfStrings {

    private String[] s; // Stack
    private int t;  // number of items on the stack and ALSO the top of the stack
    
    // constructor
    public FixedCapacityStackOfStrings(int capacity)   {  
        s = new String[capacity]; 
        // all positions will be null

        t = 0;
    }
    
    public boolean isEmpty() {  
        return t == 0;  
    } 
   
    // 1.Running time (count array access)? 1 array write O(1)
    // 2.Problems? overflow
    public void push(String item) {  

        if ( t == s.length ) {
            // stack is full => overflow because t is out of the bounds of the array
            // resize: look at ResizingArrayStackOfStrings.java
            return; // cannot add
        }

        s[t] = item; // 1 array write
        t += 1;
    }  
   
    // 1. Running time (count array accesses)? 
    // 2. Problem? Underflow - stack is empty
    // 3. loitering: holding a reference to an object that is no longer needed
    public String pop() {

        if ( isEmpty() ) {
            // what happens if the stack is empty? stack underflow
            // do nothing or throw an exception
            return null;
        }

        t -= 1;
        String item = s[t]; // save the item to return to user
        s[t] = null;        // IMPORTANT to remove the reference to avoid loitering
        return item;
    }


    // CLIENT code
    public static void main(String[] args) {
    }

}
