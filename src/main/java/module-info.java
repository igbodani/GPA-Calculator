module GPA.Calculator.main {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires com.google.gson;
    requires com.google.common;
    exports edu.isu.cs.student.project to com.google.gson;
    opens edu.isu.cs.student.project;
}