import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<Character, Integer> typing = new HashMap<>();
        int[] cnt = new int[9];
        typing.put('1', 1); typing.put('2', 2); typing.put('3', 3); typing.put('4', 4);
        typing.put('Q', 1); typing.put('W', 2); typing.put('E', 3); typing.put('R', 4);
        typing.put('A', 1); typing.put('S', 2); typing.put('D', 3); typing.put('F', 4);
        typing.put('Z', 1); typing.put('X', 2); typing.put('C', 3); typing.put('V', 4);
        typing.put('5', 4); typing.put('T', 4); typing.put('G', 4); typing.put('B', 4);
        typing.put('0', 8); typing.put('9', 7); typing.put('8', 6); typing.put('7', 5);
        typing.put('P', 8); typing.put('O', 7); typing.put('I', 6); typing.put('U', 5);
        typing.put(';', 8); typing.put('L', 7); typing.put('K', 6); typing.put('J', 5);
        typing.put('/', 8); typing.put('.', 7); typing.put(',', 6); typing.put('M', 5);
        typing.put('6', 5); typing.put('Y', 5); typing.put('H', 5); typing.put('N', 5);
        typing.put('-', 8); typing.put('=', 8); typing.put('[', 8); typing.put(']', 8); typing.put('\'', 8);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (typing.containsKey(c)) {
                int value = typing.get(c);
                cnt[value]++;
            }
        }
        for (int i = 1; i < 9; i++) {
            System.out.println(cnt[i]);
        }

    }
}
