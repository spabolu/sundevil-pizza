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
        label_one.setText(Main.orderList.get(0).pizza.toString());
    }

    private Stage stage;
    private Scene scene;
    private Parent root;


<<<<<<< Updated upstream
=======



>>>>>>> Stashed changes
    //  TODO: remove this method once done debugging at the end
    public void switchToChef(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChefTrack.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

//        label_one.setText(Main.orderList.get(0).pizza.toString());
                label_one.setText("Hello World");
        progressbar_student_two.setDisable(true);
        stage.show();
    }

}

