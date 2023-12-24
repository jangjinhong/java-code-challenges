package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Problem10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> status = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push" :
                    st.push(Integer.parseInt(str[1]));
                    break;

                case "pop" :
                    if(st.empty())
                        status.add(-1);
                    else
                        status.add(st.pop());
                    break;

                case "size" :
                    status.add(st.size());
                    break;

                case "empty" :
                    status.add(st.empty()? 1 : 0);
                    break;

                case "top" :
                    if(st.empty())
                        status.add(-1);
                    else
                        status.add(st.peek());
                    break;
            }
        }
        for(int s : status)
            System.out.println(s);
    }
}
