/*
* Generic implementation of a BST
* K is the data type for the key
* V is the data type for the value
*
* Interfaces in Java have methods signatures but NO implementation.
*
* When a class extends an interface it is obligated to have
* an implementation for the interfaces' method(s).
*
* The Comparable interface: has one method - compareTo
*
* K extends Comparable<K>: the data type K is obligated to implement compareTo
*
*/
public class BST <K extends Comparable<K>, V> {

    // inner class that will ONLY be used inside BST, called a nested class
    private class Node {
        K key; // key is used for searching (e.g. ruid)
        V value; // value that is associated with the key (e.g. student's record)
        private Node left; // link to the left subtree
        private Node right; // link to the right subtree

        public Node (K key, V value) {
            this.key = key;
            this.value = value;
            left = right = null;
        }
    }

    // instance variables of the BST class
    private Node root; // root node of the BST
    private int size; // number of items in the BST

    // Running time for success - how many comparisons
    // Running time is 1 + depth of the node
    // Best-case: searching for the root is 1 comparison
    // Worst-case: searching for a key at the leaf level
    // (tree might be skewed) O(n)
    public V get (K targetKey) {
        Node ptr = root; //pointer used to search for targetKey
        int cmp = 0;//cmp stands for comparable, returns ==0, <0, >0

        while(ptr != null){
            cmp = targetKey.compareTo(ptr.key);
            if (cmp == 0){
                return ptr.value; //found the TargetKey
            } else if (cmp < 0){
                // targetKey < ptr.key => go left
                ptr = ptr.left;
            } else {
                //targetKey > ptr.key => go right
                ptr = ptr.right;
            }
        }
        return null;
    }

    // Insert the pair <key, value> into the BST.
    // If the key is already present, update the value.
    // Running time best-case: O(log n) when the tree is balanced
    // Running time worst-case: O(n) when the tree is skewed
    public void put (K targetKey, V value) {
        Node ptr = root; //pointer used to search for targetKey
        Node prev = null;
        int cmp = 0;//cmp stands for comparable, returns ==0, <0, >0

        //1. Search for TargetKey
        while(ptr != null){
            cmp = targetKey.compareTo(ptr.key);
            if (cmp == 0){
                ptr.value = value; //found the TargetKey, update the value
            } else if (cmp < 0){
                // targetKey < ptr.key => go left
                ptr = ptr.left;
            } else {
                //targetKey > ptr.key => go right
                ptr = ptr.right;
            }
        }

        //2. targetKey is not in the tree, so insert it
        Node node = new Node(targetKey, value);

        //Check if the tree is empty
        if (prev == null){
            //BST is empty
            root = node;
        } else {
            if (cmp > 0){
                //hook it to the right
                prev.right = node;
            }
            else{
                //hook it to the left
                prev.left = node;
            }
        }
        size += 1;
    }

    public static void main (String[] args) {
        BST<Integer, String> example = new BST();
        example.put(47, "47's value");
        example.put(31, "31's value");
        example.put(65, "65's value");
        example.put(50, "50's value");
        example.put(42,"42's value");
        example.put(25,"25's value");
        example.put(37,"37's value");
    }
}