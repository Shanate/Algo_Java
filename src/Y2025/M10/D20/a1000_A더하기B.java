package Y2025.M10.D20;

import java.io.*;
import java.util.*;

public class a1000_A더하기B {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = N+M;
        System.out.println(sum);

    }
}
