package Y2025.M10.D20;

import java.io.*;
import java.util.*;
/*
100의 배수인지를 확인하려 했으나, 400의 배수가 우선순위가 됨을 확인할 수 있다. -> 400의 배수임을 먼저 확인
이후 100의 배수인지르 판별하고 마지막으로 4의 배수인지를 판별한다

 */
public class a2753_윤년 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int input = Integer.parseInt(st.nextToken());

            if (input % 400 == 0) {
                System.out.println("1");
            } else {
                // 400이 아닐 때, 100의 배수인지 판별
                if (input % 100 == 0) { // 100의 배수이면 자동으로 0
                    System.out.println("0");
                } else { // 100의 배수는 일단 아니다. 그러면 4의 배수인지를 확인
                    if(input % 4 ==0){
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                }
            }
        }
    }

