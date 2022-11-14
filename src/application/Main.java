package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<Order> orderList = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("firstPage.fxml")); // change the `.fxml` file here to load your scene for testing purposes
            System.out.println(root);// change the `.fxml` file here to load your scene
            stage.setTitle("SunDevil Pizza Kiosk"); // sets the title of the window
            Scene scene = new Scene(root, 1280, 720); // width: 1280 and height: 720
            stage.setResizable(false); // disables users to resize the window which can make the components get wonky
//			scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("application.css")).toExternalForm());
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        ArrayList<BigDecimal> pizzaProgress = new ArrayList<BigDecimal>(); // trying to make a central public array with data but not having any success so far --saketh
//
//        // progressbars starting values
//        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
//        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
//        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));
//        pizzaProgress.add(new BigDecimal(String.format("%.2f", 0.0)));

        launch(args);
    }
}
