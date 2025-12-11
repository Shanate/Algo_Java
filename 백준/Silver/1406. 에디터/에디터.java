import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        String str = br.readLine();
        int    M   = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<Character>(); // 커서 기준 좌측 스택
        Stack<Character> rightStack = new Stack<Character>(); // 커서 기준 우측 스택

        for(int i=0; i<str.length(); i++) {
            leftStack.push(str.charAt(i)); // 문자열 끝에 커서 위치 => 좌측을 전부 Push
        }

        for(int i=0; i<M; i++) {

            String command = br.readLine(); // L, D, B, P
            char c = command.charAt(0);
            switch (c) {

                case 'L' :
                    if(leftStack.isEmpty()) break;
                    rightStack.push(leftStack.pop());
                    break;
                case 'D' :
                    if(rightStack.isEmpty()) break;
                    leftStack.push(rightStack.pop());
                    break;
                case 'B' :
                    if(leftStack.isEmpty()) break;
                    leftStack.pop();
                    break;
                case 'P' :
                    char s = command.charAt(2);
                    leftStack.push(s);
                    break;
                default :
                    break;
            }
        }
        while(!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.print(sb.toString());
    }
}