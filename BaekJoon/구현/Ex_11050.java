package 구현;

/*
 *  문제
 *
 *  자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수 (N/K)를 구하는 프로그램을 작성하시오.
 *
 *  입력
 *
 *  첫째 줄에 \(N\)과 \(K\)가 주어진다. (1 ≤ \(N\) ≤ 10, 0 ≤ \(K\) ≤ \(N\))
 *
 *  출력
 *
 *  \(\binom{N}{K}\)를 출력한다.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(binomial_coefficient(N, K));
    }

    public static int binomial_coefficient(int N, int K){
        return factorial(N) / (factorial(K) * factorial(N-K));
    }

    public static int factorial(int num){
        if(num <= 1)
            return 1;
        else
            return num * factorial(num-1);
    }
}
