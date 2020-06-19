package com.threading;

import java.util.Random;
import java.util.concurrent.Callable;

public class CTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(300);
        return new Random().nextInt();
    }
}
