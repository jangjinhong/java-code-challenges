package brute_force;

import java.util.Scanner;

public class BJ_b2_2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(0) < 97)
                sum += str[i].charAt(0) - 'A' + 27;
            else
                sum += str[i].charAt(0) - 'a' + 1;
        }
        // 소수판별
        boolean ch = false;
        for(int i=2; i<=(int)Math.sqrt(sum); i++) {
            if(sum%i==0)
                ch = true;

        }
        System.out.println(!ch ? "It is a prime word." : "It is not a prime word.");
    }
}
