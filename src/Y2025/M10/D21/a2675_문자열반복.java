package Y2025.M10.D21;

import java.io.*;
import java.util.*;

public class a2675_문자열반복 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        while (TC-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(word.charAt(i));
                }
            }
            System.out.println();

        }

    }
}
