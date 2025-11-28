import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int zero = 0;
        int one = 0;
        int ref = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != ref){
                ref = str.charAt(i);
                if (str.charAt(i) == '0') {
                    one++;
                } else {
                    zero++;
                }
            }
        }
        if (ref == '0') {
            zero++;
        } else {
            one++;
        }
        int ans = Math.min(zero, one);
        System.out.println(ans);

    }
}
