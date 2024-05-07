package week01;

import java.util.LinkedList;
import java.util.Queue;

public class ex_queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < 6; i++) {
            queue.offer(i);
        }
        System.out.println("queue 5가 들어있는 가? >> " + queue.contains(5));
        System.out.println("queue.size() = " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
