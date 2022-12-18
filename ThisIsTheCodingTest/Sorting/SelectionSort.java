package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIdx = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minIdx] > arr[j])
                    minIdx = j;
            }

            if(minIdx != i){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    public static void selectionSortReverse(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxIdx = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[maxIdx] < arr[j])
                    maxIdx = j;
            }

            if(maxIdx != i){
                int temp = arr[i];
                arr[i] = arr[maxIdx];
                arr[maxIdx] = temp;
            }
        }
    }

    public static void main(String[] args){
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 선택정렬
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
