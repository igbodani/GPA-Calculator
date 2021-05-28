package edu.isu.cs.student.project;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    static List<Course> courseList = new ArrayList<>();
    static float totalCredit;
    static float totalPoints;
    static float gpa;


    public float calculate(List<Course> courseList){
        for(Course element : courseList){
            totalCredit += element.getCredit();
            totalPoints += element.getCredit() * element.getGrade() ;
        }


        System.out.println(totalCredit);
        System.out.println(totalPoints);
        gpa =  totalPoints/totalCredit;
        return gpa;

    }

    public void addCourse(String name, int number, String grade){
        Course course  = new Course(name, number, grade);
        courseList.add(course);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addCourse("CS 11", 3, "A");
        calc.addCourse("cs 12", 3, "A");
        calc.addCourse("cs 13", 3, "A");
        calc.addCourse("cs 14", 3, "A-");



        System.out.println(calc.calculate(courseList));
    }



}
