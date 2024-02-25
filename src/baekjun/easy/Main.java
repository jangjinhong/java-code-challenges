package baekjun.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int[] alpha = new int[26];
//        = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        while(!a.equals("#")) {
            int cnt = 0;
            a = a.toUpperCase();
            for(int i=0; i<a.length();i++) {
                /*
                switch (a.charAt(i)) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        cnt++;
                    default:
                        break;
                }
             */
                if(a.charAt(i) == 65 || a.charAt(i) == 69 ||
                        a.charAt(i) == 73 || a.charAt(i) == 79 || a.charAt(i) == 85)
                    cnt++;
            }
            System.out.println(cnt);
            a = br.readLine();
        }
    }
}
