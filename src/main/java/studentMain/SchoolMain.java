package main.java.studentMain;

import main.java.utils.School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        school.add("Jason",2);
        school.add("Gilda",5);
        school.add("Chris",2);
        school.add("Alex",5);
        school.add("Chelsea", 3);
        school.add("Logan", 7);
        school.add("James",2);
        school.add("Blair",2);
        school.add("Paul",2);
        System.out.println();
        System.out.println(school.grade(2));
        System.out.println(school.numberOfStudents());
        school.studentsByGradeAlphabetical();
        System.out.println(school.toString());
    }
}
