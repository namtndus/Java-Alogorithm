package com.company.programmers.level2.phoneNumberList;

public class PhoneNumberList {

    public boolean solution(String[] phone_book){
        boolean answer = true;

        for(int i = 0; i< phone_book.length; i++){
            for(int j = i+1; j< phone_book.length; j++){
                if(phone_book[i].length() < phone_book[j].length()){
                    if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))){
                        return false;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PhoneNumberList list = new PhoneNumberList();
        String[] num = new String[]{"12","123","1235","567","88"};
        System.out.println(list.solution(num));
    }
}
