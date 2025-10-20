package Y2025.M10.D20;

import java.io.*;
import java.util.*;

public class a9498_시험성적 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int input = Integer.parseInt(st.nextToken());
        if(90<=input && input<=100){
            System.out.println("A");
        } else if(80<=input && input<=89){
            System.out.println("B");
        } else if(70<=input && input<=79){
            System.out.println("C");
        } else if(60<=input && input<=69){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
