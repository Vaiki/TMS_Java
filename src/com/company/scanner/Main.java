package com.company.scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select task\n1. Scanner\n2. Args");
        int num = sc.nextInt();
        switch (num) {

            case 1:
                System.out.println("Enter your Eng name: ");
                sc.nextLine();
                String name = sc.nextLine();
                while (isDigitPresent(name)) {
                    System.out.println("Name must contain only latin letters,\nplease try again: ");
                    name = sc.nextLine();
                }
                System.out.println("Hello, " + name);
                sc.close();
                break;

            case 2:
                if (args.length > 0) {
                    for (String str : args
                    ) {
                        System.out.println("Hello, " + str);
                    }
                } else System.out.println("Args is empty");
        }
    }

    private static boolean isDigitPresent(String currencyCode) {
        char[] chars = currencyCode.toCharArray();
        boolean isLetter = false;
        if (currencyCode.isEmpty()) {
            return true;
        }
        for (char character : chars
        ) {
            if (!Character.isLetter(character)) {
                isLetter = true;
            }
        }
        return isLetter;
    }
}
