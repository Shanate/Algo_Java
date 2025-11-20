import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] ans = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // 2 1 3 1
            B[i] = A[i];
        }
        Arrays.sort(B); // 1 1 2 3

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (B[j] == A[i]) {
                    ans[i] = j;
                    B[j] = -1;
                    break;
                }
            }
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
