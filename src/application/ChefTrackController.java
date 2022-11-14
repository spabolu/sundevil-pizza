package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    @FXML
    private Label label_one;
    @FXML
    private Label label_two;
    @FXML
    private Label label_three;
    @FXML
    private Label label_four;

    @FXML
    private Label id_one;
    @FXML
    private Label id_two;
    @FXML
    private Label id_three;
    @FXML
    private Label id_four;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Main.orderList.size() < 1) {
            label_one.setText("No Order Yet");
        } else {
            label_one.setText(Main.orderList.get(0).pizza.toString());
        }

        if (Main.orderList.size() < 2) {
            label_two.setText("No Order Yet");
        } else {
            label_two.setText(Main.orderList.get(1).pizza.toString());
        }

        if (Main.orderList.size() < 3) {
            label_three.setText("No Order Yet");
        } else {
            label_three.setText(Main.orderList.get(2).pizza.toString());
        }

        if (Main.orderList.size() < 4) {
            label_four.setText("No Order Yet");
        } else {
            label_four.setText(Main.orderList.get(3).pizza.toString());
        }


        if (Main.orderList.size() < 1) {
            id_one.setText("");
        } else {
            id_one.setText("Order# " + Main.orderList.get(0).getID());
        }

        if (Main.orderList.size() < 2) {
            id_two.setText("");
        } else {
            id_two.setText("Order# " + Main.orderList.get(1).getID());
        }

        if (Main.orderList.size() < 3) {
            id_three.setText("");
        } else {
            id_three.setText("Order# " + Main.orderList.get(2).getID());
        }

        if (Main.orderList.size() < 4) {
            id_four.setText("");
        } else {
            id_four.setText("Order# " + Main.orderList.get(3).getID());
        }

    }

    static double percentStatus(Status pizzaStatus, int i) {
        switch (pizzaStatus) {
            case ACCEPTED:
                return 0.2;
            case READY_TO_COOK:
                return 0.4;
            case COOKING:
                return 0.6;
            case READY:
                System.out.print("Order# " + i + " is ready to pick up!");
                return 1.00;
            default:
                return 0;
        }

    }

    public void increaseProgress(ActionEvent event) {
        Button sourceButton = (Button) event.getSource();
        if (sourceButton.equals(button_one)) {
            progressbar_one.setProgress(percentStatus(Main.orderList.get(0).getStatus(), 0));
            Main.orderList.get(0).setStatus(Order.updateStatus(Main.orderList.get(0).getStatus()));
        } else if (sourceButton.equals(button_two)) {
            progressbar_two.setProgress(percentStatus(Main.orderList.get(1).getStatus(), 1));
            Main.orderList.get(1).setStatus(Order.updateStatus(Main.orderList.get(1).getStatus()));
        } else if (sourceButton.equals(button_three)) {
            progressbar_three.setProgress(percentStatus(Main.orderList.get(2).getStatus(), 2));
            Main.orderList.get(2).setStatus(Order.updateStatus(Main.orderList.get(2).getStatus()));
        } else if (sourceButton.equals(button_four)) {
            progressbar_four.setProgress(percentStatus(Main.orderList.get(3).getStatus(), 3));
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

}