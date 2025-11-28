import java.io.*;
import java.util.*;

public class Main{

    static int pack = Integer.MAX_VALUE, piece = Integer.MAX_VALUE;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ans;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            pack = Math.min(pack, Integer.parseInt(st.nextToken()));
            piece = Math.min(piece, Integer.parseInt(st.nextToken()));

        }

        if (piece * 6 <= pack) { // 낱개 6개와 세트 하나의 가격 비교
            ans = piece * n;
        } else {
            ans = (n / 6) * pack;
            if (n % 6 * piece <= pack) {
                ans += (n % 6) * piece;
            } else {
                ans += pack;
            }
        }
        System.out.println(ans);

    }
}
