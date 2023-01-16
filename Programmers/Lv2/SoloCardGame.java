package Lv2;

import java.util.Arrays;

public class SoloCardGame {

    static boolean[] visited;
    static int[] boxLen;

    public static void main(String[] args) {
        System.out.println(solution(new int[] {8, 6, 3, 7, 2, 5, 1, 4})); //12
        System.out.println(solution(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 1})); //0
    }

    public static int solution(int[] cards) {
        int answer = 1;

        visited = new boolean[cards.length];
        boxLen = new int[cards.length];

        //System.out.println(Arrays.toString(boxLen));

        for (int i = 0; i < cards.length; i++) {

            if (!visited[i]) {
                int cardLength = cardGame(i, cards);
                boxLen[i] = cardLength;
            }

        }

        Arrays.sort(boxLen);

        answer = boxLen[boxLen.length - 1] * boxLen[boxLen.length - 2];

        return answer;
    }

    private static int cardGame(int startIdx, int[] cards) {

        int len = 0;
        int idx = startIdx;

        do {
            visited[idx] = true;
            idx = cards[idx] - 1;
            len++;
        } while (idx != startIdx);

        return len;
    }
}
