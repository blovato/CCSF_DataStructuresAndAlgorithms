package module3_interfaces;

import java.util.*;

public class Module3 {

    public static void main(String[] args) {
        
        System.out.println("******TESTING QUESTION 39: TESTING IF BAG IS A SET");
        BagInterface<String> wordBag = new ArrayBag<>();
        System.out.println("Bag is set? true: " + isSet(wordBag));
        System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[]");
        System.out.println(Arrays.toString(wordBag.toArray()));
        wordBag.add("hi");
        System.out.println("Bag is set? true: " + isSet(wordBag));
        System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi]");
        System.out.println(Arrays.toString(wordBag.toArray()));
        wordBag.add("HI");
        wordBag.add("hello");
        System.out.println("Bag is set? true: " + isSet(wordBag));
        System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi, HI, hello]");
        System.out.println(Arrays.toString(wordBag.toArray()));
        wordBag.add("hi");
        System.out.println("Bag is set? false: " + isSet(wordBag));
        System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi, HI, hello, hi]");
        System.out.println(Arrays.toString(wordBag.toArray()));


        System.out.println("\n******TESTING QUESTION 41: CREATING SHORT STRING LIST");
        ListInterface<String> wordList = new AList<>();
        wordList.add("ape");
        wordList.add("dog");
        wordList.add("cockroach"); 
        wordList.add("baboon");
        wordList.add("frog");
        wordList.add("spider");
        wordList.add("cat");
        ListInterface<String> shortWordList = createShortWordList(wordList,4);
        System.out.println("The contents of the list should be (in THIS ORDER): \n[ape, dog, cat]");
        System.out.println(Arrays.toString(shortWordList.toArray()));

        System.out.println("\n******TESTING QUESTION 42: FINDING LAST POSITION");
        List<String> itemList = new ArrayList<>();
        itemList.add("adam");
        itemList.add("frank");
        itemList.add("betty");
        itemList.add("sue");
        itemList.add("sam");
        itemList.add("frank");
        itemList.add("sue");
        itemList.add("terry");
        itemList.add("adam");
        itemList.add("frank");
        System.out.println("The index should be: \n9\n" + lastPosition(itemList, "frank"));

        System.out.println("\n******TESTING QUESTION 43: LIST COMPARISON");
        List<Integer> numList1 = new ArrayList<Integer>();
        numList1.add(1);
        numList1.add(3);
        numList1.add(1);
        numList1.add(5);
        numList1.add(7);
        ListInterface<Integer> numList2 = new AList<Integer>();
        System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));		
        numList2.add(1);
        System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));	
        numList2.add(3);
        numList2.add(1);
        numList2.add(5);
        System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));
        numList2.add(7);
        System.out.println("Equivalent should be: \ntrue\n" + equivalentLists(numList1, numList2));
        numList2.add(8);
        System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));
        numList1.add(8);
        numList1.add(10);
        System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));

        System.out.println("\n******TESTING EXTRA CREDIT QUESTION 44: MOVE THE MINIMUM TO THE FRONT");
        List<Integer> numberList = new ArrayList<Integer>();
        prioritizeMinimumValue(numberList);
        System.out.println("The list should contain: \n[]\n" + numberList);
        numberList.add(4);
        prioritizeMinimumValue(numberList);
        System.out.println("The list should contain: \n[4]\n" + numberList);
        numberList.add(3);
        numberList.add(1);
        numberList.add(5);
        numberList.add(7);
        prioritizeMinimumValue(numberList);
        System.out.println("The list should contain: \n[1, 4, 3, 5, 7]\n" + numberList);
        numberList.add(0);
        prioritizeMinimumValue(numberList);
        System.out.println("The list should contain: \n[0, 1, 4, 3, 5, 7]\n" + numberList);
    }

    public static boolean isSet(BagInterface<String> wordBag) {
        boolean isSet = true;
        BagInterface<String> tempBag = new ArrayBag<>();
        while(!wordBag.isEmpty()) {
            String item = wordBag.remove();
            int frequency = wordBag.getFrequencyOf(item) + tempBag.getFrequencyOf(item);
            if (frequency > 0) {
                isSet = false;
            }
            tempBag.add(item);
        }
        while(!tempBag.isEmpty()) {
            wordBag.add(tempBag.remove());
        }
        return isSet;
    }

    public static ListInterface<String> createShortWordList(ListInterface<String> wordList, int length) {
        ListInterface<String> shortList = new AList<>();
        for (int i = 0; i < wordList.getLength(); i++) {
            String word = wordList.getEntry(i + 1);
            if (word.length() < length) {
                shortList.add(word);
            }
        }
        return shortList;
    }

    public static int lastPosition(List<String> wordList, String targetWord) {
        int lastIndex = -1;
        for(int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(targetWord)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static boolean equivalentLists(List<Integer> numberList, ListInterface<Integer> numberListInterface) {
        int numberListSize = numberList.size();
        int numberListInterfaceSize = numberListInterface.getLength();
        if (numberListSize != numberListInterfaceSize) {
            return false;
        }
        for (int i = 0; i < numberListSize; i++) {
            if (Objects.equals(numberList.get(i), numberListInterface.getEntry(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static void prioritizeMinimumValue(List<Integer> numberList) {
        if (numberList.size() <= 1) return;
        Integer currentMin = numberList.get(0);
        for (int i = 1; i < numberList.size(); i++) {
            Integer number = numberList.get(i);
            if (number < currentMin) {
                currentMin = number;
            }
        }
        numberList.remove(numberList.indexOf(currentMin));
        numberList.add(0, currentMin);
    }
}
