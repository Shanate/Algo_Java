import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> leftCur = new Stack<>();
        Stack<Character> rightCur = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                switch(c) {
                    case '<' :
                        if(leftCur.isEmpty()) break;
                        rightCur.push(leftCur.pop());
                        break;
                    case '>' :
                        if(rightCur.isEmpty()) break;
                        leftCur.push(rightCur.pop());
                        break;
                    case '-' :
                        if(leftCur.isEmpty()) break;
                        leftCur.pop();
                        break;
                    default :
                        leftCur.push(c);
                        break;
                }
            }
            while (!leftCur.isEmpty()) {
                rightCur.push(leftCur.pop());
            }
            while (!rightCur.isEmpty()) {
                sb.append(rightCur.pop());
            }
            System.out.println(sb.toString());
        }
    }
}
