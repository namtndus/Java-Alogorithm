package com.company.class2.num2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b);

        System.out.println(d);
        System.out.println(a * b /d);
    }

    private static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
