import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = find(n, m, arr);
        System.out.println(result);

    }

    static int find(int n, int m, int[] arr) {
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            if(arr[i]>m) continue; // 첫 카드가 m보다 크면 넘긴다

            for (int j = i + 1; j < n - 1; j++) {
                if(arr[i]+arr[j]>m) continue; // 첫 카드와 두 번째 카드 합이 m보다 크면 넘긴다

                for (int k = j + 1; k < n; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];

                    if (m == tmp) {
                        return tmp; // 합이 m과 같다면 여기서 종료
                    }

                    if (result < tmp && tmp < m) { // 합이 이전 합보다 크면서 m보다 작을 경우 값 갱
                        result = tmp;
                    }
                }
            }
        }
        return result;

    }
}
