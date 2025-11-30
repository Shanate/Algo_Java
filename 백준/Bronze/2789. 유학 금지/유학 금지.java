import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replace("C", "");
        str = str.replace("A", "");
        str = str.replace("M", "");
        str = str.replace("B", "");
        str = str.replace("R", "");
        str = str.replace("I", "");
        str = str.replace("D", "");
        str = str.replace("G", "");
        str = str.replace("E", "");

        System.out.println(str);
    }
}
