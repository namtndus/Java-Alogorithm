package com.company.class2.num1259;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        /*
        * 0이 들어오면 while 문이 종류가 된다
        * for문을 사용한다 입력받은 문자열의 반의 길이 만큼 반복한다.
        *
        * */

        Scanner sc = new Scanner(System.in);
        char[] nums = sc.next().toCharArray();
        boolean is_Checked = true;
        while(nums.length!=1 || nums[0] != '0'){
            //System.out.println("당신은 while문 안에 있습니다!");

            for(int i = 0; i<nums.length/2; i++){
                if(nums[i] != nums[nums.length-1-i]){
                    is_Checked = false;
                    break;
                }
            }

            if(is_Checked == true){
                System.out.println("yes");
            }else{
                System.out.println("no");
                is_Checked = true;
            }
            nums= sc.next().toCharArray();
        }

    }
}
