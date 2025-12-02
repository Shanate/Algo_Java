import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] Female = new int[7]; // S = 0
        int[] Male = new int[7]; // S = 1
        int sum = 0;

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine()," ");

            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (S == 0) {
                Female[Y]++;
            } else if (S == 1) {
                Male[Y]++;
            }
        }
        for (int i = 1; i < 7; i++) {

            sum += (Female[i] / K) + (Female[i] % K);
            sum += (Male[i] / K) + (Male[i] % K);

        }

        System.out.println(sum);
    }
}
