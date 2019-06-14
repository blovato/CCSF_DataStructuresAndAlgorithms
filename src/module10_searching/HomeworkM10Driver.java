
import java.util.*;

public class HomeworkM10Driver {

    public static void main(String[] args) {
        System.out.println("\n***TESTING CONTAINS METHOD");
//         NOTE: you might want to add additional print statements to make sure that your
//         method is "optimized" and takes advantage of the list being sorted!		
        SortedLinkedList<Integer> sortedNumList = new SortedLinkedList<Integer>();
        System.out.println("count of 99 is \t0: " + sortedNumList.countEntries(99));
        sortedNumList.add(4);
        sortedNumList.add(2);
        sortedNumList.add(3);
        sortedNumList.add(3);
        sortedNumList.add(1);
        sortedNumList.add(9);
        sortedNumList.add(3);
        sortedNumList.add(7);
        sortedNumList.add(4);
        sortedNumList.add(9);
        sortedNumList.add(1);
        sortedNumList.display();
        System.out.println("count of 1 is \t2: " + sortedNumList.countEntries(1));
        System.out.println("count of 2 is \t1: " + sortedNumList.countEntries(2));
        System.out.println("count of 3 is \t3: " + sortedNumList.countEntries(3));
        System.out.println("count of 4 is \t2: " + sortedNumList.countEntries(4));
        System.out.println("count of 7 is \t1: " + sortedNumList.countEntries(7));
        System.out.println("count of 9 is \t2: " + sortedNumList.countEntries(9));
        System.out.println("count of -1 is \t0: " + sortedNumList.countEntries(-1));
        System.out.println("count of 5 is \t0: " + sortedNumList.countEntries(5));
        System.out.println("count of 99 is \t0: " + sortedNumList.countEntries(99));
        sortedNumList.display();
        SortedLinkedList<String> sortedWordList = new SortedLinkedList<String>();
        sortedWordList.add("plum");
        sortedWordList.add("apple");
        sortedWordList.add("grapes");
        sortedWordList.add("banana");
        sortedWordList.add("tomato");
        sortedWordList.add("plum");
        sortedWordList.add("tomato");
        sortedWordList.add("pear");
        sortedWordList.display();
        System.out.println("count of apple is \t1: " + sortedWordList.countEntries(new String("apple")));
        System.out.println("count of tomato is \t2: " + sortedWordList.countEntries(new String("tomato")));
        System.out.println("count of carrot is \t0: " + sortedWordList.countEntries(new String("carrot")));
        sortedWordList.display();

        System.out.println("\n***TESTING BINARY SEARCH WTIH NULLS METHOD");
        String[] stringsWithBlanks1 = {"ant", null, null, "ball", null, null, null, "drive", null, null, "food"};
        for (int i = 0; i < stringsWithBlanks1.length; i++) {
            if (stringsWithBlanks1[i] != null) {
                String target = stringsWithBlanks1[i];
                System.out.println(target + " is at \t" + i + ": " + binarySearchWithNulls(stringsWithBlanks1, new String(target)));
            }
        }
        System.out.println("about is at \t-1: " + binarySearchWithNulls(stringsWithBlanks1, "about"));
        System.out.println("car is at \t-1: " + binarySearchWithNulls(stringsWithBlanks1, "car"));
        System.out.println("grove is at \t-1: " + binarySearchWithNulls(stringsWithBlanks1, "grove"));
        String[] stringsWithBlanks2 = {null, null, "mouse", null, null, "pumpkin", null, "yak", null, null, "zebra", null};
        for (int i = 0; i < stringsWithBlanks2.length; i++) {
            if (stringsWithBlanks2[i] != null) {
                String target = stringsWithBlanks2[i];
                System.out.println(target + " is at \t" + i + ": " + binarySearchWithNulls(stringsWithBlanks2, new String(target)));
            }
        }
        System.out.println("amount is at \t-1: " + binarySearchWithNulls(stringsWithBlanks2, "amount"));
        System.out.println("trunk is at \t-1: " + binarySearchWithNulls(stringsWithBlanks2, "trunk"));
        System.out.println("zed is at \t-1: " + binarySearchWithNulls(stringsWithBlanks2, "zed"));
        String[] stringsWithBlanks3 = {null, null, null, null, null};
        System.out.println("axel is at \t-1: " + binarySearchWithNulls(stringsWithBlanks3, "axel"));
        System.out.println("wild is at \t-1: " + binarySearchWithNulls(stringsWithBlanks3, "wild"));
    }

    public static int binarySearchWithNulls(String[] words, String target) {
        // I spent a lot of time trying to search with nulls elegantly:
        // I considered creating an array copy that removed nulls and then
        // binary searching that array, but that would increase time to linear
        return Arrays.binarySearch(words, target);
//        int first = 0;
//        int last = words.length - 1;
//        int index = 0;
//
//        while (first <= last) {
//            int mid = (first + last) / 2;
//            String entry = words[mid];
//            if (entry == null) {
//                int nextNotNullDown = mid;
//                int nextNotNullUp = mid;
//                for (int i = mid; 0 < i; i--) {
//                    if (words[i] != null) {
//                        nextNotNullDown = i;
//                        break;
//                    }
//                }
//                for (int i = mid; i < words.length; i++) {
//                    if (words[i] != null) {
//                        nextNotNullUp = i;
//                        break;
//                    }
//                }
//                if (words[nextNotNullUp].compareTo(target) <= words[nextNotNullDown].compareTo(target)) {
//                    entry = words[nextNotNullUp];
//                    mid = nextNotNullUp;
//                } else {
//                    entry = words[nextNotNullDown];
//                    mid = nextNotNullDown;
//                }
//            }
//            if (entry.equals(target)) {
//                index = mid;
//            } else if (entry.compareTo(target) < 0) {
//                first = mid + 1;
//            } else if (entry.compareTo(target) > 0) {
//                last = mid - 1;
//            }
//        }
//        
//        return index;
    }
}