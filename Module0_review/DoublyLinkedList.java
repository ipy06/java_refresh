/** A basic doubly linked list implementation. */
public class DoublyLinkedList<E> {

    // -------------- nested Node class --------------
        private static class Node<E> {
            private E element;             // reference to the element stored at this node
            private Node<E> prev;          // reference to the previous node in the list
            private Node<E> next;          // reference to the subsequent node in the list
    
            public Node(E e, Node<E> p, Node<E> n) {
                element = e;
                prev = p;
                next = n;
            }
    
            public E getElement() { return element; }
            public Node<E> getPrev() { return prev; }
            public Node<E> getNext() { return next; }
            public void setPrev(Node<E> p) { prev = p; }
            public void setNext(Node<E> n) { next = n; }
        }
    // -------------- end of nested Node class --------------

    private Node<E> header;          // header sentinel
    private Node<E> trailer;         // trailer sentinel
    private int size = 0;            // number of elements in the list

    /** Construct a new empty list */
    public DoublyLinkedList() {
        header = new Node<>(null, null, null); // create header
        trailer = new Node<>(null, header, null); // create trailer
        header.setNext(trailer); // link header to trailer
    }

    /** Returns the number of elements in the linked list */
    public int size() { return size; }

    /** Check if the list is empty */
    public boolean isEmpty() { return size == 0; }

    /** Return but does not remove the first element of the linked list */
    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement(); // first element is beyond the header
    }

    /** Returns but does not remove the last element of the linked list */
    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement(); // last element is before the trailer
    }



    // Public update methods 
    /** Adds element e to the front of the list. */
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());        // place after trailer
    }

    /** Adds element e to the end of the list. */
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);      // place before trailer
    }

    /** Removes and returns the first element of the list. */
    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    /** Removes and returns the last element of the list */
    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    // Private update methods
    /** Adds element e to the linked list in between the given nodes. */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<E>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    /** Removes the given node from the list and returns its element. */
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
}
// --- End of DoublyLinkedList class ---