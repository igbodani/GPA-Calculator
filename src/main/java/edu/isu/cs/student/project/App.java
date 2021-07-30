package edu.isu.cs.student.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        URL url = new File("src/main/java/edu/isu/cs/student/project/GpaCalculatorScene.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root, 634, 640);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gpa-Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
