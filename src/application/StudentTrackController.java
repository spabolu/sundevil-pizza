package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentTrackController implements Initializable {

    @FXML
    static ProgressBar progressbar_student_one;

    @FXML
    static ProgressBar progressbar_student_two;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        progressbar_student_one.setProgress(); // trying to grab array values from other class to this one to show the progress
//        progressbar_student_two.setProgress(ChefTrackController.pizzaProgress.get(1).doubleValue());
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToChef(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChefTrack.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


//    public static void main(String[] args) {
//        test();
//    }
}

