package com.company;

public class Main {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6, 7};
        int arr3[]=addArr(arr1,arr2);
        for (int i:arr3)
        {
            System.out.println(i);
        }
    }

    public static int[] addArr(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            arr3[arr1.length+j]=arr2[j];
        }
        return arr3;
    }
}
