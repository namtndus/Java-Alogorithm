package com.company.programmers.level1.dartGame;

public class DartGame {
    public int solution(String dartResult){
        int[] nums = new int[3];
        char[] dart = dartResult.toCharArray();
        int answer = 0;
        int index = -1;
        for(int i = 0; i<dartResult.length(); i++){
            if(dart[i] >='0' && dart[i] <='9'){
                index++;
                if(Integer.parseInt(dartResult.substring(i,i+1)) == 1 && dartResult.charAt(i+1) =='0'){
                    nums[index] = 10;
                    i++;
                }else{
                    nums[index] = Integer.parseInt(dartResult.substring(i,i+1));
                }
            } else if (dartResult.charAt(i)  == 'D') {
                nums[index] = (int)Math.pow(nums[index],2);
            } else if (dartResult.charAt(i)  == 'T') {
                nums[index] = (int)Math.pow(nums[index],3);
            }else if(dartResult.charAt(i) == '*'){
                nums[index] = nums[index]*2;
                if(index != 0){
                    nums[index-1] = nums[index-1] *2;
                }
            }else if(dartResult.charAt(i) == '#'){
                nums[index] = nums[index] *-1;
            }

        }

        for(int i = 0; i<nums.length; i++){
            answer+= nums[i];
        }

        return answer;
    }




    public static void main(String[] args) {
        DartGame game = new DartGame();
        System.out.println(game.solution("1S*2T*3S"));
    }
}
