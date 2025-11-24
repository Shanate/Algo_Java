import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int[] arr = new int[26];
/*
        String sentences = ""; // null로 초기화 했을 시 null + input으로 되어버림. 즉 여기서 초기화는 ""으로 공백을 둔다.
        while ((input = br.readLine()) != null) {
            sentences += input;
        }
*/
        // 이 문제는 라인 하나씩 받아서 출력을 만드는 것이 아닌, 입력 전체를 받아야 하기 때문에 위와 같이 while문을 사용한다.
        StringBuilder str = new StringBuilder();
        while ((input = br.readLine()) != null) {
            str.append(input);
        }

        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c != ' ') {
                arr[c - 'a']++; // 해당 위치의 알파벳의 갯수를 카운팅. 공백이 아닐 때

                if (arr[c - 'a'] > max) {
                    max = arr[c - 'a']; // 카운팅 최댓값일 시 max 값 변경
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                ans.append((char) ('a' + i)); // char를 붙이지 않으면 a가 가지고 있는 숫자가 더해진 정수형 답밖에 나오질 않는다.
            }
        }
        System.out.println(ans.toString());

    }
}
