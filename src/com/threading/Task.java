package com.threading;

public class Task implements Runnable{

    public void run(){
        System.out.println("Seperate thread started - " + Thread.currentThread().getName());
    }
}
