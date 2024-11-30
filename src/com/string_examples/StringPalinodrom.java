package com.string_examples;

public class StringPalinodrom {

    public static boolean isPal(String str){

        int start = 0;
        int end = str.length()-1;

        while (start<end) {

            if(str.charAt(start)!=str.charAt(end)) {
           
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println(isPal("man"));
        System.out.println(isPal("madam"));
        System.out.println(isPal("anna"));
        System.out.println(isPal("level"));
    }
}