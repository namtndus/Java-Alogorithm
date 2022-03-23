package com.company.programmers.level1.blindPhoneNumber;

public class BlindPhoneNumber {
    static String phone_number = "01033334444";

    public static void main(String[] args) {
        String answer = "";

        for(int i = 0; i<phone_number.length(); i++){
            if(i>=0 && i<phone_number.length()-4){
                answer+="*";
            }else{
                answer+=phone_number.substring(i, i+1);
            }
        }

        System.out.println(answer);
    }
}
