package com.company.thread;

import java.util.concurrent.TimeUnit;

public class Something implements Runnable {
    @Override
    public void run() {
        System.out.println(" Выполнить запуск " + Thread.currentThread().getName() +
                "\n Выполнение " + Thread.currentThread().getName() + " завершено");
    }
}

class Example {
    public static void main(String[] args) throws InterruptedException {
        Something something = new Something();
        Thread t1 = new Thread(something, "T1");
        Thread t2 = new Thread(something, "T2");
        Thread t3 = new Thread(something, "T3");
      

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
