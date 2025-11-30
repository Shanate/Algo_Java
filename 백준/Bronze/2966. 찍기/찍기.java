import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        String[] Adrian = new String[N];
        String[] Bruno = new String[N];
        String[] Goran = new String[N];
        String ans = br.readLine();
        int cntAdrian = 0;
        int cntBruno = 0;
        int cntGoran = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for (int i = 0; i < N; i++) {
            answer[i] = ans.charAt(i);
        }

        for (int i = 0; i < N; i++) {
            if (i % 3 == 0) {
                Adrian[i] = "A";
            } else if (i % 3 == 1) {
                Adrian[i] = "B";
            } else {
                Adrian[i] = "C";
            }
            sb1.append(Adrian[i]);
        }

        for (int i = 0; i < N; i++) {
            if (i % 4 == 0 || i % 4 == 2) {
                Bruno[i] = "B";
            } else if (i % 4 == 1) {
                Bruno[i] = "A";
            } else {
                Bruno[i] = "C";
            }
            sb2.append(Bruno[i]);
        }

        for (int i = 0; i < N; i++) {
            if (i % 6 == 0 || i % 6 == 1) {
                Goran[i] = "C";
            } else if (i % 6 == 2 || i % 6 == 3) {
                Goran[i] = "A";
            } else {
                Goran[i] = "B";
            }
            sb3.append(Goran[i]);
        }

        for (int i = 0; i < N; i++) {
            if(ans.charAt(i) == sb1.charAt(i)) cntAdrian++;
            if(ans.charAt(i) == sb2.charAt(i)) cntBruno++;
            if(ans.charAt(i) == sb3.charAt(i)) cntGoran++;
        }

        int maxCnt = Math.max(Math.max(cntAdrian, cntBruno), cntGoran);
        System.out.println(maxCnt);

        if (maxCnt == cntAdrian) {
            System.out.println("Adrian");
        }
        if (maxCnt == cntBruno) {
            System.out.println("Bruno");
        }
        if (maxCnt == cntGoran) {
            System.out.println("Goran");
        }

    }
}
