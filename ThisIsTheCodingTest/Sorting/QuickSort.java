package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end){

        // 원소가 1개인 경우 return;
        if(start >= end) return;

        // pivot 은 첫번째 원소
        int pivot = start;
        int left = start + 1;
        int right = end;

        // 왼쪽에서부터 pivot 보다 큰 원소 찾고, 오른쪽에서부터 pivot 보다 작은 원소 찾기
        while(left <= right){

            while(left<=end && arr[left] <= arr[pivot]) left++;

            while(right >= start+1 && arr[right] >= arr[pivot]) right--;

            // 둘이 엇갈렸다면 작은 데이터와 pivot을 교체
            if(left > right){
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }else{ // 엇갈리지 않았다면 작은 데이터와 큰 데이터 교체
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // 분할 이후 왼쪽 부분과 오른쪽 부분 각각 정렬 수행
        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);

    }

    public static void main(String[] args){
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 선택정렬
        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
