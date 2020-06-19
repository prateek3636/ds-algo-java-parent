package com.equals;

import java.util.Objects;

public class Student {
    String regNo;

    public Student(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(regNo, student.regNo);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return Objects.hash(regNo);
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
