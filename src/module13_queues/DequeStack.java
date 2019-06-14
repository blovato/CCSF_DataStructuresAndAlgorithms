package module13_queues;

/**
 *
 * @author brentenlovato
 */
public class DequeStack<T> implements StackInterface<T> {
    private DequeInterface<T> deque;
    
    public DequeStack() {
        deque = new LinkedDeque<>();
    }
    
    public void push(T newEntry) {
        deque.addToBack(newEntry);
    }

    public T pop() {
        return deque.removeBack();
    }

    public T peek() {
        return deque.getBack();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void clear() {
        deque.clear();
    }
}
