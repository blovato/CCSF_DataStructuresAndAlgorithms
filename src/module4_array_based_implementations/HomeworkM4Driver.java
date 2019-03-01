
import java.util.Arrays;

public class HomeworkM4Driver {

    public static void main(String[] args) {

//        System.out.println("******TESTING QUESTION 21: ARRAYBAG REPLACE");
//        ArrayBag<Integer> numbersBag = new ArrayBag<>();
//        boolean result = numbersBag.replace(1, 2);
//        System.out.println("Result is false: " + result);
//        System.out.println("The bag contains[] \n\t\t" + Arrays.toString(numbersBag.toArray()));
//        numbersBag.add(1);
//        numbersBag.add(2);
//        numbersBag.add(1);
//        numbersBag.add(4);
//        numbersBag.add(3);
//        result = numbersBag.replace(6, 10);
//        System.out.println("Result is false: " + result);
//        System.out.println("The bag contains[1, 2, 1, 4, 3] \n\t\t" + Arrays.toString(numbersBag.toArray()));
//        numbersBag.replace(1, 7);
//        System.out.println("The bag contains (in ANY order) [7, 2, 1, 4, 3] \n\t\t\t\t " + Arrays.toString(numbersBag.toArray()));
//
//        System.out.println("\n\n******TESTING QUESTION 22: ARRAYBAG REMOVE EVERY");
//        numbersBag.add(1);
//        numbersBag.add(1);
//        numbersBag.add(7);
//        System.out.println("RIGHT BEFORE:  " + Arrays.toString(numbersBag.toArray()));
//        int numRemoved = numbersBag.removeEvery(1);
//        System.out.println("Number removed is 3: " + numRemoved);
//        System.out.println("The bag contains (in ANY order) [7, 2, 7, 4, 3]\n\t\t\t\t" + Arrays.toString(numbersBag.toArray()));
//        numRemoved = numbersBag.removeEvery(7);
//        System.out.println("Number removed is 2: " + numRemoved);
//        System.out.println("The bag contains (in ANY order) [3, 2, 4]\n\t\t\t\t" + Arrays.toString(numbersBag.toArray()));
//        numRemoved = numbersBag.removeEvery(8);
//        System.out.println("Number removed is 0: " + numRemoved);
//        System.out.println("The bag contains (in ANY order) [3, 2, 4]\n\t\t\t\t" + Arrays.toString(numbersBag.toArray()));
//
//        System.out.println("\n\n******TESTING QUESTION 23: RESIZABLEARRAYBAG TRIM TO SIZE");
//        ResizableArrayBag<Integer> resizableBag = new ResizableArrayBag<>(20);
//        for (int i = 0; i < 100; i++) {
//            resizableBag.add(i + 1);
//        }
//        System.out.println("The bag contains this many numbers 100: " + resizableBag.getCurrentSize());
//        // NOTE: you need to modify ResizableArrayBag somehow to access and test the length of the array
//        System.out.println("The length of the bag array is 160" + Arrays.toString(resizableBag.toArray()));
//        resizableBag.trimToSize();
//        System.out.println("The length of the bag array is 100" + Arrays.toString(resizableBag.toArray()));
//
//        System.out.println("\n\n******TESTING QUESTION 24: ALIST REMOVE EVERY");
//        AList<Integer> numbersList = new AList<>();
//        numbersList.add(1);
//        numbersList.add(2);
//        numbersList.add(1);
//        numbersList.add(1);
//        numbersList.add(4);
//        numbersList.add(3);
//        numbersList.add(7);
//        numbersList.add(1);
//        System.out.println("Starting with: " + Arrays.toString(numbersList.toArray()));
//
//        numbersList.removeEvery(1);
//        System.out.println("Number removed is 4: " + numRemoved);
//        System.out.println("After removing 1s - The list contains \n[2, 4, 3, 7]\n" + Arrays.toString(numbersList.toArray()));
//        numRemoved = numbersList.removeEvery(7);
//        System.out.println("Number removed is 1: " + numRemoved);
//        System.out.println("After removing 7s The list contains \n[2, 4, 3]\n" + Arrays.toString(numbersList.toArray()));
//        numRemoved = numbersList.removeEvery(8);
//        System.out.println("Number removed is 0: " + numRemoved);
//        System.out.println("Afgter removing 8s - The list contains \n[2, 4, 3]\n" + Arrays.toString(numbersList.toArray()));
//        numbersBag.clear();
//        numbersBag.add(1);
//        numbersBag.add(1);
//        numbersBag.add(1);
//        numbersBag.add(1);
//        numRemoved = numbersBag.removeEvery(1);
//        System.out.println("Number removed is 4: " + numRemoved);
//        System.out.println("The bag contains []\n\t\t\t\t" + Arrays.toString(numbersBag.toArray()));
//
//        System.out.println("\n\n******TESTING QUESTION 25: ALIST EQUALS");
//        AList<String> produceList = new AList<String>();
//        produceList.add("banana");
//        produceList.add("date");
//        produceList.add("grape");
//        produceList.add("eggplant");
//        AList<String> foodList = new AList<String>();
//        foodList.add("banana");
//        foodList.add("date");
//        foodList.add("grape");
//        System.out.println("Result is false: " + produceList.equals(foodList));
//        foodList.add("eggplant");
//        System.out.println("Result is true: " + produceList.equals(foodList));
//        foodList.add("squash");
//        System.out.println("Result is false: " + produceList.equals(foodList));
//        produceList.add("squash");
//        foodList.replace(1, "grape");
//        foodList.replace(3, "banana");
//        System.out.println("Result is false: " + produceList.equals(foodList));
//        System.out.println("The produce list contains \n[banana, date, grape, eggplant, squash] \n" + Arrays.toString(produceList.toArray()));
//        System.out.println("The food list contains \n[grape, date, banana, eggplant, squash] \n" + Arrays.toString(foodList.toArray()));

        /* un-comment this section if doing the extra credit */
 /*
		System.out.println("\n\n******TESTING QUESTION 26 EXTRA CREDIT: ALIST COMPARABLE");	
		System.out.println("\n\n******TESTING QUESTION 26 EXTRA CREDIT: ALIST COMPARABLE");	
		AList<Integer> numberListA = new AList<Integer>();
		numberListA.add(1);
		AList<Integer> numberListB = new AList<Integer>();
		System.out.println("List A is bigger (more elements), result should be positive: " + numberListA.compareTo(numberListB));
		numberListB.add(1);
		numberListB.add(2);
		System.out.println("List A is smaller (fewer elements), result should be negative: " + numberListA.compareTo(numberListB));
		numberListA.add(2);
		System.out.println("List A and List B are the same size and have the same elements, result should be 0: " + numberListA.compareTo(numberListB));
		numberListA.add(3);
		numberListB.add(4);
		System.out.println("List A is smaller (lists are the same size; for the first non-matching element, the a list element is smaller, result should be negative: " + numberListA.compareTo(numberListB));
		numberListB.replace(3,3);
		System.out.println("List A and List B are the same size and have the same elements, result should be 0: " + numberListA.compareTo(numberListB));
		numberListA.add(4);
		numberListB.add(3);
		System.out.println("List A is bigger (lists are the same size; for the first non-matching element, the a list element is bigger, result should be positive: " + numberListA.compareTo(numberListB));

		AList<String> wordListA = new AList<String>();
		wordListA.add("a");
		wordListA.add("b");
		wordListA.add("c");
		AList<String> wordListB = new AList<String>();
		wordListB.add("a");
		wordListB.add("d");
		wordListB.add("c");
		System.out.println("List A is smaller (lists are the same size; for the first non-matching element, the a list element is smaller, result should be negative: " + wordListA.compareTo(wordListB));

         */
 
        BagInterface<Integer> bag = new ArrayBag<>();
        System.out.println("0 = " + countPositives(bag));
        System.out.println(Arrays.toString(bag.toArray()));
        bag.add(1);
        bag.add(-1);
        bag.add(-2);
        System.out.println("1 = " + countPositives(bag));
        System.out.println(Arrays.toString(bag.toArray()));
        bag.add(1);
        System.out.println("2 = " + countPositives(bag));
        System.out.println(Arrays.toString(bag.toArray()));
    }
    
    public static int countPositives(BagInterface<Integer> bag) {
        return countPositivesHelper(bag, 0);
    }
    private static int countPositivesHelper(BagInterface<Integer> bag, int count) {
        if (bag.getCurrentSize() == 0) return count;
        int item = bag.remove();
        if (item >= 0) count++;
        int recursiveReturn = countPositivesHelper(bag, count);
        bag.add(item);
        return recursiveReturn;
    }
}
