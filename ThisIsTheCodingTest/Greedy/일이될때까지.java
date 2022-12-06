package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 일이될때까지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 어떠한 수 N
        int K = Integer.parseInt(st.nextToken()); // 나누는 수 K

        int cnt = 0; // N을 1로 만드는 최소 횟수
        while(N>1){
            if(N%K == 0)
                N/=K;
            else
                N-=1;
            cnt++;
        }

        System.out.println(cnt);
    }
}
