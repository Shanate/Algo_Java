import java.io.*;
import java.util.*;

// 배열이 원형으로 이뤄지면 된다.
// 연결 리스트를 사용한다.
// 배열 없이 StringBuilder에 하나씩 저장하면 될 듯.

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int idx = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        sb.append("<");
        while (!list.isEmpty()) {
            idx = (idx + K - 1) % list.size();
            sb.append(list.remove(idx));
            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}
