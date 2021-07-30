package edu.isu.cs.student.project;

import java.util.ArrayList;
import java.util.List;

public class GpaCalculator {

    static List<Course> courseList = new ArrayList<>();
    static float totalCredit;
    static float totalPoints;
    static final String NOTATIONAL = "GHIJKLMNOPQRSTUVZ";


    public static  float calculate(){
        for(Course element : courseList){
            totalCredit += element.getCredit();
            totalPoints += element.getCredit() * element.getGrade() ;
        }
        return totalPoints / totalCredit;
    }

    public static void addCourse(String name, int number, String grade){
            Course course = new Course(name, number, grade);
            courseList.add(course);
    }

    public static int size(){
        return courseList.size();
    }
}
