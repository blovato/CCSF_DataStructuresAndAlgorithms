/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module7_recursion;

import java.util.*;

/**
 *
 * @author brentenlovato
 */
public class HomeworkM7Driver {

    public static void main(String[] args) {
//        int[] numbers2 = {8, 3, 4};
//        printEveryOther(numbers2);
//
//        int[] numbers3 = {8, 3};
//        printEveryOther(numbers3);
//
//        int[] numbers = {};
//        printEveryOther(numbers);
//        String truthy = "assq";
//        System.out.println(qNotFollowedByU(truthy));
//        String falsy = "assqU";
//        System.out.println(qNotFollowedByU(falsy));
//        String empty = "";
//        System.out.println(qNotFollowedByU(empty));

        int[] nums = {1, 2, 3, 4, 5, 6};
        arrayReverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void printEveryOther(int[] nums) {
        if (nums.length > 0) {
            System.out.println(nums[0]);
        }
        if (nums.length >= 2) {
            int[] slicedNums = Arrays.copyOfRange(nums, 2, nums.length);
            if (slicedNums.length > 0) {
                printEveryOther(slicedNums);
            }
        }
    }

    public static int methodA(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return 1 + methodA(n - 1);
        } else {
            return 1 + methodA(n + 1);
        }
    }

    public static int methodB(String s, char c) {
        if (s.length() == 0) {
            return 0;
        } else {
            return (s.charAt(0) == c ? 1 : 0) + methodB(s.substring(1), c);
        }
    }

    public static int countEvens(int[] array) {
        return countEvensHelper(array, 0, array.length);
    }

    private static int countEvensHelper(int[] array, int start, int stop) {
        int count = 0;
        if (start == stop) {
            return count;
        } else {
            if (array[start] % 2 == 0) {
                count = 1 + countEvensHelper(array, start + 1, stop);
            }
            return count;
        }
    }
    
    public static boolean qNotFollowedByU(String word) {
        return qNotFollowedByUHelper(word, 0);
    }
    private static boolean qNotFollowedByUHelper(String word, int start) {
        if (word.length() == 0 || word.length() <= start + 1) {
            return true;
        }
        char currentChar = word.charAt(start);
        char nextChar = word.charAt(start + 1);
        if (
            (currentChar == 'q' || currentChar == 'Q') &&
            (nextChar == 'u' || nextChar == 'U')
        ) {
            return false;    
        }
        return qNotFollowedByUHelper(word, start + 1);
    }
    
    public static void arrayReverse(int[] array) {
        arrayReverseHelper(array, 0, array.length - 1);   
    }
    private static void arrayReverseHelper(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        int tempStartValue = array[startIndex];
        int tempEndValue = array[endIndex];
        array[startIndex] = tempEndValue;
        array[endIndex] = tempStartValue;
        arrayReverseHelper(array, startIndex + 1, endIndex - 1);
    }
}
