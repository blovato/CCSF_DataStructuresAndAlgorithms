
/**
 * A linked implementation of the ADT list.
 *
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 */
public class LList<T extends Comparable<? super T>> implements ListInterface<T> {

    private Node firstNode; // Reference to first node of chain
    private int numberOfEntries;

    public LList() {
        initializeDataFields();
    } // end default constructor

    public void clear() {
        initializeDataFields();
    } // end clear

    public void add(T newEntry) // OutOfMemoryError possible
    {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            firstNode = newNode;
        } else // Add to end of nonempty list
        {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNextNode(newNode); // Make last node reference new node
        } // end if

        numberOfEntries++;
    } // end add

    public void add(int givenPosition, T newEntry) // OutOfMemoryError possible
    {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1)) {
            Node newNode = new Node(newEntry);
            if (givenPosition == 1) // Case 1
            {
                newNode.setNextNode(firstNode);
                firstNode = newNode;
            } else // Case 2: list is not empty
            { // and givenPosition > 1
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeAfter = nodeBefore.getNextNode();
                newNode.setNextNode(nodeAfter);
                nodeBefore.setNextNode(newNode);
            } // end if
            numberOfEntries++;
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to add operation.");
        }
    } // end add

    public void addAll(T[] items) {
        if (items.length == 0) {
            return;
        }

        Node lastNode = firstNode;
        boolean startedEmpty = isEmpty();
        if (startedEmpty) {
            add(items[0]);
            lastNode = firstNode;
        } else {
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
        }

        for (int i = startedEmpty ? 1 : 0; i < items.length; i++) {
            Node newNode = new Node(items[i]);
            lastNode.next = newNode;
            lastNode = newNode;
            numberOfEntries++;
        }
    }

    public T remove(int givenPosition) {
        T result = null; // Return value
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            // Assertion: !isEmpty()
            if (givenPosition == 1) // Case 1: Remove first entry
            {
                result = firstNode.getData(); // Save entry to be removed
                firstNode = firstNode.getNextNode(); // Remove entry
            } else // Case 2: Not first entry
            {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.getNextNode();
                result = nodeToRemove.getData(); // Save entry to be removed
                Node nodeAfter = nodeToRemove.getNextNode();
                nodeBefore.setNextNode(nodeAfter); // Remove entry
            } // end if
            numberOfEntries--; // Update count
            return result; // Return removed entry
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to remove operation.");
        }
    } // end remove

    public void removeAll(T item) {
        Node zeroNode = new Node(null, firstNode);
        Node currentNode = zeroNode;
        while (currentNode.next != null) {
            if (currentNode.next.data.equals(item)) {
                currentNode.next = currentNode.next.next;
                numberOfEntries--;
            } else {
                currentNode = currentNode.next;
            }
        }
        firstNode = zeroNode.next;
    }

    public T replace(int givenPosition, T newEntry) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            // Assertion: !isEmpty()
            Node desiredNode = getNodeAt(givenPosition);
            T originalEntry = desiredNode.getData();
            desiredNode.setData(newEntry);
            return originalEntry;
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to replace operation.");
        }
    } // end replace

    public T getEntry(int givenPosition) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            // Assertion: !isEmpty()
            return getNodeAt(givenPosition).getData();
        } else {
            throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
        }
    } // end getEntry

    public T[] toArray() {
        // The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Comparable[numberOfEntries];

        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.getData();
            currentNode = currentNode.getNextNode();
            index++;
        } // end while

        return result;
    } // end toArray

    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.getData())) {
                found = true;
            } else {
                currentNode = currentNode.getNextNode();
            }
        } // end while

        return found;
    } // end contains

    public int getLength() {
        return numberOfEntries;
    } // end getLength

    public boolean isEmpty() {
        boolean result;

        if (numberOfEntries == 0) // Or getLength() == 0
        {
            // Assertion: firstNode == null
            result = true;
        } else {
            // Assertion: firstNode != null
            result = false;
        } // end if

        return result;
    } // end isEmpty

    // Initializes the class's data fields to indicate an empty list.
    private void initializeDataFields() {
        firstNode = null;
        numberOfEntries = 0;
    } // end initializeDataFields

    // Returns a reference to the node at a given position.
    // Precondition: The chain is not empty;
    // 1 <= givenPosition <= numberOfEntries.
    private Node getNodeAt(int givenPosition) {
        // Assertion: (firstNode != null) &&
        // (1 <= givenPosition) && (givenPosition <= numberOfEntries)
        Node currentNode = firstNode;

        // Traverse the chain to locate the desired node
        // (skipped if givenPosition is 1)
        for (int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.getNextNode();
        }
        // Assertion: currentNode != null
        return currentNode;
    } // end getNodeAt

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
} // end LList
