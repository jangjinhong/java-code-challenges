package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.*;

// Q1459_Jinhong_Jang
public class Q1459_Jinhong_Jang {
    /**
    * [ 효율성 ]
    * - 메모리: 14300 KB
    * - 시간: 124 ms
    * - 코드 길이: 874 B
    */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());    //직선
        int s = Integer.parseInt(st.nextToken());    //대각선
        int[] time = new int[3];

        time[0] = (x + y) * w;
        time[1] = (((x + y) % 2) == 0) ? (max(x, y) * s) : (max(x, y) - 1) * s + w;
        time[2] = (min(x, y) * s) + ((max(x, y) - min(x, y)) * w);

        Arrays.sort(time);
        System.out.println(time[0]);
    }
}
