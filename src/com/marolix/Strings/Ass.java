package com.marolix.Strings;

import java.util.Scanner;

public class Ass 
{
    public static String[] splitAndCapitalize(String input) {
        String[] words = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            words[i] = sb.toString();
        }
        
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string");
        String inputString=scanner.nextLine();
        String[] result = splitAndCapitalize(inputString);
        for (String string : result) 
        {
            System.out.println(string);
        }
    }
{

}
}
