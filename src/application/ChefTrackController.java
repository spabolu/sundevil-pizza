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

    //    BigDecimal progressvalue_one = new BigDecimal(String.format("%.2f", 0.0));
    //    BigDecimal progressvalue_two = new BigDecimal(String.format("%.2f", 0.0));
    //    BigDecimal progressvalue_three = new BigDecimal(String.format("%.2f", 0.0));
    //    BigDecimal progressvalue_four = new BigDecimal(String.format("%.2f", 0.0));

    //    static ArrayList<BigDecimal> pizzaProgress = new ArrayList<BigDecimal>();
    //
    //    public static void main(String args) {
    //        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
    //        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
    //        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
    //        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
    //    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    static double percentStatus(Status pizzaStatus) {
        switch (pizzaStatus) {
            case ACCEPTED:
                return 0.2;
            case READY_TO_COOK:
                return 0.4;
            case COOKING:
                return 0.6;
            case READY:
                return 1.00;
            default:
                return 0;
        }

    }

    public void increaseProgress(ActionEvent event) {
        Button sourceButton = (Button) event.getSource();
        if (sourceButton.equals(button_one)) {
            progressbar_one.setProgress(percentStatus(Main.orderList.get(0).getStatus()));
            Main.orderList.get(0).setStatus(Order.updateStatus(Main.orderList.get(0).getStatus()));
        } else if (sourceButton.equals(button_two)) {
            progressbar_two.setProgress(percentStatus(Main.orderList.get(1).getStatus()));
            Main.orderList.get(1).setStatus(Order.updateStatus(Main.orderList.get(1).getStatus()));
        } else if (sourceButton.equals(button_three)) {
            progressbar_three.setProgress(percentStatus(Main.orderList.get(2).getStatus()));
            Main.orderList.get(2).setStatus(Order.updateStatus(Main.orderList.get(2).getStatus()));
        } else if (sourceButton.equals(button_four)) {
            progressbar_four.setProgress(percentStatus(Main.orderList.get(3).getStatus()));
            Main.orderList.get(3).setStatus(Order.updateStatus(Main.orderList.get(3).getStatus()));
        }

//        if (sourceButton.equals(button_one)) {
//            if (pizzaProgress.get(0).doubleValue() < 1) {
//                pizzaProgress.set(0, new BigDecimal(String.format("%.2f", pizzaProgress.get(0).doubleValue() + 0.2)));
//                System.out.println("ProgressBar1: " + pizzaProgress.get(0).doubleValue());
//                progressbar_one.setProgress(pizzaProgress.get(0).doubleValue());
//                //                StudentTrackController.progressbar_student_one.setProgress(pizzaProgress.get(0).doubleValue());
//            }
//        } else if (sourceButton == button_two) {
//            if (pizzaProgress.get(1).doubleValue() < 1) {
//                pizzaProgress.set(1, new BigDecimal(String.format("%.2f", pizzaProgress.get(1).doubleValue() + 0.2)));
//                System.out.println("ProgressBar2: " + pizzaProgress.get(1).doubleValue());
//                progressbar_two.setProgress(pizzaProgress.get(1).doubleValue());
//                //                StudentTrackController.progressbar_student_two.setProgress(ChefTrackController.progressbar_one.getProgress());
//            }
//        } else if (sourceButton == button_three) {
//            if (pizzaProgress.get(2).doubleValue() < 1) {
//                pizzaProgress.set(2, new BigDecimal(String.format("%.2f", pizzaProgress.get(2).doubleValue() + 0.2)));
//                System.out.println("ProgressBar3: " + pizzaProgress.get(2).doubleValue());
//                progressbar_three.setProgress(pizzaProgress.get(2).doubleValue());
//            }
//        } else if (sourceButton == button_four) {
//            if (pizzaProgress.get(3).doubleValue() < 1) {
//                pizzaProgress.set(3, new BigDecimal(String.format("%.2f", pizzaProgress.get(3).doubleValue() + 0.2)));
//                System.out.println("ProgressBar4: " + pizzaProgress.get(3).doubleValue());
//                progressbar_four.setProgress(pizzaProgress.get(3).doubleValue());
//            }
//        }
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

//  TODO: remove this method once done debugging at the end
    public void switchToStudent(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("StudentTrack.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}