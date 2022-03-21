package com.company.thread.lock;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Something implements Runnable {
   private final ReentrantLock locker;
   private final ArrayList<Integer> num;
Something(ArrayList<Integer> num, ReentrantLock lock){
    this.num = num;
    locker = lock;
}
    @Override
    public void run() {
       locker.lock();
        try{
       for (int i = 0;i<5;i++){
           num.add(i);
           System.out.printf("%s %d\n",Thread.currentThread().getName(),num.get(i));

               Thread.sleep(100);
           }}
           catch(InterruptedException ignored){}
        finally{
            locker.unlock();
        }
       }
   }





class Example {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> num = new ArrayList<>();
        ReentrantLock lock = new ReentrantLock();
        for(int i = 1;i<6;i++ ){
            Thread t = new Thread(new Something(num,lock));
            t.setName("Thread"+i);
            t.start();

        }

    }
}
