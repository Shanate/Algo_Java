package Y2025.M10.D22;

import java.io.*;
import java.util.*;

public class a2908_상수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int str1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int str2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        // 주어진 토큰값을 뒤집고 문자열로 받은 후 String 타입을 Int 타입으로 변경
        int value = Math.max(str1, str2);

        System.out.println(value);

    }

}
