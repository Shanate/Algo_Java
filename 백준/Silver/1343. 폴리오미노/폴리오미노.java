import java.io.*;
import java.util.*;

public class Main {
        static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                cnt++; // X 갯수 카운팅
            } else { // 읽어들인 문자가 '.'일 때 이전까지 카운팅한 X를 어떻게 해야할지에 대한 메서드
                if (!check(cnt)) {
                    System.out.println(-1);
                    return;
                }
                sb.append(".");
                cnt = 0;
                }
            }

        if (!check(cnt)) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);
    }

    static boolean check(int cnt) {
        if (cnt % 4 == 0) {
            for (int i = 0; i < cnt / 4; i++) {
                sb.append("AAAA");
            }
        } else if (cnt % 4 == 2) { // ex) X가 6개 or 10개... 가정한다면
            for (int i = 0; i < cnt / 4; i++) {
                sb.append("AAAA"); // 앞에 A를 채우고
            }
            sb.append("BB"); // 나머지 B를 채운다
        }/* else if (cnt == 2) { // 카운팅한 수가 단순 2개라면 B만 채운다. 하지만 위에서 이미 해당 로직을 사용했기 때문에 이 else if 문은 사용하지 않아도 된다.
            sb.append("BB"); // 하지만 논리 과정은 있어야 하기 때문에 주석처리로 남겨둡니다.
        } */else { // X가 홀수일 경우
            return false;
        }
        return true;
    }
}
