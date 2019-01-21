package module2_generics;

public class Pair<T> {
	
    private T item1, item2;

    public Pair(T item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
            return item1;
    }
    public T getItem2() {
        return item2;
    }
    public void setItem1(T item1) {
        this.item1 = item1;
    }
    public void setItem2(T item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return item1.toString() + "\t" + item2.toString();
    }

    public boolean sameItems() {
        return item1.equals(item2); 
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pair) {
            Pair<Object> pair = (Pair<Object>) o;
            return (
                item1.equals(pair.getItem1()) && item2.equals(pair.getItem2())
            ) || (
                item1.equals(pair.getItem2()) && item2.equals(pair.getItem1())
            );
        }
        return false;
    }
}
