package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class firstPageController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //Textbox chef and student name
    @FXML
    private TextField studentName = new TextField();
    @FXML
    private TextField chefName = new TextField();

    //ID fields used for chef and student 
    @FXML
    private PasswordField chefIDEntered = new PasswordField();
    @FXML
    private PasswordField studentIDEntered = new PasswordField();


    //student and chef side button
    @FXML
    private Button studentButton;
    @FXML
    private Button chefButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //initialize

    }

    //student ID array - ins
    int[] studentIdDatabase = {1223574645, 1223453645, 1223453798, 1223674138};

    //chef ID array
    int[] chefIdDatabase = {1113574923, 1119357623, 1117499023, 1112274923};


    //****************************************************************************
    //if the student side "next" button is clicked
    //check if ID is entered, is a 10 digit integer and is in the student database
    @FXML
    public void goToStudent(ActionEvent event) throws IOException {

        boolean checkVal = false; //
        boolean containsChar = false; //set to true if ID contains characters
        sName = studentName.getText();
        int studentIdAsNum = 0;
        String studentIDString = studentIDEntered.getText();

        System.out.println("Student Name: " + sName);
        System.out.println("Student# " + studentIDString + "\n");

        try { //parse the string input from password field to an int
            studentIdAsNum = Integer.parseInt(studentIDString);
        } catch (NumberFormatException nfe) {
            containsChar = true;
            //if the input contains other characters display error
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid ID type");
            alert.setHeaderText("Input contains characters\n Enter your 10-digit ASU ID to authenticate");
            alert.showAndWait();
        }

        //checking if the entered ID is in the database array
        checkVal = false;
//        System.out.println(checkVal);
        for (int i = 0; i < studentIdDatabase.length; i++) {

            if (studentIdDatabase[i] == studentIdAsNum) {
                checkVal = true;
            }
        }
//        System.out.println("The value after the for loop: " + checkVal);

        //if the ID is authenticated move to pizza ordering screen
        if (checkVal) {
            root = FXMLLoader.load(getClass().getResource("PizzaSelection.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if (!containsChar) { //if the ID is not in the database AND contains only integers, display error and wait for new input

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid ASU ID");
            alert.setHeaderText("Your 10-digit input is not an ASU ID\n Please try again with a valid ASU ID");
            alert.showAndWait();

        }

    }

    //**************************************************************************
    //if the chef side "next" button is clicked
    //check if ID is entered, is a 10 digit integer and is in the chef database
    @FXML
    public void goToChef(ActionEvent event) throws IOException {

        boolean checkVal = false; //
        boolean containsChar = false; //set to true if ID contains characters
        cName = chefName.getText();
        int chefIdAsNum = 0;
        String chefIDString = chefIDEntered.getText();

        System.out.println(cName);
        System.out.println(chefIDString);

        try { //parse the string input from password field to an int
            chefIdAsNum = Integer.parseInt(chefIDString);
        } catch (NumberFormatException nfe) {
            containsChar = true;
            //if the input contains other characters display error
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid ID type");
            alert.setHeaderText("Input contains characters\n Enter your 10-digit Chef ID to authenticate");
            alert.showAndWait();
        }

        //checking if the entered ID is in the database array
        checkVal = false;
        System.out.println(checkVal);
        for (int i = 0; i < chefIdDatabase.length; i++) {

            if (chefIdDatabase[i] == chefIdAsNum) {
                checkVal = true;
            }
        }
        System.out.println("The value after the for loop: " + checkVal);

        //if the ID is authenticated move to pizza ordering screen
        if (checkVal) {
            root = FXMLLoader.load(getClass().getResource("ChefTrack.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if (!containsChar) { //if the ID is not in the database AND contains only integers, display error and wait for new input

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid Chef ID");
            alert.setHeaderText("Your 10-digit input is not a Chef ID\n Please try again with a valid Chef ID");
            alert.showAndWait();

        }

    }


}
