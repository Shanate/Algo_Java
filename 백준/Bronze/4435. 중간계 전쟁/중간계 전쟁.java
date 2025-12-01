import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        int[] gScore = {1, 2, 3, 3, 4, 10};
        int[] sScore = {1, 2, 2, 2, 3, 5, 10};
        int battle = 1;
        String str = "";

        while (T-- > 0) {

            int[] gandalf = new int[6];
            int[] sauron = new int[7];
            int sum1 = 0;
            int sum2 = 0;

                st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 6; i++) {
                gandalf[i] = Integer.parseInt(st.nextToken());
                sum1 += gandalf[i] * gScore[i];
            }
                st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 7; i++) {
                sauron[i] = Integer.parseInt(st.nextToken());
                sum2 += sauron[i] * sScore[i];
            }
            if (sum1 < sum2) {
                str = "Evil eradicates all trace of Good";
            } else if (sum1 == sum2) {
                str = "No victor on this battle field";
            } else if (sum1 > sum2) {
                str = "Good triumphs over Evil";
            }
            System.out.println("Battle " + battle + ": " + str);
            battle++;

        }

    }
}
