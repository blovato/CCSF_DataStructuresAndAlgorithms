
import java.util.*;

public class HomeworkM5Driver {

    public static void main(String[] args) {
        Map<String, Integer> numberMap = new HashMap<String, Integer>();
        numberMap.put("A", 1);
        numberMap.put("B", 2);
        numberMap.put("C", 3);
        System.out.println(numberMap.keySet());
        
//
//        System.out.println("******TESTING QUESTION: COUNT DIVISIBLE");
//        Node<Integer> firstNode = new Node<Integer>(Integer.valueOf(3),
//                new Node<Integer>(Integer.valueOf(8),
//                        new Node<Integer>(Integer.valueOf(6),
//                                new Node<Integer>(Integer.valueOf(12)))));
//        // sets up the chain 3 -> 8 -> 6 -> 12
//        System.out.println("Result is 3: " + countDivisibleBy(firstNode, 3));
//
//        firstNode = new Node<Integer>(Integer.valueOf(2),
//                new Node<Integer>(Integer.valueOf(8),
//                        new Node<Integer>(Integer.valueOf(10),
//                                new Node<Integer>(Integer.valueOf(4)))));
//        // sets up the chain 2 -> 8 -> 10 -> 4
//        System.out.println("Result is 0: " + countDivisibleBy(firstNode, 3));
//
//        firstNode = null; // represents an empty chain
//        System.out.println("Result is 0 (without a crash): " + countDivisibleBy(firstNode, 3));
//
//        firstNode = new Node<Integer>(Integer.valueOf(3)); // singleton chain
//        System.out.println("Result is 1: " + countDivisibleBy(firstNode, 3));
//
//        System.out.println("\n******TESTING QUESTION: PRINT EVERY OTHER");
//        firstNode = new Node<Integer>(Integer.valueOf(3),
//                new Node<Integer>(Integer.valueOf(8),
//                        new Node<Integer>(Integer.valueOf(6),
//                                new Node<Integer>(Integer.valueOf(12)))));
//        // sets up the chain 3 -> 8 -> 6 -> 12
//        System.out.println("Should print 3 6");
//        printEveryOther(firstNode);
//
//        firstNode = new Node<Integer>(Integer.valueOf(3),
//                new Node<Integer>(Integer.valueOf(8),
//                        new Node<Integer>(Integer.valueOf(12))));
//        // sets up the chain 3 -> 8 -> 12
//        System.out.println("Should print 3 12");
//        printEveryOther(firstNode);
//
//        firstNode = null;
//        System.out.println("Should print nothing (but not crash)");
//        printEveryOther(firstNode);
//
//        firstNode = new Node<Integer>(Integer.valueOf(3));
//        System.out.println("Should print 3");
//        printEveryOther(firstNode);
//
//        System.out.println("\n******TESTING QUESTION: LinkedBag GET MAX");
//        LinkedBag<Integer> numbersBag = new LinkedBag<Integer>();
//        numbersBag.add(1);
//        numbersBag.add(2);
//        numbersBag.add(1);
//        numbersBag.add(4);
//        numbersBag.add(3);
//        System.out.println("The max in the bag is 4: " + numbersBag.getMax());
//        numbersBag.add(4);
//        System.out.println("The max in the bag is 4: " + numbersBag.getMax());
//        numbersBag.add(5);
//        System.out.println("The max in the bag is 5: " + numbersBag.getMax());
//        numbersBag.clear();
//        System.out.println("Should either print null or throw an exception- but NOT a Null Pointer Exception");
//        System.out.println(numbersBag.getMax());
//        numbersBag.add(1);
//        numbersBag.add(3);
//        numbersBag.add(3);
//        numbersBag.add(6);
//        System.out.println("The max in the bag is 6: " + numbersBag.getMax());
//        System.out.println("The bag still holds 4: " + numbersBag.getCurrentSize());
//
//        System.out.println("\n******TESTING QUESTION: LList ADD ALL");
//        LList<String> produceList = new LList<String>();
//        produceList.addAll(new String[]{"peach"});
//        System.out.println("The list contains[peach] \n\t\t " + Arrays.toString(produceList.toArray()));
//        String[] stringArray = {"banana", "date", "grape", "eggplant", "jicama", "grape"};
//        produceList.addAll(stringArray);
//        System.out.println("The list contains[peach, banana, date, grape, eggplant, jicama, grape] \n\t\t "
//                + Arrays.toString(produceList.toArray()));
//        System.out.println("Size is 7: " + produceList.getLength());
//
//        System.out.println("\n******TESTING QUESTION: LList REMOVE ALL");
//        LList<Integer> numberList = new LList<Integer>();
//        System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()));
//        numberList.removeAll(1);
//        System.out.println("After, the list contains[]  \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 0: " + numberList.getLength());
//        numberList.add(1);
//        System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()));
//        numberList.removeAll(1);
//        System.out.println("After, the list contains[]  \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 0: " + numberList.getLength());
//        numberList.add(1);
//        numberList.add(1);
//        numberList.add(1);
//        System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()) + "\tSize is 3: " + numberList.getLength());
//        numberList.removeAll(1);
//        System.out.println("After, the list contains[]  \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 0: " + numberList.getLength());
//        numberList.add(1);
//        numberList.add(1);
//        numberList.add(2);
//        numberList.add(4);
//        numberList.add(1);
//        numberList.add(5);
//        numberList.add(1);
//        System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()));
//        numberList.removeAll(1);
//        System.out.println("After, the list contains[2, 4, 5] \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 3: " + numberList.getLength());
//        numberList.clear();
//        numberList.add(1);
//        numberList.add(1);
//        numberList.add(3);
//        numberList.add(1);
//        numberList.add(1);
//        numberList.add(4);
//        numberList.add(1);
//        numberList.add(5);
//        numberList.add(1);
//        numberList.add(1);
//        System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()));
//        numberList.removeAll(1);
//        System.out.println("After, the list contains[3, 4, 5] \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 3: " + numberList.getLength());
//        System.out.println("Before removing 5, the list contains " + Arrays.toString(numberList.toArray()));
//        numberList.removeAll(5);
//        System.out.println("After, the list contains[3, 4] \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 2: " + numberList.getLength());
//        numberList.add(2, 4);
//        numberList.add(5);
//        System.out.println("Before removing 4, the list contains " + Arrays.toString(numberList.toArray()));
//        numberList.removeAll(4);
//        System.out.println("After, the list contains[3, 5] \n\t\t\t" + Arrays.toString(numberList.toArray()) + "\tSize is 2: " + numberList.getLength());

//        System.out.println("\n******TESTING QUESTION EXTRA CREDIT: DOUBLE NODE PALINDROME");
//        DoubleNode<Integer> n3 = new DoubleNode<Integer>(4);
//        DoubleNode<Integer> n2 = new DoubleNode<Integer>(3);
//        DoubleNode<Integer> n1 = new DoubleNode<Integer>(4);
//        n1.next = n2;
//        n2.next = n3;
//        n2.previous = n1;
//        n3.previous = n2;
//        // sets up the chain 4->3-> 4
//        System.out.println("Should print true: " + isPalindromeDoublyLinkedList(n1, n3));
//
//        DoubleNode<Integer> n4 = new DoubleNode<Integer>(4);
//        n3 = new DoubleNode<Integer>(3);
//        n2 = new DoubleNode<Integer>(3);
//        n1 = new DoubleNode<Integer>(4);
//        n1.next = n2;
//        n2.next = n3;
//        n2.previous = n1;
//        n3.next = n4;
//        n3.previous = n2;
//        n4.previous = n3;
//        // sets up the chain 4->3->-3->4
//        System.out.println("Should print true: " + isPalindromeDoublyLinkedList(n1, n4));
//
//        n4 = new DoubleNode<Integer>(1);
//        n3 = new DoubleNode<Integer>(2);
//        n2 = new DoubleNode<Integer>(3);
//        n1 = new DoubleNode<Integer>(1);
//        n1.next = n2;
//        n2.next = n3;
//        n2.previous = n1;
//        n3.next = n4;
//        n3.previous = n2;
//        n4.previous = n3;
//        // sets up the chain 1->2->-3->1
//        System.out.println("Should print false: " + isPalindromeDoublyLinkedList(n1, n4));
//
//        n4 = new DoubleNode<Integer>(4);
//        n3 = new DoubleNode<Integer>(3);
//        n2 = new DoubleNode<Integer>(4);
//        n1 = new DoubleNode<Integer>(3);
//        n1.next = n2;
//        n2.next = n3;
//        n2.previous = n1;
//        n3.next = n4;
//        n3.previous = n2;
//        n4.previous = n3;
//        // sets up the chain 4->3->-4->3
//        System.out.println("Should print false: " + isPalindromeDoublyLinkedList(n1, n4));
//
//        n1 = new DoubleNode<Integer>(3);
//        // sets up the chain 3
//        System.out.println("Should print true: " + isPalindromeDoublyLinkedList(n1, n1));
//
//        n1 = null;
//        System.out.println("Should print true and not crash: " + isPalindromeDoublyLinkedList(n1, n1));
//        Node<Integer> firstNode = new Node<Integer>(4,
//                new Node<Integer>(6,
//                        new Node<Integer>(5,
//                                new Node<Integer>(3,
//                                        new Node<Integer>(2)))));
//
//        recMethod(firstNode);
        
//        LinkedBag<Integer> numbersBag = new LinkedBag<Integer>();
//        numbersBag.add(1);
//        numbersBag.add(2);
//        numbersBag.add(1);
//        numbersBag.add(4);
//        numbersBag.add(3);
//        
//        System.out.println("2 = " + numbersBag.getFrequencyOf(1));
//        System.out.println("1 = " + numbersBag.getFrequencyOf(4));
//        System.out.println("0 = " + numbersBag.getFrequencyOf(9));

//          ListInterface<Integer> list = new LList<>();
//          list.add(8);
//          list.add(9);
//          list.add(6);
//          list.add(3);
//          list.add(6);
//          list.add(6);
//          System.out.println(recursiveCountMultiples(list, 3));
//          System.out.println(Arrays.toString(list.toArray()));

//          LList<Integer> list = new LList<>();
//          list.insertAfterEvery(1, 2);
//          list.add(2);
//          list.add(2);
//          list.add(2);
//          list.add(2);
//          list.insertAfterEvery(2, 3);
//          System.out.println(Arrays.toString(list.toArray()));
            System.out.println(countMatches(null, 3));
            Node firstNode = new Node<Integer>(3, new Node<Integer>(3, new Node<Integer>(3, new Node<Integer>(3))));
            System.out.println(countMatches(firstNode, 3));
            
    }
    
    public static int countMatches(Node<Integer> node, Integer number) {
        int count = 0;
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.data.equals(number)) count++;
            currentNode = currentNode.next;
        }
        return count;
    }
       
    public static int recursiveCountMultiples(ListInterface<Integer> list, int number) {
        return recursiveCountMultiplesHelper(list, number, 1, 0);
    }
    private static int recursiveCountMultiplesHelper(ListInterface<Integer> list, int number, int currentIndex, int count) {
        if (currentIndex > list.getLength()) return count;
        int item = list.getEntry(currentIndex);
        if (item % number == 0) count++;
        return recursiveCountMultiplesHelper(list, number, currentIndex + 1, count);
    }

    public static void printEveryOther(Node firstNode) {
        boolean shouldPrint = true;
        Node<Integer> currentNode = firstNode;
        while (currentNode != null) {
            if (shouldPrint) {
                System.out.println(currentNode.data);
                shouldPrint = false;
            } else {
                shouldPrint = true;
            }
            currentNode = currentNode.next;
        }
    }

    public static int countDivisibleBy(Node<Integer> firstNode, int divisor) {
        int count = 0;
        Node<Integer> currentNode = firstNode;
        while (currentNode != null) {
            if ((currentNode.data % divisor) == 0) {
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }

    public static boolean isPalindromeDoublyLinkedList(DoubleNode<Integer> firstNode, DoubleNode<Integer> lastNode) {
        DoubleNode currentFrontNode = firstNode;
        DoubleNode currentBackNode = lastNode;
        while (currentFrontNode != null && currentBackNode != null) {
            if (!currentFrontNode.data.equals(currentBackNode.data)) {
                return false;
            }
            currentFrontNode = currentFrontNode.next;
            currentBackNode = currentBackNode.previous;
        }
        return true;
    }

    public static void recMethod(Node<Integer> firstNode) {
        System.out.println("Printing chain");
        if (firstNode.next != null) {
            System.out.println("doubling node");
            firstNode.data *= 2;
            recMethod(firstNode.next.next);
        } else {
            System.out.println("done");
        }
        System.out.println("Printing chain last");
    }
}
