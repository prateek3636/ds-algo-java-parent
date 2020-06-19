package com.lamda;

import java.io.Serializable;
import java.util.function.Function;

public class TestFunctionalDemo implements Serializable {

    public void testMethodImpl(FunctionalDemo functionalDemo, String s){
        functionalDemo.testMethod(s);
    }

    public String add(String s, Function<String, String> foo){
        return foo.apply(s);
    }
}
