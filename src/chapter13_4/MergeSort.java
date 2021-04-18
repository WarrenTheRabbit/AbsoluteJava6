/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_4;

/**
 *
 * @author Miranda and Warren
 */
public class MergeSort {

    protected static void sort(Comparable[] a, int begin, int end) {
        if ((end - begin) >= 1) {
            int splitPoint = split(a, begin, end);
            sort(a, begin, splitPoint);
            sort(a, splitPoint + 1, end);
            join(a, begin, splitPoint, end);
        } else {
            // do nothing.
        }
    }

    private static int split(Comparable[] a, int begin, int end) {
        return ((begin + end) / 2);
    }

    private static void join(Comparable[] a, int begin, int splitPoint, int end) {
        Comparable[] temp;
        int intervalSize = (end - begin + 1);
        temp = new Comparable[intervalSize];
        int nextLeft = begin; // index for first chunk
        int nextRight = splitPoint + 1; // index for second chunk
        int i = 0; // index for temp;

        // Merge till one side is exhausted.
        while ((nextLeft <= splitPoint) && (nextRight <= end)) {
            
            if (a[nextLeft].compareTo(a[nextRight]) < 0) {
                temp[i] = a[nextLeft];
                i++;
                nextLeft++;
            } else {
                temp[i] = a[nextRight];
                i++;
                nextRight++;
            }
        }

        while (nextLeft <= splitPoint) {
            temp[i] = a[nextLeft];
            i++;
            nextLeft++;
        }
        
        while (nextRight <= end) {
            temp[i] = a[nextRight];
            i++; nextRight++;
        }

        for (i = 0; i < intervalSize; i++) {
            a[begin + 1] = temp[i];
        }
    }
}
