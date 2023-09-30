package org.example;

import com.sun.source.tree.BreakTree;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

}
