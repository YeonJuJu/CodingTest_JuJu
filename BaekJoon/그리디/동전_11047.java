package 그리디;

/*
 *  문제
 *
 *  준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 *  동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 *
 *  입력
 *
 *  첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 *  둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
 *  (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 *
 *  출력
 *
 *  첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
 */

import java.util.Scanner;

public class 동전_11047 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 동전의 종류
        int K = scanner.nextInt(); // 만들어야하는 가치의 합

        // 오름차순으로 정렬된 동전의 종류
        int[] Ai = new int[N];
        for(int i=0;i<N;i++){
            Ai[i] = scanner.nextInt();
        }

        int cnt = 0; // 동전의 개수
        for(int i=N-1;i>=0;i--){ // 가치가 큰 동전부터 사용
            cnt += K/Ai[i];
            K %= Ai[i];
        }

        System.out.println(cnt);
    }
}
