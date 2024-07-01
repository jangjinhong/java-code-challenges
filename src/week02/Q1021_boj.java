package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1021_boj {
    /**
     * 메모리: 14236 KB  ( / 128000 KB)
     * 시간: 124 ms     ( / 2000 ms)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //ADT
        LinkedList<Integer> deque = new LinkedList<>();
        int[] idx = new int[M];

        for (int i = 0; i < N; i++) deque.offer(i + 1);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            idx[i] = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int i = 0;
        while (i < M) {
            /**
             * 뽑아야하는(poll) 원소의 위치를 찾아, 2 or 3번 연산을 해주었습니다.
             * 원소와 인덱스.. 대한 이해 부족으로 많이 헤맸습니다.
             */
            int target = deque.indexOf(idx[i]);

            if (target > deque.size()/2) {
                while (deque.peekFirst() != idx[i]) {
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                }
            }
            else {
                while (deque.peekFirst() != idx[i]) {
                    deque.offerLast(deque.pollFirst());
                    cnt++;
                }
            }
            deque.pollFirst();
            i++;
        }

        System.out.println(cnt);
    }
}
