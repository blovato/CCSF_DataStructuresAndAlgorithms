package project_c;

import java.util.Arrays;

public class ArrayHeadTailList<T> /* implements HeadTailListInterface<T> */ {
    private T[] listArray;
    private int numberOfElements;

    public ArrayHeadTailList(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Object[capacity];
        listArray = tempList;
        numberOfElements = 0;
    }
    
    private void doubleListSize() {
        T[] doubledListArray = (T[]) new Object[listArray.length * 2];
        for (int i = 0; i < numberOfElements; i++) {
            doubledListArray[i] = listArray[i];
        }
        listArray = doubledListArray;
    }
    
    public void addFront(T newEntry) {
        if (numberOfElements == listArray.length) doubleListSize();
        for (int i = numberOfElements; i > 0; i--) {
            listArray[i] = listArray[i - 1];
        }
        listArray[0] = newEntry;
        numberOfElements++;
    }

    public T removeFront() {
        if (isEmpty()) return null;
        T firstEntry = listArray[0];
        for (int i = 0; i < numberOfElements; i++) {
            listArray[i] = listArray[i + 1];
        }
        numberOfElements--;
        return firstEntry;
    }

    public int contains(T entry) {
        int count = 0;
        for (int i = 0; i < numberOfElements; i++) {
            if (listArray[i].equals(entry)) count++;
        }
        return count;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }
    
    public void display() {
        System.out.println(Arrays.toString(listArray));
    }

}
