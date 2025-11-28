import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] table = {"black", "brown", "red", "orange", "yellow",
                            "green", "blue", "violet", "grey", "white"};
        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();

        long ans = Arrays.asList(table).indexOf(input1)*10;
        ans += Arrays.asList(table).indexOf(input2);
        ans *= Math.pow(10, Arrays.asList(table).indexOf(input3));
        System.out.println(ans);

    }
}
