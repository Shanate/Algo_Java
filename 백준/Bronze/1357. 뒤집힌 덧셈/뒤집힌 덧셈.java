import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int rev1 = rev(x);
        int rev2 = rev(y);

        int addRev = rev1 + rev2;

        int ans = rev(addRev);
        System.out.println(ans);
    }

    static int rev(int input) {
        String str = Integer.toString(input);

        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        int revValue = Integer.parseInt(reverse);

        return revValue;
    }


}
