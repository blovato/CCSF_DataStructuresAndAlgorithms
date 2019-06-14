package project_d;

/**
 *
 * @author Brenten Lovato
 */
public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {
    private Node head, tail;
    private int numberOfEntries;
    
    public LinkedHeadTailList() {
        initializeDataFields();
    }

    public void clear() {
        initializeDataFields();
    }

    private void initializeDataFields() {
        head = null;
        tail = null;
        numberOfEntries = 0;
    }

    public void addFront(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNextNode(head);
            head = newNode;
        }

        numberOfEntries++;
    }

    public void addBack(T newEntry) {
        Node newNode = new Node(newEntry);
        
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
        
        numberOfEntries++;
    }

    public T removeFront() {
        if (isEmpty()) {
            return null;
        } else if (isSingleton()) {
            T removedItem = head.getData();
            initializeDataFields();
            return removedItem;
        } else {
            T removedItem = head.getData();
            head = head.getNextNode();
            numberOfEntries--;
            return removedItem;
        }
    }

    public T removeBack() {
        if (isEmpty()) {
            return null;
        } else if (isSingleton()) {
            T removedItem = head.getData();
            initializeDataFields();
            return removedItem;
        } else {
            T removedItem = tail.getData();
            
            Node currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    tail = currentNode;
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
            
            numberOfEntries--;
            return removedItem;
        }
    }


    public T getEntry(int position) {
        if (isEmpty() || position < 0 || position > numberOfEntries - 1) {
            return null;
        }
        if (position == numberOfEntries - 1) {
            return tail.getData();
        }
 
        Node currentNode = head;
        for (int i = 0; i < position; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.getData();
    }

    public void display() {
        if (!isEmpty()) {
            String result = "[";
            Node currentNode = head;
            while (currentNode != null) {
                result = result + currentNode.getData();
                if (currentNode.next != null) {
                    result += ", ";
                }
                currentNode = currentNode.next;
            }
            result += "]";
            System.out.println(result + "  head=" + head.getData() + " tail=" + tail.getData());
        }
    }

    public int contains(T entry) {
        int count = 0;

        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(entry)) {
                count++;
            }
            currentNode = currentNode.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    
    private boolean isSingleton() {
        return numberOfEntries == 1;
    }

    public int size() {
        return numberOfEntries;
    }
    
    private class Node {

        private T data; // Entry in list
        private Node next; // Link to next node

        private Node(T dataPortion) {
            data = dataPortion;
            next = null;
        } // end constructor

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor

        private T getData() {
            return data;
        } // end getData

        private void setData(T newData) {
            data = newData;
        } // end setData

        private Node getNextNode() {
            return next;
        } // end getNextNode

        private void setNextNode(Node nextNode) {
            next = nextNode;
        } // end setNextNode
    } // end Node
}
