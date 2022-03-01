package com.company.array;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[] triangle = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Task #1 Triangle\nEnter the length of the sides: ");
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = sc.nextInt();
        }
        if ((triangle[0] + triangle[1]) <= triangle[2] || (triangle[0] + triangle[2]) <= triangle[1] || triangle[1] + triangle[2] <= triangle[0]) {
            System.out.println("It's not a triangle");
        } else System.out.println("It's a triangle\n");

        System.out.println("Task #2 \nEnter int i:");
        int i = sc.nextInt();
        if (i < 0) {
            System.out.println("i-2= " + (i - 2));
        }
        if (i > 0) {
            System.out.println("i+1= " + (i + 1));
        } else {
            System.out.println("i= " + (i + 10));
        }

        System.out.println("\nTask #3\nEnter the number of programmers: ");

        int num = sc.nextInt();
        if (num % 10 == 1) {
            System.out.println("У нас " + num + " программист");
        }
        if (num % 10 > 1 && num % 10 <= 4) {
            System.out.println("У нас " + num + " программиста");
        }
        if (num % 10 == 0 || num % 10 >= 5) {
            System.out.println("У нас " + num + " программистов");
        }
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTask #4");
        int[] x = new int[10];
        int start = 0;
        for (int y = 0; y < x.length; y++) {
            start = start + 2;
            x[y] = start;
            System.out.print(x[y] + " ");
        }

        System.out.println();
        for (int q : x) {
            System.out.println(q);
        }
        System.out.println("\nTask #5");
        int count = 0;
        int[] arrRandom = new int[15];
        for (int y = 0; y < arrRandom.length; y++) {
            arrRandom[y] = (int) (Math.random() * 99);
            if (arrRandom[y] % 2 != 0) count++;
            System.out.print(arrRandom[y] + " ");
        }
        System.out.println("\nNumber of odd numbers: " + count);

        System.out.println("\nTask #6 ");
        int[] arrRand = new int[12];
        int max=0;
        int index=0;
        for (int y = 0; y < arrRand.length; y++) {
            arrRand[y] = (int) (Math.random() * 15);
            if (arrRand[y]>max){max=arrRand[y];
            index = y;
            }
            System.out.print(arrRand[y] + " ");
        }
        System.out.printf("\nMax value: %d, index: %d",max,index);


    }


}
