import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fingers = new int[]{2, 1, 2, 3, 4, 5, 4, 3};

        System.out.println(fingers[n%8]);

    }
}
