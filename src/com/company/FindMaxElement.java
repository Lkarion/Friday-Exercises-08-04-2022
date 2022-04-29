package com.company;

import java.util.Arrays;

public class FindMaxElement {
    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
