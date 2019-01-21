package module2_generics;

public class Trio<T> {
    T first, second, third;

    public Trio(T item) { 
        first = item;
        second = item;
        third = item;
    }
    public Trio(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public T getItem1() {
        return first;
    }
    public void setItem1(T item) {
        first = item;
    }
    
    public T getItem2() {
        return second;
    }
    public void setItem2(T item) {
        second = item;
    }
    
    public T getItem3() {
        return third;
    }
    public void setItem3(T item) {
        third = item;
    }
    
    public int contains(T item) {
        int count = 0;
        if (first.equals(item)) count++;
        if (second.equals(item)) count++;
        if (third.equals(item)) count++;
        return count;
    }

    public boolean hasDuplicates() {
        return (
            first.equals(second) ||
            second.equals(third) ||
            third.equals(first)
        );
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Trio) {
            Trio<Object> otherTrio = (Trio<Object>) o;
            return (
                otherTrio.contains(first) == contains(first) &&
                otherTrio.contains(second) == contains(second) &&
                otherTrio.contains(third) == contains(third)
            );
        }
        return false;
    }
    
    @Override
    public String toString() {
        return first + ", " + second + ", " + third;
    }
}
