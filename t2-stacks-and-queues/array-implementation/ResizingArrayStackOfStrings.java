public class ResizingArrayStackOfStrings {
    
    private String[] s; // data - stack
    private int t;  // number of items in the stack AND also the top of the stack
    
    public ResizingArrayStackOfStrings()   {  
        s = new String[1]; //one array positon 
        t = 0;
    }
    
    public boolean isEmpty() {  
        return t == 0;  
    } 
   
    /* 
     * Avoids overflow by increasing the size of the array
     * Two possibilities: 
     *     a) increase the size of the array by 1 at every push: infeasible as it becomes too expensive ~n^2
     *     b) double the size of the array whenever array is full: ~n [in amortized time analysis O(1)]
     *
     * Running time in terms of array accesses
     * Best case: 
     * Worst case: 
     */
    public void push ( String item ) {  
       
        if ( t == s.length ) {
            // reached capacity, now resize
            resize (s.length + 1 ); // increase size by 1
        }
        s[t] = item;  
        t += 1;
    }  

    // Running time in terms of array accesses (tilde and big-oh): 
    private void resize ( int newCapacity ) {

        // new array with capacity
        String[] copy = new String[newCapacity];

        for ( int i = 0; i < t; i++ ){
            copy[i] = s[i]; // 1 write + 1 read
        }
        // replace old array s with new array copy
        s = copy; // s and copy point to the same array after this line

        // garbage collector will get rid of the old array s
    }
   
    // Running time in terms of array accesses
    // Best case: O(1)
    // Worst case: 
    public String pop() {
        String item = s[t-1]; // Save the item to return to user
        s[t-1] = null;        // Let garbage collector know that there 
                                 // are no references to the item that was just popped
        t -= 1;
        if ( t > 0 && t == s.length/4 ) {
            resize(s.length/2);
        }
        return item;
    }

    


    public static void main(String[] args) {

        // this is the client
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
    }



}
