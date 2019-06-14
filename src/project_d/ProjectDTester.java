package project_d;

public class ProjectDTester {

    public static void main(String[] args) {

        HeadTailListInterface<Integer> list = new LinkedHeadTailList<>();

        // test isEmpty
        System.out.println("********TESTING ISEMPTY AND EMPTY DISPLAY");
        System.out.println("true\n" + list.isEmpty());
        System.out.println();
        System.out.println("[]");
        list.display();
        System.out.println();

        // test addFront to empty
        System.out.println("\n\n********TESTING ADD TO FRONT");

        list.addFront(2);
        System.out.println("[2]	head=2	tail=2");
        list.display();
        System.out.println();

        // test addFront to singleton
        list.addFront(6);
        System.out.println("[6, 2]	head=6	tail=2");
        list.display();
        System.out.println();

        // test addFront to list with moret han one
        list.addFront(4);
        list.addFront(3);
        System.out.println("[3, 4, 6, 2]	head=3	tail=2");
        list.display();
        System.out.println();

        System.out.println("false\n" + list.isEmpty());
        System.out.println();

        System.out.println("\n\n********TESTING CLEAR");
        // test clear
        list.clear();
        System.out.println("[]");
        list.display();
        System.out.println();

        System.out.println("\n\n********TESTING ADD TO BACK");
        // test addBack to empty
        list.addBack(7);
        System.out.println("[7]	head=7	tail=7");
        list.display();
        System.out.println();

        // test addBack to singleton
        list.addBack(9);
        System.out.println("[7, 9]	head=7	tail=9");
        list.display();
        System.out.println();

        // test addBack to list with  more than one
        list.addBack(10);
        list.addBack(5);
        System.out.println("[7, 9, 10, 5]	head=7	tail=5");
        list.display();
        System.out.println();

        System.out.println("\n\n********TESTING CONTAINS");
        // test contains
        System.out.println("3\n" + list.contains(5));
        System.out.println();
        System.out.println("1\n" + list.contains(9));
        System.out.println();
        System.out.println("0\n" + list.contains(7));
        System.out.println();
        System.out.println("-1\n" + list.contains(4));
        System.out.println();

        System.out.println("\n\n********TESTING SIZE");
        // test size
        list.clear();
        for (int i = 0; i < 30; i++) {
            list.addBack(i);
        }

        System.out.println("30\n" + list.size());
        System.out.println();

        System.out.println("\n********TESTING GET ENTRY");
        // test getEntry
        System.out.println("15\n" + list.getEntry(15));
        System.out.println();
        System.out.println("0\n" + list.getEntry(0));
        System.out.println();
        System.out.println("29\n" + list.getEntry(29));
        System.out.println();
        System.out.println("null\n" + list.getEntry(35));
        System.out.println();
        System.out.println("null\n" + list.getEntry(-1));
        System.out.println();

        System.out.println("\n\n********TESTING REMOVES");
        // test removes from list with more than one element
        System.out.println("0\n" + list.removeFront());
        System.out.println();
        System.out.println("29\n" + list.removeBack());
        System.out.println();
        System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28]	head=1	tail=28");
        list.display();
        System.out.println();
        while (!list.isEmpty()) {
            list.removeBack();
        }
        System.out.println("[]");
        list.display();
        System.out.println();
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);
        while (!list.isEmpty()) {
            list.removeFront();
        }
        System.out.println("[]");
        list.display();
        System.out.println();

        // test removes from empty
        list.clear();
        System.out.println("null\n" + list.removeFront());
        System.out.println();
        System.out.println("null\n" + list.removeBack());
        System.out.println();

        //test removes from singleton
        list.addFront(1);
        list.removeFront();
        System.out.println("[]");
        list.display();
        System.out.println();
        list.addFront(1);
        list.removeBack();
        System.out.println("[]");
        list.display();
        System.out.println();

        // final test of mixed adds and removes
        list.addFront(3);
        list.addBack(2);
        list.addFront(4);
        list.addFront(5);
        list.addBack(3);
        list.addBack(8);
        list.addBack(9);
        list.display();
        System.out.println("[5, 4, 3, 2, 3, 8, 9]\thead=5\ttail=9");
        System.out.println();

        list.removeFront();
        list.removeBack();
        list.display();
        System.out.println("[4, 3, 2, 3, 8]\thead=4\ttail=8");
        System.out.println();

        System.out.println("********TESTING WITH STRINGS");
        HeadTailListInterface<String> wordList = new LinkedHeadTailList<String>();
        wordList.addFront("job!");
        wordList.addFront("Nice");
        wordList.addFront("it!");
        wordList.addFront("did");
        wordList.addFront("You");

        System.out.println("\n\n********TESTING CONTAINS");
        // test contains
        System.out.println("3\n" + wordList.contains("Nice"));
        System.out.println();
        System.out.println("3\n" + wordList.contains(new String("Nice")));
        System.out.println();
        System.out.println("-1\n" + wordList.contains("NICE"));
        System.out.println();
        wordList.display();
        System.out.println("[You, did, it!, Nice, job!]\thead=You\ttail=job!");
        System.out.println();

        /*// UNCOMMENT IF COMPLETING THE EXTRA CREDIT
		System.out.println("\n\n********EXTRA CREDIT");
		LinkedHeadTailList<Integer> listA = new LinkedHeadTailList<Integer>();
		LinkedHeadTailList<Integer> listB = new LinkedHeadTailList<Integer>();

		// both empty lists []
		System.out.println("Comparison result: 0: "+ listA.compareTo(listB)); 
		
		// no mismatched elements found and listA [1] is longer than listB [] 
		listA.addFront(1); 		
		System.out.println("Comparison result: positive number: "+ listA.compareTo(listB)); 
		
		// no mismatched elements found and listA [1] is shorter than listB [1, 2]
		listB.addFront(1);
		listB.addBack(2); 	
		System.out.println("Comparison result: negative number: "+ listA.compareTo(listB)); 
		
		// no mismatched elements found [1, 2], equal length 
		listA.addBack(2); 		
		System.out.println("Comparison result: 0: "+ listA.compareTo(listB));
		
		// for first mismatched element, the listA element [1, 2, 3] is smaller than the listB element [1, 2, 4]
		listA.addBack(3);
		listB.addBack(4); 		
		System.out.println("Comparison result: negative number: "+ listA.compareTo(listB));

		// for first mismatched element, the listA element [1, 2, 6] is larger than the listB element [1, 2, 4] 
		listA.removeBack();
		listA.addBack(6); 		
		System.out.println("Comparison result: positive number: "+ listA.compareTo(listB)); 
		
		// for first mismatched element, the listA element [1, 2, 3, 4, 7] is smaller than the listB element [7]
		listA.clear();
		listB.clear();
		listA.addBack(1);
		listA.addBack(2);
		listA.addBack(3);
		listA.addBack(4);
		listB.addBack(7);
		System.out.println("Comparison result: negative number: "+ listA.compareTo(listB));	
	
		// for first mismatched element, the listA element [7] is larger than the listB element [1, 2, 3, 4, 7]
		listA.clear();
		listB.clear();
		listB.addBack(1);
		listB.addBack(2);
		listB.addBack(3);
		listB.addBack(4);
		listA.addBack(7);
		System.out.println("Comparison result: postitive number: "+ listA.compareTo(listB));	
         */
    }

}
