package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;

public class SceneController { // MainScene Controller for this project
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML private Button button;
    @FXML private Button button1;

    @FXML 
    public void switch1(ActionEvent event) throws IOException 
    {
        root = FXMLLoader.load(getClass().getResource("PizzaSelection.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML 
    public void switch2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChefTrack.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
