package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class firstPageController implements Initializable{

    //Textbox chef and student name 
    @FXML
    private TextField studentName;
    @FXML
    private TextField chefName;

    //ID fields used for chef and student 
    @FXML
    private PasswordField studentIDEntered;
    @FXML
    private PasswordField chefIDEntered;

    //student and chef side button
    @FXML
    private Button studentButton;
    @FXML
    private Button chefButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        System.out.println("hi");
    }

    //student ID array - ins
    int[] studentIdDatabase = {0000000000, 0000000001, 0000000002, 0000000003};

    //chef ID array
    int[] chefIdDatabase = {0000000000, 0000000001, 0000000002, 0000000003};



    //****************************************
    //if the student side "next" button is clicked
    //check if ID is entered, is a 10 digit integer and is in the student database
    public void clickStudentNext(){
        //check if name is entered
        String studentID = studentIDEntered.getId();

        //check if studentID entry is the in the studentIdDatabase array

    }

    //****************************************
    //if the chef side "next" button is clicked
    //check if ID is entered, is a 10 digit integer and is in the chef database
    public void clickChefNext(){
        //check if name is entered
        //check if chefID entry is the in the chefIdDatabase array

    }

}
