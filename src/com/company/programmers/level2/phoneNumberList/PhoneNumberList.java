package com.company.programmers.level2.phoneNumberList;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {

    public boolean solution(String[] phone_book){

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PhoneNumberList list = new PhoneNumberList();
        String[] num = new String[]{"12","123","1235","567","88"};
        System.out.println(list.solution(num));
    }
}
