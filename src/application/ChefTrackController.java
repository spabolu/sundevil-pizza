package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
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

    BigDecimal progressvalue_one = new BigDecimal(String.format("%.2f", 0.0));
    BigDecimal progressvalue_two = new BigDecimal(String.format("%.2f", 0.0));
    BigDecimal progressvalue_three = new BigDecimal(String.format("%.2f", 0.0));
    BigDecimal progressvalue_four = new BigDecimal(String.format("%.2f", 0.0));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        progressbar_one.setStyle("-fx-accent: blue;");

    }

    public void increaseProgress(ActionEvent event) {
        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(button_one)) {
            if (progressvalue_one.doubleValue() < 1) {
                progressvalue_one = new BigDecimal(String.format("%.2f", progressvalue_one.doubleValue() + 0.1));
                System.out.println(progressvalue_one.doubleValue());
                progressbar_one.setProgress(progressvalue_one.doubleValue());
            }
        } else if (sourceButton == button_two) {
            if (progressvalue_two.doubleValue() < 1) {
                progressvalue_two = new BigDecimal(String.format("%.2f", progressvalue_two.doubleValue() + 0.1));
                System.out.println(progressvalue_two.doubleValue());
                progressbar_two.setProgress(progressvalue_two.doubleValue());
            }
        } else if (sourceButton == button_three) {
            if (progressvalue_three.doubleValue() < 1) {
                progressvalue_three = new BigDecimal(String.format("%.2f", progressvalue_three.doubleValue() + 0.1));
                System.out.println(progressvalue_three.doubleValue());
                progressbar_three.setProgress(progressvalue_three.doubleValue());
            }
        } else if (sourceButton == button_four) {
            if (progressvalue_four.doubleValue() < 1) {
                progressvalue_four = new BigDecimal(String.format("%.2f", progressvalue_four.doubleValue() + 0.1));
                System.out.println(progressvalue_four.doubleValue());
                progressbar_four.setProgress(progressvalue_four.doubleValue());
            }
        }


    }
}
