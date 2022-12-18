package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for(int i = 1; i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else
                    break;
            }
        }
    }

    public static void insertionSortReverse(int[] arr){

        for(int i = 1; i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else
                    break;
            }
        }
    }

    public static void main(String[] args){
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 선택정렬
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
