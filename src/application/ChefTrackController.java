package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ChefTrackController implements Initializable {
    @FXML
    private ProgressBar progressbar_one;

    @FXML
    private ProgressBar progressbar_two;

    @FXML
    private ProgressBar progressbar_three;

    @FXML
    private ProgressBar progressbar_four;

    @FXML
    private Button button_one;

    @FXML
    private Button button_two;

    @FXML
    private Button button_three;

    @FXML
    private Button button_four;

//    BigDecimal progressvalue_one = new BigDecimal(String.format("%.2f", 0.0));
//    BigDecimal progressvalue_two = new BigDecimal(String.format("%.2f", 0.0));
//    BigDecimal progressvalue_three = new BigDecimal(String.format("%.2f", 0.0));
//    BigDecimal progressvalue_four = new BigDecimal(String.format("%.2f", 0.0));

    static ArrayList<BigDecimal> pizzaProgress = new ArrayList<BigDecimal>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
    }

    public void increaseProgress(ActionEvent event) {
        Button sourceButton = (Button) event.getSource();
//        System.out.println(pizzaProgress.size());

        if (sourceButton.equals(button_one)) {
            if (pizzaProgress.get(0).doubleValue() < 1) {
                pizzaProgress.set(0, new BigDecimal(String.format("%.2f", pizzaProgress.get(0).doubleValue() + 0.2)));
                System.out.println("ProgressBar1: " + pizzaProgress.get(0).doubleValue());
                progressbar_one.setProgress(pizzaProgress.get(0).doubleValue());


//                StudentTrackController.progressbar_student_one.setProgress(ChefTrackController.progressbar_one.getProgress());

            }
        } else if (sourceButton == button_two) {
            if (pizzaProgress.get(1).doubleValue() < 1) {
                pizzaProgress.set(1, new BigDecimal(String.format("%.2f", pizzaProgress.get(1).doubleValue() + 0.2)));
                System.out.println("ProgressBar2: " + pizzaProgress.get(1).doubleValue());
                progressbar_two.setProgress(pizzaProgress.get(1).doubleValue());


//                StudentTrackController.progressbar_student_two.setProgress(ChefTrackController.progressbar_one.getProgress());
            }
        } else if (sourceButton == button_three) {
            if (pizzaProgress.get(2).doubleValue() < 1) {
                pizzaProgress.set(2, new BigDecimal(String.format("%.2f", pizzaProgress.get(2).doubleValue() + 0.2)));
                System.out.println("ProgressBar3: " + pizzaProgress.get(2).doubleValue());
                progressbar_three.setProgress(pizzaProgress.get(2).doubleValue());
            }
        } else if (sourceButton == button_four) {
            if (pizzaProgress.get(3).doubleValue() < 1) {
                pizzaProgress.set(3, new BigDecimal(String.format("%.2f", pizzaProgress.get(3).doubleValue() + 0.2)));
                System.out.println("ProgressBar4: " + pizzaProgress.get(3).doubleValue());
                progressbar_four.setProgress(pizzaProgress.get(3).doubleValue());
            }
        }
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToStudent(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("StudentTrack.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
