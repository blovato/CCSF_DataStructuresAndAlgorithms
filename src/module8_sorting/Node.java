package module8_sorting;


public class Node<T> {

    public T data; // Entry in list
    public Node<T> next; // Link to next node

    public Node(T dataPortion) {
        data = dataPortion;
        next = null;
    } // end constructor

    public Node(T dataPortion, Node<T> nextNode) {
        data = dataPortion;
        next = nextNode;
    } // end constructor

    public T getData() {
        return data;
    } // end getData

    public void setData(T newData) {
        data = newData;
    } // end setData

    public Node<T> getNextNode() {
        return next;
    } // end getNextNode

    public void setNextNode(Node<T> nextNode) {
        next = nextNode;
    } // end setNextNode
} // end Node
