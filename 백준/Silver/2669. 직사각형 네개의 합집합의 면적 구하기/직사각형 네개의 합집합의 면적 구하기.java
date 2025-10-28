import java.io.*;
import java.util.*;

// 받은 직사각형에 해당하는 배열에 1을 채우고 이들의 합을 구하면 될 듯

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[101][101];
        int cnt = 0;

        for (int k = 0; k < 4; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int i=y1; i<y2; i++){
                for (int j = x1; j < x2; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
