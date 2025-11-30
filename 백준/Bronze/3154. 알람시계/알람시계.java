import java.io.*;
import java.util.*;

public class Main {

    static int[][] dial = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
                        // 0        1       2       3       4       5       6       7       8       9

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minEffort = Integer.MAX_VALUE;
        int bestH = -1;
        int bestM = -1;

        for (int HH = H; HH < 100; HH += 24) {
            for (int MM = M; MM < 100; MM += 60) {
                int e = effort(HH, MM);

                if (e < minEffort) {
                    minEffort = e;
                    bestH = HH;
                    bestM = MM;
                } else if (e == minEffort) { // 최소 힘이 같다면 가장 빠른 시간을 나타낸다.
                    if (HH < bestH || (HH == bestH && MM < bestM)) {
                        bestH = HH;
                        bestM = MM;
                    }
                }
            }
        }
        System.out.printf("%02d:%02d", bestH, bestM);

    }

    static int effort(int hh, int mm) {
        int distance = 0;

        int a = hh / 10;
        int b = hh % 10;
        int c = mm / 10;
        int d = mm % 10;

        distance = distDigit(a, b) + distDigit(b, c) + distDigit(c, d);

        return distance;
    }

    static int distDigit(int x, int y) { // 맨하탄 거리
        int[] p1 = dial[x];
        int[] p2 = dial[y];
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);

    }
}
