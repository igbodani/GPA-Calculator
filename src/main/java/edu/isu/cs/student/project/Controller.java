package edu.isu.cs.student.project;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<Integer> numbersList;
    @FXML
    private TextField courseName1,courseName2,courseName3,courseName4,courseName5,courseName6,courseName7;
    @FXML
    private ChoiceBox<String> courseGrades1,courseGrades2,courseGrades3,courseGrades4,courseGrades5,courseGrades6,courseGrades7;
    @FXML
    private TextField courseCredit1,courseCredit2,courseCredit3,courseCredit4,courseCredit5,courseCredit6,courseCredit7;
    @FXML
    private Button submit;
    @FXML
    Label gpa;

    private int currentValue;
    private int previousValue;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<Integer> numbers = FXCollections.observableArrayList();
        numbers.addAll(2,3,4,5,6,7);
        numbersList.getItems().addAll(numbers);

        TextField [] courseNameList = {courseName1,courseName2,courseName3,courseName4,courseName5,courseName6,courseName7};
        TextField [] creditValueList = {courseCredit1,courseCredit2,courseCredit3,courseCredit4,courseCredit5,courseCredit6,courseCredit7};
        ArrayList<ChoiceBox<String>> gradeList = new ArrayList<>(7);

        gradeList.add(courseGrades1);
        gradeList.add(courseGrades2);
        gradeList.add(courseGrades3);
        gradeList.add(courseGrades4);
        gradeList.add(courseGrades5);
        gradeList.add(courseGrades6);
        gradeList.add(courseGrades7);

        ObservableList<String> grades = FXCollections.observableArrayList();
        grades.addAll("A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F");

        for(int i = 0; i <7; i++){
            gradeList.get(i).getItems().addAll(grades);
            gradeList.get(i).setVisible(false);
            courseNameList[i].setVisible(false);
            creditValueList[i].setVisible(false);
        }

        numbersList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(oldValue != null){
                previousValue = oldValue;
            }
            currentValue = newValue;
              for (int i = 0; i < newValue; i++) {
                  courseNameList[i].setVisible(true);
                  creditValueList[i].setVisible(true);
                  gradeList.get(i).setVisible(true);
              }
            if(previousValue != currentValue) {
              for (int i = newValue; i < courseNameList.length; i++) {
                  courseNameList[i].setVisible(false);
                  creditValueList[i].setVisible(false);
                  gradeList.get(i).setVisible(false);
              }
          }
        });

        submit.setOnAction(event -> {
            for(int i = 0; i < currentValue; i++) {
               if (creditValueList[i].getText().matches("[1-9]") && !courseNameList[i].getText().isEmpty() && !creditValueList[i].getText().isEmpty() && !gradeList.get(i).getValue().isEmpty()) {
                    GpaCalculator.addCourse(courseNameList[i].getText(), Integer.parseInt(creditValueList[i].getText()), gradeList.get(i).getValue());
                }
            }
           if(GpaCalculator.size() == numbersList.getValue()) {
               String gpaValue = String.format("%.2f", GpaCalculator.calculate());
               gpa.setText(gpaValue);
           }
        });
    }
}
