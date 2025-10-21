package Y2025.M10.D21;

import java.io.*;
import java.util.*;

public class a11720_숫자의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        String word = br.readLine();

        for (int i = 0; i < n; i++) {
            arr[i] = word.charAt(i) - '0';
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
