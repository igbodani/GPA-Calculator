package edu.isu.cs.student.project;

public class Course{
    private String name;
    private int credit;
    private String  grade;

    public Course(String name, int credit, String grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public double getGrade() {
        if(grade.equals("A")){
            return  4.0;
        }
        else if(grade.equals("A-")){
            return  3.70;
        }
        else if(grade.equals("B+")){
            return  3.30;
        }
        else if(grade.equals("B")){
            return 3.00;
        }
        else if(grade.equals("B-")){
            return 2.70;
        }
        else if(grade.equals("C+")){
            return 2.30;
        }
        else if(grade.equals("C")){
            return 2.00;
        }
        else if(grade.equals("C-")){
            return 1.70;
        }
        else if(grade.equals("D+")){
            return 1.30;
        }
        else if(grade.equals("D")){
            return 1.00;
        }
        else if(grade.equals("D-")){
            return 0.70;
        }
        else if(grade.equals("F")){
            return 0.002;
        }
        return (double) 0;
    }

    public void setGrade(String grade ) {
        this.grade = grade;


    }
}

