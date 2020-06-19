package com.equals;

public class EqualsAndHashCode {

    public static void testEquals(){
        String s1 = new String("prateek");
        String s2 = new String("prateek");

        Integer i1 = 12;
        Integer i2 = 12;


        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

    }
}
