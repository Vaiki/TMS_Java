package com.company.thread.synchro;

import java.util.ArrayList;

public class Something implements Runnable {
     private final ArrayList<Integer> num;
     Something(ArrayList<Integer> num){
         this.num = num;
     }
    @Override
    public void run() {
       synchronized (num){
       for (int i = 0;i<5;i++){
           num.add(i);
           System.out.printf("%s %d\n",Thread.currentThread().getName(),num.get(i));
           try{
               Thread.sleep(100);
           }
           catch(InterruptedException ignored){}
       }

    }}

}

class Example {
    public static void main(String[] args) throws InterruptedException {
       ArrayList<Integer> num = new ArrayList<>();
        for(int i = 1;i<6;i++ ){
            Thread t = new Thread(new Something(num));
            t.setName("Thread"+i);
            t.start();

        }


    }
}
