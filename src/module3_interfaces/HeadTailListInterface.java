package module3_interfaces;

/**
 * An interface that describes a zero indexed list of
 * elements that can only be modified at the head or tail.
 * @author brentenlovato
 * @param <T> The type of entries in this list.
 */
public interface HeadTailListInterface<T> {
    
    /**
     * Adds a new entry to the front of the list.
     * @param newEntry The object to be added as a new entry.
     * @throws ClassCastException if the type of the new entry
     *         is incompatible with this list
     */
    void addFront(T newEntry);
    
    /**
     * Adds a new entry to the front of the list.
     * @param newEntry The object to be added as a new entry.
     * @throws ClassCastException if the type of the new entry
     *         is incompatible with this list
     */
    void addBack(T newEntry);

    /**
     * Removes an entry from the front of the list.
     * @return The object removed from the list.
     * @throws IndexOutOfBoundsException if the list empty.
     */
    T removeFront();
    
    /**
     * Removes an entry from the back of the list.
     * @return The object removed from the list.
     * @throws IndexOutOfBoundsException if the list is empty.
     */
    T removeBack();
    
    /**
     * Fetches the object at the specified position in the list.
     * @param position An integer that represents the position in
     * the array to get the object from.
     * @return The object at the specified position in the list.
     * @throws IndexOutOfBoundsException if the specified position
     *         is out of range.
     */
    T getEntry(int position);
    
    /**
     * Prints out the current list's values or nothing if empty.
     */
    void display();
    
    /**
     * Checks if the list contains a specified element.
     * @param entry The object to find.
     * @return True if the entry is found, or false if not.
     */
    boolean contains (T entry);
    
    /**
     * Checks if the list has one or more elements.
     * @return True if the list has one or more elements,
     *         or false otherwise.
     */
    boolean isEmpty();
    
    /**
     * Gets the number of elements currently in the list.
     * @return The number of elements currently in the list.
     */
    int size();
    
    /**
     * Removes all elements from the list.
     */
    void clear();
}
