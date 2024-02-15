package list;

import java.util.*;

public class BJ_s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) q.add(i);

        int cnt = 0;

        while(q.size() > 1) {
            if(cnt < k-1) {
                q.add(q.poll());
                cnt++;
            }
            else {
                sb.append(q.poll());
                cnt = 0;
            }

        }
        sb.append(q.poll());
        System.out.println("sb = " + sb);
    }
}
