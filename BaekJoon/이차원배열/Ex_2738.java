package 이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        int[][] arrA = new int[N][M];

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<M ; j++){
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<M ; j++){
                arrA[i][j] = Integer.parseInt(st.nextToken()) + arrA[i][j];
            }
        }

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }

    }
}
