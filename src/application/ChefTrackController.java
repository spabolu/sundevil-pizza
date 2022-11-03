package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ChefTrackController implements Initializable {
    double progress;
    @FXML
    private ProgressBar myprogressBar;
    @FXML
    private Button mybutton;
    @FXML
    private Label mylabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        myprogressBar.setStyle("-fx-accent: red;");
    }

    public void increaseProgress() {

    }
}
