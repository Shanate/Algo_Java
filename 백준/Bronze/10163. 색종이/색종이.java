import java.io.*;
import java.util.*;

public class Main {

    static int[][] paper = new int[1001][1001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[N+1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x0 = Integer.parseInt(st.nextToken());
            int y0 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            for (int r = x0; r < x0 + x1; r++) {
                for (int c = y0; c < y0 + y1; c++) {
                    paper[r][c] = i;
                }
            }
        }
        for (int r = 0; r < paper.length; r++) {
            for (int c = 0; c < paper.length; c++) {
                int idx = paper[r][c];
                if(idx!=0)  cnt[idx]++;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(cnt[i]);
        }



    }
}
