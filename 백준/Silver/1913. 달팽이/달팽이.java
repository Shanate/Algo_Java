import java.io.*;
import java.util.*;

public class Main {

    static int[] di = {1, 0, -1, 0}; // 아래 방향 1, 오른쪽 방향 1
    static int[] dj = {0, 1, 0, -1}; // 하 우 상 좌
    static int[][] map;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int i = 0, j = 0;
        int dir = 0; // 0, 1, 2, 3 : 하 우 상 좌
        int ansRow = -1, ansCol = -1;

        for (int val = N * N; val > 0; val--) {
            map[i][j] = val;

            if (val == K) {
                ansRow = i + 1;
                ansCol = j + 1;
            }

            int ni = i + di[dir];
            int nj = j + dj[dir];

            if (ni >= 0 && ni < N && nj >= 0 && nj < N && map[ni][nj] == 0) {
                i = ni;
                j = nj;
            } else {
                dir = (dir + 1) % 4;
                i = i + di[dir];
                j = j + dj[dir];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append(map[r][c]).append(' ');
            }
            sb.append('\n');
        }
        sb.append(ansRow).append(' ').append(ansCol);
        System.out.println(sb.toString());
    }
}
