import java.io.*;
import java.util.*;

/*
1000엔을 지불하는 것은 변하지 않는다.
오직 입력에 대해서만 그 차이에 대한 거스름돈을 생각해야 한다.
1000 - 380 = 620 -> 500엔 1개, 100엔 1개, 10엔 2개로 총 4개의 잔돈이 필요하다
1000 - 1 = 999 -> 500엔 1개, 100엔 4개, 50엔 1개, 10엔 4개, 5엔 1개, 1엔 4개로 총 15개의 잔돈이 필요하다
*/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ex = 1000 - Integer.parseInt(br.readLine());

        int[] coin = new int[]{500, 100, 50, 10, 5, 1};
        int sum = 0;
        int exchange = ex;

        for (int i = 0; i < coin.length; i++) {
            sum += exchange / coin[i];
            exchange = exchange % coin[i];
        }
        System.out.println(sum);
    }
}
