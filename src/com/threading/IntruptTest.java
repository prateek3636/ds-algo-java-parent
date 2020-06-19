package com.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IntruptTest {

    public static void test(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Intrupt());
        executorService.shutdown();
    }
}
