package module2_generics;

public class Module2 {
    public static void main(String[] args) {
        Trio<Integer> numberTrio = new Trio<Integer>(3, 4, 5);
        System.out.println(numberTrio);
    }
}
