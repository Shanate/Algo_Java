import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String words = br.readLine();
            for (int j = 0; j < words.length(); j++) {
                arr[i][j] = words.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0') continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
