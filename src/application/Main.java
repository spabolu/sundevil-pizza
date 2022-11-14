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

        Pizza cheese1 = new Pizza(Type.CHEESE, true, false, false, false);
        Order test1 = new Order(1221201098, cheese1, Status.ACCEPTED, 10.00);
//        Pizza cheese2 = new Pizza(Type.CHEESE, true, false, false, false);
//        Order test2 = new Order(1221201098, cheese2, Status.ACCEPTED, 10.00);
//        Pizza cheese3 = new Pizza(Type.CHEESE, true, false, false, false);
//        Order test3 = new Order(1221201098, cheese3, Status.ACCEPTED, 10.00);
//        Pizza cheese4 = new Pizza(Type.CHEESE, true, false, false, false);
//        Order test4 = new Order(1221201098, cheese4, Status.ACCEPTED, 10.00);
        orderList.add(test1);
//        orderList.add(test2);
//        orderList.add(test3);
//        orderList.add(test4);

//        Order test = new Order(1221201098,new Pizza(Type.CHEESE, true, false, false, false), Status.ACCEPTED, 10.00);
//        orderList.add(test);


        launch(args);
    }
}
