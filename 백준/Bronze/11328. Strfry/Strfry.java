import java.io.*;
import java.util.*;
// HashMap에 넣어서 카운팅이 0이 될 수 있으면 Possible, 그렇지 않다면 Impossible

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            HashMap<Character, Integer> hashmap = new HashMap<>();
            String prev = st.nextToken();
            String after = st.nextToken();

            if (prev.length() != after.length()) {
                System.out.println("Impossible");
                continue;
            }


            for (int i = 0; i < prev.length(); i++) {
                char c = prev.charAt(i);
                hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
            }

            boolean possible = true;
            for (int i = 0; i < after.length(); i++) {
                char c = after.charAt(i);
                Integer cnt = hashmap.get(c);

                // 없는 문자거나, 이미 0이면 불가능
                if (cnt == null || cnt == 0) {
                    possible = false;
                    break;
                }

                hashmap.put(c, cnt - 1);
            }

            if (!possible) {
                System.out.println("Impossible");
            } else {
                System.out.println("Possible");
            }

        }
    }
}
