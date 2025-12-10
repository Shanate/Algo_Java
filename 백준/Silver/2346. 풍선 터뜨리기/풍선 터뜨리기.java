import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        LinkedList<int[]> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= N; i++) {
            int paper = Integer.parseInt(st.nextToken());
            list.add(new int[]{i, paper});
        }

        int idx = 0;

        while (!list.isEmpty()) {
            // 현재 idx 위치 풍선 터뜨리기
            int[] cur = list.remove(idx); // cur[0] = 번호, cur[1] = 이동값
            int num = cur[0];
            int move = cur[1];

            sb.append(num);
            if (!list.isEmpty()) {
                sb.append(' ');
            }
            if (list.isEmpty()) {
                break; // 큐가 비었으면 더 이상 이동할 필요 없음
            }
            if (move > 0) {
                // 현재 풍선을 제거한 상태이기 때문에, 오른쪽으로 (move-1)칸 이동
                idx = (idx + (move - 1)) % list.size();
            } else {
                // 음수 이동은 그냥 move를 더해주고 음수면 보정
                idx = (idx + move) % list.size();
                if (idx < 0){
                    idx += list.size();
                }
            }
        }
        System.out.println(sb.toString());
    }
}
