import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        String ans = null;

        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                String first = str.substring(0, i);
                String second = str.substring(i, j);
                String third = str.substring(j, len);
                
                StringBuilder sb = new StringBuilder();
/*
                String rf = sb.append(first).reverse().toString();
                String rs = sb.append(second).reverse().toString();
                String rt = sb.append(third).reverse().toString();
                이렇게 코드를 진행했을 경우, 모든 코드가 계속 합쳐져서 뒤집힌다.
                즉, ap pl e로 분할 했을 때
                pa / lp / e로 역순이 되는 것이 아닌, pa / lpap / epapl이 될 것이다.
                다시 말해, StringBuilder는 계속 누적되는 객체이기 때문에 아래와 같이 새 StringBuilder를 만들어야 한다.
*/
                String rf = new StringBuilder(first).reverse().toString();
                String rs = new StringBuilder(second).reverse().toString();
                String rt = new StringBuilder(third).reverse().toString();

                String word = rf + rs + rt; // String도 정수형과 마찬가지로 +로 합칠 수 있다.

                if (ans == null || word.compareTo(ans) < 0) {
                    ans = word;
                    // str1이 str2보다 앞에 있는 단어라면 음수가 나오게 된다. 즉 word를 ans에 넣으면 된다.
                }
            }
        }
        System.out.println(ans);

    }
}
