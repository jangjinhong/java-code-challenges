package week01;

import java.util.LinkedList;
import java.util.Queue;

public class Q42583_programmers {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};

        Queue<Integer> queue = new LinkedList<>();
        int answer = 1;
        int i = 1;
        queue.offer(truck_weights[0]);
        int sum = queue.peek();

        while(i < truck_weights.length) {
            if (queue.isEmpty()) {
                queue.offer(truck_weights[i]);
                sum += truck_weights[i];
                i++;
                answer++;
            }
            if (queue.size() == bridge_length) {
                sum -= queue.poll();
            }
            else {
                // N대 탑승이 가능한 다리이므로 peek가 아닌 전체 무게로 비교
                   if (weight >= sum + truck_weights[i]) {
                    queue.offer(truck_weights[i]);
                       sum += truck_weights[i];
                    i++;
                    answer++;
                } else {
                       queue.offer(0);
                    answer++;
                }
            }
        }
        System.out.println(answer + bridge_length);
    }
}
