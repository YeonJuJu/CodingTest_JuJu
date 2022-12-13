package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_Queue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.poll();
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.poll();

        System.out.println(queue.toString());
    }
}
