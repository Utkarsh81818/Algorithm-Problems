package com.bridgelabz.algorithm;

/**
 * Purpose  - We have to sort the element by using Bubble Sort
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-09-29
 */
public class BubbleSortMain {
    public static void main(String args[]) {
        String arr[] = { "xyz", "pqr", "abc", "qwe", "cba" };
        BubbleSort<String> ob = new BubbleSort<String>();
        ob.bubbleSort(arr);
        System.out.print("Sorted array : ");
        ob.printArray(arr);
    }
}