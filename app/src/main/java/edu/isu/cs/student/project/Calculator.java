package edu.isu.cs.student.project;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
    static List<Course> courseList = new ArrayList<>();
    static float totalCredit;
    static float totalPoints;
    static float gpa;
    final String NOTATIONAL = "GHIJKLMNOPQRSTUVZ";


    public static  float calculate(List<Course> courseList){
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
        if(!grade.contains(NOTATIONAL)) {
            Course course = new Course(name, number, grade);
            courseList.add(course);
        }

    }

    private static void saveData() throws IOException {

        Gson gson = new Gson();
        String json = gson.toJson(courseList);
        String jsonCal = gson.toJson(Calculator.calculate(courseList));

        try{
            Files.writeString(Paths.get("./Grades.json"),json);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    private static void loadData() throws IOException {

        Gson gson = new Gson();

    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addCourse("CS 11", 3, "A");
        calc.addCourse("cs 12", 3, "A");
        calc.addCourse("cs 13", 3, "A");
        calc.addCourse("cs 14", 3, "A-");

        System.out.println(calculate(courseList));


        ArrayList<String > test = new ArrayList<>();
        String [] ind = {"jame", "fin", "klaus"};
        test.addAll(Arrays.asList(ind));
        System.out.println(test);
        Collections.reverse(test);
        System.out.println(test);

    }



}
