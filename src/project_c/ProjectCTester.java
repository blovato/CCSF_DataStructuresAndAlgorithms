package project_c;


public class ProjectCTester {

    public static void main(String[] args) {
        ArrayHeadTailList<Integer> intList = new ArrayHeadTailList<>(2);
        intList.addFront(1);
        intList.addFront(2);
        intList.addFront(3);
        intList.addFront(4);
        intList.addFront(4);
        intList.addFront(5);
        intList.display();
        System.out.println(intList.contains(5));
        
        intList.removeFront();
        intList.removeFront();
        intList.removeFront();
        intList.removeFront();
        intList.removeFront();
        intList.removeFront();
        intList.display();
    }

}
