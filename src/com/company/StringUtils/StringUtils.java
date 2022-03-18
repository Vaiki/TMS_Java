package com.company.StringUtils;


import java.util.Locale;
import java.util.Scanner;

public class StringUtils {


    static String firstTwoBlocksNum(String str) {
        String[] subStr = str.split("-", 4);

        return subStr[0] + " " + subStr[2];
    }

    static String changeLetters(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.replace(5, 8, "***");
        builder.replace(14, 17, "***");
        return builder.toString();
    }

    private static StringBuilder formatterLetter(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                builder.append(str.charAt(i));
            }
        }
        builder.insert(3, "/");
        builder.insert(7, "/");
        builder.insert(9, "/");
        return builder;
    }

    static String formatterLettersLower(String str) {
        return formatterLetter(str).toString().toLowerCase(Locale.ROOT);
    }

    static String formatterLettersUpper(String str) {
        return "Letters:"+formatterLetter(str).toString().toUpperCase(Locale.ROOT);
    }

    static Boolean sequenceSearchAbc(String str){
        return str.contains("abc")||str.contains("ABC");
    }
    static Boolean sequenceSearchFirst555(String str){
        return str.indexOf("555")==0;
    }
    static Boolean sequenceSearchEnd1a2b(String str){
        return str.indexOf("1a2b",18)==18;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // String str = sc.nextLine();
        String str = "5555-wer-4536-abc-1a2b";
        System.out.println(StringUtils.firstTwoBlocksNum(str));
        System.out.println(StringUtils.formatterLettersUpper(str));
        System.out.println(StringUtils.formatterLettersLower(str));
        System.out.println(StringUtils.sequenceSearchEnd1a2b(str));
        System.out.println(StringUtils.sequenceSearchFirst555(str));
        System.out.println(StringUtils.changeLetters(str));
        sc.close();
    }
}
