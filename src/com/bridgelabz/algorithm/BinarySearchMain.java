package com.bridgelabz.algorithm;

/**
 * Purpose  - Binary Search the Word from Word List.
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-09-29
 */
public class BinarySearchMain {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "utkarsh", "practice" };
        String x = "utkarsh";
        BinarySearch<String> bs = new BinarySearch<String>();
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}