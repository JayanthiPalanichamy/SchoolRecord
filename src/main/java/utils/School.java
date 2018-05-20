package main.java.utils;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    ArrayList<Student> studentArrayList;

    public School() {
        studentArrayList = new ArrayList<>();
    }

    public void add(String name, int grade) {
        Student student = new Student(name,grade);
        studentArrayList.add(student);
    }

    public int numberOfStudents() {
        return studentArrayList.size();
    }

    public ArrayList<String> grade(int grade) {
        ArrayList<String> studentsOfGrade = new ArrayList<>();
        for (Student student: studentArrayList
             ) {
                if(student.getGrade() == grade) {
                    studentsOfGrade.add(student.getName());
                }
        }
        return studentsOfGrade;
    }

    public void studentsByGradeAlphabetical() {
        ArrayList<Student> sortedStudentList = new ArrayList<>();
        Collections.sort(studentArrayList, new StudentChainedComparator(
                new StudentGradeComparator(),
                new StudentNameComparator())
        );
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student:studentArrayList
             ) {
            stringBuilder.append(student.getName());
            stringBuilder.append("\t");
            stringBuilder.append(student.getGrade());
            stringBuilder.append("\n");
        }
        String resultString;
        resultString = stringBuilder.toString();
        return resultString;
    }
}
