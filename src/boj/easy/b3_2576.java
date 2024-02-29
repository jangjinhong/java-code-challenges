package boj.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b3_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum  = 0;
        int min = 100;
        for(int i=0; i<7; i++) {
            int o = Integer.parseInt(br.readLine());
            if(o % 2 == 1) {
                sum += o;
                min = Math.min(min, o);
            }
        }

        if(sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
