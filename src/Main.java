import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> fStack = new Stack<>();
        Stack<String> lStack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        String[] tech = br.readLine().split("");

        for(int i=0; i<n; i++)
            fStack.push(tech[i]);

        while(n-- > 0) {
            String data = fStack.pop();
            if(1 <= data.charAt(0)-'0' && data.charAt(0)-'0' <= 9)
                cnt++;
            else lStack.push(data);

        }
        System.out.println(lStack);

        for(int i=0; i<n; i++) {
            String data = lStack.pop();
            if(data.equals("L")) {
                if(lStack.lastElement().equals("R"))
                    cnt++;
            }
            if(data.equals("S")) {
                if(lStack.lastElement().equals("K"))
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
