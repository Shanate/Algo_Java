package Y2025.M10.D21;

import java.io.*;
import java.util.*;

public class a27866_문자와문자열 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(word.charAt(n-1));

    }
}
