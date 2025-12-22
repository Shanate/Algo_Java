import java.io.*;
import java.util.*;

public class Main {
    static int[][] node;
    static boolean[] visited;
    static int M, N;
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        node = new int[M + 1][M + 1];
        visited = new boolean[M + 1];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            node[m][n] = node[n][m] = 1;
        }

        DFS(1);
        System.out.println(answer-1);
    }

    private static void DFS(int x) {
        visited[x] = true;
        answer++;
        for (int i = 1; i <= M; i++) {
            if (node[x][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }
    }
}
