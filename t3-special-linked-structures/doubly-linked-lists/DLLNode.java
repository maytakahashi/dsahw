// Generic Node class (doubly linked list node)
// T is a placeholder for the data type.
// Data type is plugged in during compilation time
public class DLLNode<T> {
	T item; // data part of the node
	DLLNode<T> next; // link part of the node
	DLLNode<T> prev; // link part of the node
	DLLNode () {
		item = null;
		prev = null;
		next = null;
	}
}
	