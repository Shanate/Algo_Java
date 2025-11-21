import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static BigInteger[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new BigInteger[N + 1][K + 1];

        System.out.println(combi(N,K));

    }

    static BigInteger combi(int n, int r) {
        if(dp[n][r] == null) {
            if (n == r || r == 0) {
                return dp[n][r] = BigInteger.valueOf(1);
            }
            return dp[n][r] = combi(n - 1, r).add(combi(n - 1, r - 1));
        }
        return dp[n][r];
    }

}
