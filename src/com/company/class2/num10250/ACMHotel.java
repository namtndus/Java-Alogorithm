package com.company.class2.num10250;

import java.util.Scanner;

public class ACMHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int Y = 0;
            int X = 0;
            if(N % H == 0){
                Y = H;
                X = N / H ;
            }else{
                Y = N % H;
                X = (N / H) +1;
            }
            if(X<10){
                System.out.println(String.valueOf(Y)+"0"+String.valueOf(X));
            }else{
                System.out.println(String.valueOf(Y)+String.valueOf(X));
            }

        }
    }
}
