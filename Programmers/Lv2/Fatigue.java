package Lv2;

// 완전탐색을 이용하여 문제를 풀어야 함~.....

public class Fatigue {
    boolean[] visited;
    int[][] dungeons;
    int max = 0;

    public int solution(int k, int[][] dungeons) {

        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        for (int i = 0; i < dungeons.length; i++) {
            if (k >= dungeons[i][0])
                dfs(i, k, 1);
        }

        return max;
    }

    private void dfs(int cur, int tired, int depth) {
        visited[cur] = true;
        tired -= dungeons[cur][1];
        for (int i = 0; i < dungeons.length; i++)
            if (!visited[i] && dungeons[i][0] <= tired)
                dfs(i, tired, depth + 1);
        max = Math.max(max, depth);
        visited[cur] = false;
    }
}
