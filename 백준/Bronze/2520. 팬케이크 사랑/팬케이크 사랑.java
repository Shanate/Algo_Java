import java.io.*;
import java.util.*;

public class Main {

    // 팬케이크 반죽 1개 기준 재료의 양
    static double Milk = 0.5;
    static double Eggs = 0.5;
    static double Sugar = 0.25;
    static double Solt = 0.0625;
    static double Flour = 0.5625;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] ingrediencts = new int[5];
            int sum = 0;
            int cake = 0;

            ingrediencts[0] = (int) (Integer.parseInt(st.nextToken()) / Milk);
            ingrediencts[1] = (int) (Integer.parseInt(st.nextToken()) / Eggs);
            ingrediencts[2] = (int) (Integer.parseInt(st.nextToken()) / Sugar);
            ingrediencts[3] = (int) (Integer.parseInt(st.nextToken()) / Solt);
            ingrediencts[4] = (int) (Integer.parseInt(st.nextToken()) / Flour);
            Arrays.sort(ingrediencts); // 갯수 오름차순
            cake = ingrediencts[0]; // 만들 수 있는 가장 최소의 반죽

            st = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken()) / 30;
            int c = Integer.parseInt(st.nextToken()) / 25;
            int w = Integer.parseInt(st.nextToken()) / 10;
            sum = b + s + c + w;
            System.out.println(Math.min(cake, sum));
        }
    }
}
