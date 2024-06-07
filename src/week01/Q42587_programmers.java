package week01;

import java.util.LinkedList;
import java.util.Queue;

public class Q42587_programmers {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int max = queue.peek()[1];
            for (int[] q : queue) {
                max = Math.max(q[1], max);
            }
            int[] poll = queue.poll();
            if (poll[1] < max) {
                queue.offer(poll);
            }
            else {
                answer++;
                if(poll[0]==location) break;
            }

        }

        System.out.println(answer);
    }
}
