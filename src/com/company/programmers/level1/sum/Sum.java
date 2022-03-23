package com.company.programmers.level1.sum;

public class Sum {

    public static void main(String[] args) {
        int[] absolute = {1,2,3};
        boolean[] signs = {false,false,true};
        int sum = 0;

        for(int i = 0; i<absolute.length; i++){
            if(signs[i] == true){
                sum += absolute[i];
            }else{
                sum -= absolute[i];
            }
        }

        System.out.println(sum);
    }

}
