package com.company.programmers.string;

public class UseString {
    static String s = "124";

    public static void main(String[] args) {
        boolean answer = true;
        char[] letter = s.toCharArray();

        if(letter.length !=4 && letter.length != 6){
            answer = false;

            System.out.println(answer);
        }

        for(int i = 0; i<letter.length; i++){
            if((int) letter[i] >= 65){
                answer = false;
                System.out.println(answer);
            }
        }

        System.out.println(answer);
    }
}
