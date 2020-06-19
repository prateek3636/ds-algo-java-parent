package com.threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class TestBlockingQueue {

    public static void test() throws Exception{
        MyBlockingQueue<Item> queue = new MyBlockingQueue<Item>(10);

        Runnable producer = () ->{
//            while (true){
                try{
                    System.out.println("producing");
                    queue.put(createItem());

                }catch (Exception ex){}
//            }
        };

        new Thread(producer).start();

        Runnable consumer = () ->{
//            while (true){
                try{
                    System.out.println("consuming");
                    Item i = queue.take();
                    process(i);
                }catch (Exception ex){}

//            }
        };

//        new Thread(consumer).start();

        Thread.sleep(10000);
        new Thread(consumer).start();



    }

    public static Item createItem(){
        return new Item(Math.random());
    }

    public static void process(Item i){
        System.out.println(i.getNumber());
    }

    public static class Item{
        double number;

        public Item(double name){
            this.number = name;
        }

        public double getNumber(){
            return this.number;
        }

    }
}
