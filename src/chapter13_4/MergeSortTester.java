/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_4;

import java.util.Arrays;

/**
 *
 * @author Miranda and Warren
 */
public class MergeSortTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double[] doubles = new Double[] {1d,4d, 6d, 199d, -111d };
        Arrays.stream(doubles).forEach(System.out::println);
        MergeSort.sort(doubles, 0, doubles.length -1);
        System.out.println("After sort:");
        Arrays.stream(doubles).forEach(System.out::println);
    }
    
}
