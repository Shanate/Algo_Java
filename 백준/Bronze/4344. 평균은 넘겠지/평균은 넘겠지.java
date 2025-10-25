import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[] arr;

        while (TC-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            double sum = 0;
            double cnt = 0;

            for (int i = 0; i < n; i++) {
                int grade = Integer.parseInt(st.nextToken());
                arr[i] = grade;
                sum += grade;
            }
            double average = sum / n;

            for (int i = 0; i < n; i++) {
                if (arr[i] > average) {
                    cnt++;
                }
            }
            double sol = (cnt/n)*100;
            double ans = Math.round(sol*1000)/1000.00;
            System.out.println(ans + "%");
        }
    }
}
