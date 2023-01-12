package Lv2;

import java.util.Arrays;
import java.util.Comparator;

public class Fatigue {
    public static void main(String[] args) {
        System.out.println(solution(80, new int[][] {{80, 20}, {50, 40}, {30, 10}})); //3
        //System.out.println(solution(80, new int[][] {{80, 20}, {80, 40}, {30, 10}})); //3
    }

    // 완전 탐색 이진트리로 풀어야할듯..!!!!!!!!
    public static int solution(int k, int[][] dungeons) {
        int answer = 0;

        for (int i = 0; i < dungeons.length; i++) {
            System.out.print("{" + dungeons[i][0] + ", " + dungeons[i][1] + "} ");
        }
        System.out.println();

        Arrays.sort(dungeons, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];

                return o2[0] - o1[0];
            }
        });

        for (int i = 0; i < dungeons.length; i++) {
            System.out.print("{" + dungeons[i][0] + ", " + dungeons[i][1] + "} ");
        }
        System.out.println();

        int idx = 0;
        while (k >= 0 && idx < dungeons.length) {

            System.out.println("k :" + k + ", dungeons[" + idx + "][0] : " + dungeons[idx][0] + " dungeons[" + idx + "][1] : " + dungeons[idx][1]);

            if (k >= dungeons[idx][0]) {
                System.out.print("in if ~~~");
                k -= dungeons[idx][1];
                answer++;
                System.out.println(answer);
            }
            idx++;
        }

        return answer;
    }
}
