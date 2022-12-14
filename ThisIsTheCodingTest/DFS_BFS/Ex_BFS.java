package DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
* BFS 는 큐 자료구조를 이용하여 구현
*/

public class Ex_BFS {

    // Adjacency List 방식으로 노드와 엣지 표현
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // 방문여부를 저장할 수 있는 배열 생성
    public static boolean[] visited = new boolean[9];

    public static void BFS(int startNode){
        // BFS는 Queue를 이용
        Queue<Integer> queue = new LinkedList<>();

        // 1. 현재 노드를 방문처리
        visited[startNode] = true;

        // 2. 현재 노드를 큐에 삽입
        queue.offer(startNode);

        // 3. 큐가 빌 때까지 반복
        while(!queue.isEmpty()){

            // 1) 큐에서 원소를 하나 뽑음
            int node = queue.poll();

            // 2) 출력
            System.out.print(node + " ");

            // 3) 현재 노드와 연결된 모든 노드를 방문처리 후 큐에 삽입. 단, 이미 방문한 노드는 제외
            for(int i=0; i<graph.get(node).size(); i++){
                int nextNode = graph.get(node).get(i);
                // 아직 방문하지 않은 노드라면 방문처리 후 큐에 삽입
                if(!visited[nextNode]){
                    visited[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
    }

    public static void main(String[] args){
        // 그래프 초기화 (보기 쉽게 1 ~ 8 사용)
        for(int i=0;i<9;i++){
            graph.add(new ArrayList<Integer>());
        }

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 노드 3에 연결된 노드 정보 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 노드 4에 연결된 노드 정보 저장
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);

        // 깊이우선탐색 DFS 실행
        BFS(1);
    }
}
