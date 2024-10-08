public class SinglyLinkedList<E> {
     // --- nested Node class ---
     private static class Node<E> {
        private E element;      // current node element
        private Node<E> next;   // reference to the next Node
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n;}
     }
     // --- end of Node class

     private Node<E> head = null;   // head of the list (or null if empty)
     private Node<E> tail = null;   // last node of the list (or null if empty)
     private int size = 0;          //number of nodes in the list
     public SinglyLinkedList() {}   // constructs an initially empty list

     //access methods
     public int size() { return size; }
     public boolean isEmpty() { return size == 0; }
     public E first() {
        if (isEmpty()) return null;
        return head.getElement();
     }
     public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
     }

     public void addFirst(E e) {              // adds element e to the front of the list
        head = new Node<>(e, head);          // create and link a new node
        if (size == 0)
            tail = head;                     // special case: new node becomes tail also
        size++;
    }
    
    public void addLast(E e) {               // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null); // node will eventually be the tail
        if (isEmpty())
            head = newest;                   // special case: previously empty list
        else
            tail.setNext(newest);            // new node after existing tail
        tail = newest;                       // new node becomes the tail
        size++;
    }  

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }
    
}
