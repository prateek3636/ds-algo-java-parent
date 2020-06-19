package com.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CTaskTest {

    public static void test() throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        System.out.println("start");
        Future<Integer> integerFuture = executorService.submit(new CTask());
        System.out.println("middle");
        System.out.println(integerFuture.get());
        System.out.println("end");
    }
}
