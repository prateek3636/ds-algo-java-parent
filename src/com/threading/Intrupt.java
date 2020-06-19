package com.threading;

public class Intrupt implements Runnable  {

    public void run() {
        System.out.println("started..");
//        for(int i=0; i<1000; i++){
//            System.out.println("i--- "+i);
//        }
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("inturppted..");
            return;
        }

        System.out.println("ending..");
    }
}
