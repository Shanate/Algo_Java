import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        String[] name = {
                "",          // 0 (안씀)
                "Yakk",      // 1
                "Doh",       // 2
                "Seh",       // 3
                "Ghar",      // 4
                "Bang",      // 5
                "Sheesh"     // 6
        };

        String[] doubleName = {
                "",              // 0 (안씀)
                "Habb Yakk",     // 1-1
                "Dobara",        // 2-2
                "Dousa",         // 3-3
                "Dorgy",         // 4-4
                "Dabash",        // 5-5
                "Dosh"           // 6-6
        };


        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append("Case ").append(tc).append(": ");

            int small = Math.min(a, b);
            int big   = Math.max(a, b);

            // 같은 눈일 때
            if (small == big) {
                sb.append(doubleName[small]);
            }
            // 예외 처리
            else if (small == 5 && big == 6) {
                sb.append("Sheesh Beesh");
            }
            else {
                sb.append(name[big]).append(" ").append(name[small]);
            }
            if (tc < T) sb.append('\n');
        }
        System.out.println(sb);
    }
}