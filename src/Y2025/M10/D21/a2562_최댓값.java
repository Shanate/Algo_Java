package Y2025.M10.D21;

import java.io.*;
import java.util.*;

public class a2562_최댓값 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int cnt = 1;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
