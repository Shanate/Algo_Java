import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] arr = new int[s1 + s2 + s3 + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i + j + k;
                    arr[sum]++;
                }
            }
        }
        int max = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}
