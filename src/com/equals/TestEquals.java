package com.equals;

import java.util.HashMap;

public class TestEquals {

    public static void test(){

        Student s1 = new Student("reg1");
        Student s2 = new Student("reg2");
        Student s3 = new Student("reg2");

        Scorecard r1 = new Scorecard(100);
        Scorecard r2 = new Scorecard(200);
        Scorecard r3 = new Scorecard(300);

        HashMap<Student, Scorecard> scorecardHashMap = new HashMap<>();
//
        scorecardHashMap.put(s1,r1);
//        scorecardHashMap.get(s1);
        scorecardHashMap.put(s2,r2);
        scorecardHashMap.put(s3,r3);
//
//        Student s4 = new Student("reg1");
//
//
//        System.out.println(scorecardHashMap.get(s3).getScore());
        System.out.println(scorecardHashMap.size());

    }
}
