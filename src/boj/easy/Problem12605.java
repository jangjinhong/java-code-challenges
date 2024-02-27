package boj.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        int i = 0;

        while(i++ < n) {
            String[] list = br.readLine().split(" ");
            sb.append("Case #"+ i +": ");
            sb.append(list[list.length-1]);
            for(int j=list.length-2; j>=0; j--)
                sb.append(" ").append(list[j]);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
