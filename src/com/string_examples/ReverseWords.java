package com.string_examples;

public class ReverseWords {

    public static String revWords(String str){

        //Create StringBuilder object to store 
        StringBuilder res = new StringBuilder();

        //Split input string by " "space to get each word as String[]
        String[] words = str.split(" ");

        //Loop over the array from back
        for(int i = words.length-1; i>=0; i--){

            res.append(words[i]).append(" ");
        }
            return res.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(revWords("Apple Banana Kiwi"));

        System.out.println(revWords("Kunja love I"));
    }
    
}
