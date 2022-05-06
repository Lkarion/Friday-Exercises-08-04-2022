package com.company;

import java.util.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{}));
    }
    public static int findMax(int[] arr){
        if (arr == null) throw new NullPointerException();
        if (arr.length == 0) throw new ArrayIndexOutOfBoundsException();

        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
