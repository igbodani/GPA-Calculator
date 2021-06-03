module GPA.Calculator.app.main {
    requires javafx.controls;
    requires javafx.graphics;
    requires com.google.gson;
    requires com.google.common;
    opens edu.isu.cs.student.project;
    exports edu.isu.cs.student.project;
}