package Y2025.M10.D21;

import java.io.*;
import java.util.*;

public class a10809_알파벳찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
