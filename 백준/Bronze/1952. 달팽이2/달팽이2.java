import java.io.*;
import java.util.*;

public class Main {

    static int[] di = {0, 1, 0, -1};
    static int[] dj = {1, 0, -1, 0};
//    static int[][] map;
    static int N, M;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
//        map = new int[M][N];
        visited = new boolean[M][N];
        int i = 0, j = 0;
        int dir = 0; // 0, 1, 2, 3 우 하 좌 상
        int cnt = 0;
        int sum = 1;
        visited[0][0] = true;
        while (true) {
            if(sum==M*N) break;

            int ni = i + di[dir];
            int nj = j + dj[dir];

            // 경계조건
            if (ni >= 0 && ni < M && nj >= 0 && nj < N && !visited[ni][nj]) {
                // 충족 시 해당 방향으로 전진
                visited[ni][nj] = true;
                i = ni;
                j = nj;
                sum++;
            } else { // 미충족 시 방향 전환과 카운팅
                dir = (dir + 1) % 4;
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}
