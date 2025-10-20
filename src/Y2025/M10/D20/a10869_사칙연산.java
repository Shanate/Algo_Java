package Y2025.M10.D20;

import java.io.*;
import java.util.*;

public class a10869_사칙연산 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(n+m);
        System.out.println(n-m);
        System.out.println(n*m);
        System.out.println(n/m);
        System.out.println(n%m);

    }
}
