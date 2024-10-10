// Generic Node class (circularly linked list node)
// T is a placeholder for the data type.
// Data type is plugged in during compilation time
public class CLLNode<T> {
	T item; // data part of the node
	CLLNode<T> next; // link part of the node
	CLLNode () {
		item = null;
		next = null;
	}
}
	