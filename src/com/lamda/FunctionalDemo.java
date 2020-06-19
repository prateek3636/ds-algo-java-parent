package com.lamda;

@FunctionalInterface
public interface FunctionalDemo {

    void testMethod(String s);

    default void testMethod1(String s){

    }
}
