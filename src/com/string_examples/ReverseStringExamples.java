package com.string_examples;

public class ReverseStringExamples {
    
    public static StringBuilder revStr(String str){

        //Create StringBuilder object to store reversed version for str
        StringBuilder sb = new StringBuilder();

        //Iterate over input string from the back and use charAt() to get single char
        for(int i = str.length()-1; i>=0; i--){

            sb.append(str.charAt(i));
        }

        return sb;
    }
    public static void main(String[] args) {
        
        System.out.println(revStr("apple"));
        System.out.println(revStr("time"));

    }
}
