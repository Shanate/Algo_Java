import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
 // 킹 퀸 1개씩, 룩 비숍 나이트 2개씩, 폰 8개
        for(int i=0; i<2; i++){
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1 - arr[i];
            }
        }
        for (int i = 2; i < 5; i++) {
            if (arr[i] == 2) {
                arr[i] = 0;
            } else {
                arr[i] = 2 - arr[i];
            }
        }
        for (int i = 5; i < 6; i++) {
            if (arr[i] == 8) {
                arr[i] = 0;
            } else {
                arr[i] = 8 - arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
