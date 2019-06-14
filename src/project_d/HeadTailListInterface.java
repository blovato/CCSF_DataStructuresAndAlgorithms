package project_d;

/**
 * An interface that describes a zero indexed list of generic elements that can
 * only be modified at the head or tail.
 *
 * @author Hieu Le
 * @author Yoela Zauderer
 * @author Brenton Lovato
 * @version 1.0
 */
public interface HeadTailListInterface<T> {

    /**
     * Add the entry to the front of this list. Entries currently in this list
     * are all moved up by one position. This list's size is increased by 1.
     *
     * @param newEntry The object to be added as a new entry.
     */
    public void addFront(T newEntry);

    /**
     * Add the entry to the back of this list. Entries currently in this list
     * are unaffected. This list's size is increased by 1.
     *
     * @param newEntry The object to be added as a new entry.
     */
    public void addBack(T newEntry);

    /**
     * Remove an item from the front of this list Entries currently in this list
     * are all moved down by one position.
     *
     * @return Either the removed entry at the front of this list, if the
     * removal. was successful, or null if this list is empty.
     */
    public T removeFront();

    /**
     * Remove an item at the back of this list, if possible Entries currently in
     * this list are unaffected.
     *
     * @return Either the removed entry from the back of this list, if the
     * removal. was successful, or null if this list is empty.
     */
    public T removeBack();

    /**
     * Return an entry at a specified position
     *
     * @param position An integer that represents the position of the entry
     * @return Either the entry at the specified position, if the position is
     * valid and null otherwise
     * @throws IndexOutOfBoundsException if either position less than 0 or
     * position is greater than size() - 1
     */
    public T getEntry(int position);

    /**
     * Display the entire list by printing out the content of this list
     * separated by commas in the order in which they occur in this list, or
     * nothing if list empty
     */
    public void display();

    /**
     * Counts the number of times a given entry appears in this list.
     *
     * @param entry The object entry to be counted.
     * @return The number of times the entry appears in this list.
     */
    public int contains(T entry);

    /**
     * Test if this list has one or more elements.
     *
     * @return True if this list is empty, and false if not.
     */
    public boolean isEmpty();

    /**
     * Return the number of elements currently in this list.
     *
     * @return The integer number of entries currently in this list.
     */
    public int size();

    /**
     * Removes all entries from this list.
     */
    public void clear();
} // end HeadTailListInterface
