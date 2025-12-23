import java.io.*;
import java.util.*;

public class Main {

    static int N, M, R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] checked;
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        int vertex = N + 1;

        checked = new int[vertex];

        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        cnt = 1;

        DFS(R); // 재귀를 통한 탐색 시작

        for (int i = 1; i < checked.length; i++) {
            sb.append(checked[i]).append("\n");
        }
        System.out.println(sb);

    }

    static void DFS(int vertex) {
        checked[vertex] = cnt; // 현재 방문한 정점에 순서를 저장
        for (int i = 0; i < graph.get(vertex).size(); i++) {
            int newVertex = graph.get(vertex).get(i);
            // 다음 갈 정점을 방문했는지에 대한 체크
            if (checked[newVertex] == 0) {
                cnt++;
                DFS(newVertex);
            }
        }
    }
}
