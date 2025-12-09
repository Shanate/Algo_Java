import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cursor = 0;

        char[] wheel = new char[N];
        boolean[] check = new boolean[26]; // 같은 문자는 두 번 이상 나올 수 없기 때문에 이 배열로 체크한다
        Arrays.fill(wheel, '?');


        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken());
            char alp = st.nextToken().charAt(0);
            cursor = (cursor + S) % N;

            if (wheel[cursor] == '?') {                
                if (check[alp - 'A']) {                 // 이미 다른 칸에 같은 글자 있음
                    System.out.println("!");
                    return;
                }
                wheel[cursor] = alp;
                check[alp - 'A'] = true;
            } 
            else {                                    
                if (wheel[cursor] != alp) {            // 같은 칸 안에 다른 글자면 모순
                    System.out.println("!");
                    return;
                }
                
            }
        }

        for (int i = 0; i < N; i++) {
            int idx = (cursor - i + N) % N;
            sb.append(wheel[idx]);
        }
        System.out.print(sb.toString());

    }
}
