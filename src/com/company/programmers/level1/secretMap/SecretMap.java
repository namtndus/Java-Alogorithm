package com.company.programmers.level1.secretMap;

public class SecretMap {
    public String[] solution(int n, int[] arr1,int[] arr2){
        String[] answer = new String[n];


        for(int i = 0;  i<n; i++){
            StringBuilder sb = new StringBuilder();
            int num1 = arr1[i];
            int num2 = arr2[i];
            for(int j = 0; j<n; j++){

                if(num1 %2 ==1 || num2 %2 == 1){
                    sb.insert(0,"#");
                }else{
                    sb.insert(0," ");
                }
                num1 = num1/2;
                num2 = num2/2;
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap map = new SecretMap();
        int[] arr1 = new int[]{46,33,33,22,31,50};
        int[] arr2 = new int[]{27,56,19,14,14,10};
        String[] result = map.solution(6,arr1,arr2);
        for(String i : result){
            System.out.println(i);
        }
    }

}
