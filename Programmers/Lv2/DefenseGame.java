package Lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DefenseGame {
    public static void main(String[] args){
        System.out.println(solution(7, 3, new int[] {4,2,4,5,3,3,1}));
        System.out.println(solution(2, 4, new int[] {3,3,3,3}));
    }

    // 시간초과 답안 ㅠ
    public static int solution(int n, int k, int[] enemy) {
        int answer = 0;

        Integer[] killEnemy = new Integer[enemy.length];
        Arrays.fill(killEnemy, 0);

        int total = 0;
        for(int i=0 ; i<enemy.length ; i++){
            total += enemy[i];
        }

        if(total <= n)
            return enemy.length;

        total = 0;
        for(int i=0 ; i<enemy.length ; i++){
            killEnemy[i] = enemy[i];
            total += killEnemy[i];

            if(total > n && k > 0) {
                Arrays.sort(killEnemy, Collections.reverseOrder());
                total -= killEnemy[0];
                killEnemy[0] = 0;
                k--;
            }else if(total > n)
                break;

            answer++;
        }

        return answer;
    }

    // 우선순위 큐를 이용 -> 매번 정렬하지 않아서 효율성 좋아짐
    public static int bestSolution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int my = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            my -= enemy[i];
            pq.add(enemy[i]);

            if (my < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    my += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}
