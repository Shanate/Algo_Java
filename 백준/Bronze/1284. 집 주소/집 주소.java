import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        while(true){
            int input = Integer.parseInt(br.readLine());
            if(input == 0) break;

            int ans = 1;
            while (input > 0) {
                ans += arr[input % 10];
                ans++; // 다음 숫자 나오기 전 여백 더하기
                input /= 10;
            }
            System.out.println(ans);

        }
    }
}
