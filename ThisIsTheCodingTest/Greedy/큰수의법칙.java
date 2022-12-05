package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 배열의 길이
        int M = scanner.nextInt(); // M번 더하여 가장 큰 수
        int K = scanner.nextInt(); // 최대 K번 반복 가능
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        int num1 = arr[arr.length-1]; // 배열에서 가장 큰 수
        int num2 = arr[arr.length-2]; // 배열에서 두번째로 큰 수

        // 첫 번째 방법
        int result = 0; // 결과
        int k = 0; // 현재 몇 번 반복하여 더했는지 카운트
        for(int i=0;i<M;i++){ // 총 M번 더함
            if(k<K) { // 반복 횟수가 K번 보다 작을 때
                result += num1; // 가장 큰 수 더함
                k++; // 반복 횟수 +1
            }else{ // 반복 횟수가 K번을 넘었을 때
                result += num2; // 두 번째로 큰 수 더함
                k = 0; // 반복 횟수 초기화
            }
        }
        System.out.println(result);

        // 두 번째 방법
        result = 0;

        // 가장 큰 수가 더해지는 횟수 계산
        int count = M / (K+1) * K;
        count += M % (k+1);

        result += count * num1; // 가장 큰 수 더하기
        result += (M-count) * num2; // 두 번째로 큰 수 더하기

        System.out.println(result);
    }
}
