package week02;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1966_Jinhong_Jang {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int t = sc.nextInt(); //test case
        while (t-- > 0) { //3
            int n = sc.nextInt(); //6 0
            int m = sc.nextInt(); //6 0
            for (int i = 0; i < n; i++) {  //6번
                queue.add(sc.nextInt());
            }

            queue.stream().sorted();
            System.out.println(queue);
        }

    }
}
