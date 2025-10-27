import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 크기 입력
        int[] arr = new int[n];
        int cnt =  0;
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 배열 오름차순으로 정렬

//        5 12 7 10 9 1 2 3 11 -> 1 2 3 5 7 9 10 11 12

        int x = Integer.parseInt(br.readLine()); // 순서쌍으로 만들 크기.
        int sum = 0;
        /*
        13 -> (1,12), (2,9), (3,10)
        for 문을 두 개 사용해서 내부에서 순서쌍 찾기. 이렇게 했을 시 중복되는 순서쌍이 나오지 않음.
         */
        int lc = 0; // 레프트 커서
        int rc = n-1; // 라이트 커서
        while (lc < rc) {
            sum = arr[lc] + arr[rc];
            if (sum == x) {
                cnt++;
            }

            if (sum < x) {
                lc++;
            } else {
                rc--;
            }
        }


/*
        for(int i=0; i<n; i++){
            for (int j = i + 1; j < n; j++) {
                if (sum == (arr[i] + arr[j])) {
                    cnt++;
                }
            }
        } // 시간 초과 -> 투 포인터로 방법 변경*/
        System.out.println(cnt);

    }
}
