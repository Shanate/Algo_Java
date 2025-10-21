package Y2025.M10.D21;

import java.io.*;
import java.util.*;

public class a10807_개수세기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(v == arr[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
