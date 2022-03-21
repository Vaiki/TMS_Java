package com.company.thread.join;

import java.util.ArrayList;

public class Something implements Runnable {
    @Override
    public void run() {

        System.out.println(" Выполнить запуск " + Thread.currentThread().getName() +
                "\n Выполнение " + Thread.currentThread().getName() + " завершено");

    }

}

class Example {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Something(), "T1");
        Thread t2 = new Thread(new Something(), "T2");
        Thread t3 = new Thread(new Something(), "T3");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
