package Lv2;

import java.util.ArrayList;

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

        // 1. arrayA - 공약수 와 arrayB - 공약수 구하셈

        ArrayList<Integer> arrayCommonDivisorA = new ArrayList<>();


        int[] arrayCommonDivisorB = new int[5];

        // 2. arrayA 내림차순으로 정렬

        // 3. 하나씩 보면서 영희꺼에 없는거 찾아

        // 반대경우도 생각

        return answer;
    }
}
