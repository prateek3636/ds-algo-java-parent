package com.threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

    private Queue<E> queue;
    private int max = 16;
//    private ReentrantLock lock = new ReentrantLock(true);
    private Object notEmpty = new Object();
    private Object notFull = new Object();


    public MyBlockingQueue(int size){
        queue = new LinkedList<>();
    }

    public synchronized void put(E e){
            System.out.println("in put with lock - "  );
            while (queue.size() == max){
                try {

                    notFull.wait();
            }catch (Exception ex){

            }
            }
            queue.add(e);
            notEmpty.notifyAll();

    }

    public synchronized E take(){
//        try {
            System.out.println("in take with lock - " );
            if(queue.size() == 0){
                try{
                    notEmpty.wait();

                }catch (Exception ex){

                }
            }
            E e = queue.remove();
            notFull.notifyAll();
            return e;
//        }catch (Exception ex){

//        }
    }
}
