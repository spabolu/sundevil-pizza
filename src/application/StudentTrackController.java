package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentTrackController implements Initializable {

    @FXML
    private ProgressBar progressbar_student_one;

    @FXML
    private ProgressBar progressbar_student_two;

    @FXML
    private Label label_one;

    @FXML
    private Label label_two;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Main.orderList.size() < 1) {
            label_one.setText("Please Order Something");
        } else {
            label_one.setText(Main.orderList.get(0).pizza.toString());
        }

        if (Main.orderList.size() < 2) {
            label_two.setText("Please Order Something");
        } else {
            label_two.setText(Main.orderList.get(1).pizza.toString());
        }
    }

}

