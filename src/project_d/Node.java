package project_d;


public class Node<T> {

    public T data; // Entry in list
    public Node next; // Link to next node

    public Node(T dataPortion) {
        data = dataPortion;
        next = null;
    } // end constructor

    public Node(T dataPortion, Node nextNode) {
        data = dataPortion;
        next = nextNode;
    } // end constructor

    public T getData() {
        return data;
    } // end getData

    public void setData(T newData) {
        data = newData;
    } // end setData

    public Node getNextNode() {
        return next;
    } // end getNextNode

    public void setNextNode(Node nextNode) {
        next = nextNode;
    } // end setNextNode
} // end Node
