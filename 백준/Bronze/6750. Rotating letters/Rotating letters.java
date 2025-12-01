import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashSet<Character> set = new HashSet<>();
        set.add('I');
        set.add('O');
        set.add('S');
        set.add('H');
        set.add('Z');
        set.add('X');
        set.add('N');

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                System.out.println("NO");
            return;
        }
        }
        System.out.println("YES");
    }
}
