package main.java.utils;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return ((Integer)student1.getGrade()).compareTo(student2.getGrade());
    }
}