package Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DivideNumberCards {
    public static void main(String[] args){
        System.out.println(solution(new int[] {10, 17}, new int[] {5, 20}));
        System.out.println(solution(new int[] {10, 20}, new int[] {5, 17}));
        System.out.println(solution(new int[] {14, 35, 119}, new int[] {18, 30, 102}));
    }

    public static int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        // 1. 철수가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고 영희가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
        // 2. 영희가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고, 철수가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a

        Arrays.sort(arrayA);
        ArrayList<Integer> arrayCommonDivisorA = new ArrayList<>();

        for(int i=arrayA[0] ; i>1 ; i--){
            boolean check = true;
            for(int j=0 ; j<arrayA.length ; j++){
                if(arrayA[j]%i != 0){
                    check = false;
                    break;
                }
            }
            if(check)
                arrayCommonDivisorA.add(i);
        }

        Arrays.sort(arrayB);
        ArrayList<Integer> arrayCommonDivisorB = new ArrayList<>();

        for(int i=arrayB[0] ; i>1 ; i--){
            boolean check = true;
            for(int j=0 ; j<arrayB.length ; j++){
                if(arrayB[j]%i != 0){
                    check = false;
                    break;
                }
            }
            if(check)
                arrayCommonDivisorB.add(i);
        }

        Integer[] arrr1 = arrayCommonDivisorA.toArray(new Integer[0]);
        Integer[] arrr2 = arrayCommonDivisorB.toArray(new Integer[0]);

        Arrays.sort(arrr1, Collections.reverseOrder());
        Arrays.sort(arrr2, Collections.reverseOrder());

        for(int i=0 ; i<arrr1.length ; i++){
            boolean hey = true;
            for(int j=0 ; j<arrayB.length ; j++){
                if(arrayB[j]%arrr1[i] == 0){
                    hey = false;
                    break;
                }
            }
            if(hey && answer<arrr1[i]){
                answer = arrr1[i];
                break;
            }
        }

        for(int i=0 ; i<arrr2.length ; i++){
            boolean hey = true;
            for(int j=0 ; j<arrayA.length ; j++){
                if(arrayA[j]%arrr2[i] == 0){
                    hey = false;
                }
            }
            if(hey && answer<arrr2[i]){
                answer = arrr2[i];
                break;
            }
        }

        return answer;
    }
}
