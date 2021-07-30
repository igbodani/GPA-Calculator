package edu.isu.cs.student.project;

public class Course {
    private String name;
    private int credit;
    private String grade;

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
        return switch (grade) {
            case "A" -> 4.0;
            case "A-" -> 3.70;
            case "B+" -> 3.30;
            case "B" -> 3.00;
            case "B-" -> 2.70;
            case "C+" -> 2.30;
            case "C" -> 2.00;
            case "C-" -> 1.70;
            case "D+" -> 1.30;
            case "D" -> 1.00;
            case "D-" -> 0.70;
            case "F" -> 0.000;
            default -> (double) 0;
        };
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                ", grade='" + grade + '\'' +
                '}';
    }
}
