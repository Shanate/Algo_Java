import java.io.*;
import java.util.*;
/*
문제에서 주어지길, DFS를 명시했으며, N개의 정점, M개의 간선으로 구성된 무방향 그래프라고 했다. 모든 간선의 가중치는 1이다.
인접 정점은 오름차순으로 방문한다고 했다. 단, 인접 행렬을 사용하게 되면 문제가 생기는 것이,
인풋으로 주어질 수 있는 정점의 수가 10만, 간선의 수가 20만이다. 메모리 초과가 일어나기 때문에 해당 발상으로 문제를 푸는 것이 아닌
인접리스트를 사용해서 풀 수 있도록 한다.
*/

public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 정점들의 정보를 기록할 그래프
    static int[] checked; // 방문한 정점을 기록할 배열
    static int cnt; // 방문 순서

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int vertex = N + 1;

        checked = new int[vertex]; // idx 혼란 방지를 위해 1 시작

        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            // 무방향 -> 양쪽에 정보를 추가
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        // 오름차순 정렬
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
        cnt = 1; // 시작 정점부터 카운팅

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
