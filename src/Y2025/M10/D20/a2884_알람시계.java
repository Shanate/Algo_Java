package Y2025.M10.D20;

import java.util.*;
import java.io.*;

public class a2884_알람시계 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        if(H==0 && M<45){
            System.out.println("23 " + (M+15));
        } else if(M>=45) {
            System.out.println(H + " " + (M - 45));
        } else if (M < 45) {
            System.out.println((H - 1) + " " + (M+15));
        } else if (M >= 45) {
            System.out.println(H + " " + (M-45));
            }
        }
    }

