package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자카드게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행 개수
        int M = Integer.parseInt(st.nextToken()); // 열 개수
        int maxOfmin = Integer.MIN_VALUE;

        for(int i=0;i<N;i++){ // 각 행의 최소값을 구함
            st = new StringTokenizer(br.readLine());
            int minValue = Integer.MAX_VALUE;
            while(st.hasMoreTokens()){
                int value = Integer.parseInt(st.nextToken());
                if(minValue > value)
                    minValue = value;
            }
            if(maxOfmin < minValue) // 현재 행의 최소값이 다른 행의 최소값보다 클 때 값 세팅
                maxOfmin = minValue;
        }

        System.out.println(maxOfmin);
    }
}
