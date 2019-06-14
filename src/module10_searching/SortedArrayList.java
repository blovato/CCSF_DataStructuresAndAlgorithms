
/**
 * A class that implements the ADT sorted list by using an expandable array.
 * Duplicate entries are allowed.
 *
 * @author Frank M. Carrano
 * @version 2.0
 */
public class SortedArrayList<T extends Comparable<? super T>> implements
        SortedListInterface<T> {

    private T[] list; // array of list entries
    private int length; // current number of entries on list
    private static final int DEFAULT_INITIAL_CAPACITY = 25; // initial length of
    // list

    public SortedArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor

    public SortedArrayList(int initialCapacity) {
        length = 0;
        list = (T[]) new Comparable[initialCapacity];
    } // end default constructor

    public boolean contains(T anEntry) {
        // writing this method is a practice/discussion question
        return false;
    } // end contains

    public boolean add(T newEntry) {
        if (isArrayFull()) {
            doubleArray();
        }

        int toIndex, fromIndex;

        // beginning at the end of the array, shift entries to next higher
        // position until proper sorted position for newEntry is found
        for (fromIndex = length - 1, toIndex = fromIndex + 1; (fromIndex >= 0)
                && (newEntry.compareTo(list[fromIndex]) < 0); toIndex--, fromIndex--) {
            list[toIndex] = list[fromIndex];
        } // end for

        list[toIndex] = newEntry;
        length++;
        return true;
    } // end add

    public boolean remove(T anEntry) {
        boolean found = false;

        if (!isEmpty()) {
            int position = getPosition(anEntry);
            if (position >= 0) {
                removeGap(position);
                length--;
                found = true;
            } // end if
        } // end if

        return found;
    } // end remove

    public int getPosition(T anEntry) {
        int position = 1;

        while ((position <= length)
                && (anEntry.compareTo(getEntry(position)) > 0)) {
            position++;
        } // end while

        if ((position > length) || !anEntry.equals(getEntry(position))) {
            position = -position;
        } // end if

        return position;
    } // end getPosition

    // list operations
    public T remove(int givenPosition) {
        T result = null; // return value

        if ((givenPosition >= 1) && (givenPosition <= length)) // test catches
        // empty list
        {
            assert !isEmpty();

            result = list[givenPosition - 1]; // get entry to be removed

            // move subsequent entries towards entry to be removed,
            // unless it is last in list
            if (givenPosition < length) {
                removeGap(givenPosition);
            }

            length--;
        } // end if

        return result; // return reference to removed entry,
        // or null if list is empty
    } // end remove

    public void clear() {
        for (int index = 0; index < length; index++) {
            list[index] = null;
        }

        length = 0; // no need to create a new array
    } // end clear

    public T getEntry(int givenPosition) {
        T result = null; // result to return

        if (givenPosition >= 1 && givenPosition <= length) {
            assert !isEmpty();
            result = list[givenPosition - 1];
        } // end if

        return result;
    } // end getEntry

    public int getLength() {
        return length;
    } // end getLength

    public boolean isEmpty() {
        return length == 0;
    } // end isEmpty

    public boolean isFull() {
        return false;
    } // end isFull

    public void display() {
        // iterative
        for (int index = 0; index < length; ++index) {
            System.out.print(list[index] + " ");
        }
        System.out.println();
    } // end display

    public static <U extends Comparable<U>> SortedArrayList<U> createMergeList(SortedArrayList<U> listA, SortedArrayList<U> listB) {
        SortedArrayList<U> mergedList = new SortedArrayList<U>(listA.getLength() + listB.getLength());

        // YOUR CODE HERE
        return mergedList;
    }

    /**
     * @return true if the array of list entries is full, that is, if the length
     * of the list equals the size of the array.
     */
    private boolean isArrayFull() {
        return length == list.length;
    } // end isArrayFull

    /**
     * Task: Doubles the size of the array of list entries.
     */
    private void doubleArray() {
        T[] oldList = list; // save reference to array of list entries
        int oldSize = oldList.length; // save old max size of array

        list = (T[]) new Comparable[2 * oldSize]; // double size of array

        // copy entries from old array to new, bigger array
        for (int index = 0; index < oldSize; index++) {
            list[index] = oldList[index];
        }
    } // end doubleArray

    /**
     * Task: Shifts entries that are beyond the entry to be removed to the next
     * lower position. Precondition: list is not empty; 1 <= givenPosition <
     * length; length is list�s length before removal.
     */
    private void removeGap(int givenPosition) {
        assert (givenPosition >= 1) && (givenPosition < length);

        // move each entry to next lower position starting at entry after the
        // one removed and continuing until end of array
        int removedIndex = givenPosition - 1;
        int lastIndex = length - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            list[index] = list[index + 1];
        }
    } // end removeGap
} // end SortedLinkedList
