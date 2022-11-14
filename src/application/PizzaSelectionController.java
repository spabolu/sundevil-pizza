package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class PizzaSelectionController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private CheckBox mushBox;
    @FXML
    private CheckBox oliveBox;
    @FXML
    private CheckBox cheeseBox;
    @FXML
    private CheckBox onionBox;
    @FXML
    private RadioButton radioPepp;
    @FXML
    private RadioButton radioCheese;
    @FXML
    private RadioButton radioVeg;
    @FXML
    private Button buttonOrder;
    @FXML
    private ToggleGroup typeGroup;

    @FXML
    private ChoiceBox<String> PickUpTimeChoiceBox;

    Type tempType;
    Boolean onion, mush, olive, cheese;
    public void checkCheckBox(){
        mush = mushBox.isSelected();
        olive = oliveBox.isSelected();
        cheese = cheeseBox.isSelected();
        onion = onionBox.isSelected();
    }

    double pickUp;
    int tempID = 0;


    public void completeOrder(ActionEvent event) throws IOException {
        Button sourceButton = (Button) event.getSource();
        System.out.println(sourceButton.getText());
        String tempPickUp = "";
        if(sourceButton == buttonOrder){

            switch(typeGroup.getSelectedToggle().getProperties().toString()){
                case "radioPepp":
                    tempType = Type.PEPPERONI;
                    break;
                case "radioCheese":
                    tempType = Type.CHEESE;
                    break;
                case "radioVeg":
                    tempType = Type.VEGGIE;
                    break;
                default:
                    tempType = Type.NULL;
                    break;
            }

            tempPickUp = PickUpTimeChoiceBox.getValue();

            switch(tempPickUp){
                case("11:00 AM"):
                    pickUp = 11.00;
                    break;
                case("11:30 AM"):
                    pickUp = 11.30;
                    break;
                case("12:00 PM"):
                    pickUp = 12.00;
                    break;
                case("12:30 PM"):
                    pickUp = 12.30;
                    break;
                case("1:00 PM"):
                    pickUp = 13.00;
                    break;
                case("1:30 PM"):
                    pickUp = 13.30;
                    break;
                case("2:00 PM"):
                    pickUp = 14.00;
                    break;
                case("2:30 PM"):
                    pickUp = 14.30;
                    break;
                case("3:00 PM"):
                    pickUp = 15.00;
                    break;
                case("3:30 PM"):
                    pickUp = 15.30;
                    break;
                case("4:00 PM"):
                    pickUp = 16.00;
                    break;
                case("4:30 PM"):
                    pickUp = 16.30;
                    break;
                case("5:00 PM"):
                    pickUp = 17.00;
                    break;
                case("5:30 PM"):
                    pickUp = 17.30;
                    break;
                case("6:00 PM"):
                    pickUp = 18.00;
                    break;
                case("6:30 PM"):
                    pickUp = 18.30;
                    break;
                case("7:00 PM"):
                    pickUp = 19.00;
                    break;
                default:
                    pickUp = 0.0;
                    break;
            }

            if(radioPepp.isSelected()){
                tempType = Type.PEPPERONI;
            }else if(radioCheese.isSelected()){
                tempType = Type.CHEESE;
            }else if(radioVeg.isSelected()){
                tempType = Type.VEGGIE;
            }else{
                tempType = Type.NULL;
            }

            Pizza tempPizza = new Pizza(tempType, mush, olive, cheese, onion);
            Order tempOrder = new Order(tempID, tempPizza, Status.ACCEPTED, pickUp);
            Main.orderList.add(tempOrder);

//Switch Scenes

            root = FXMLLoader.load(getClass().getResource("StudentTrack.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


    private final String[] times = {"11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM",
            "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM",
            "7:00 PM"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        PickUpTimeChoiceBox.getItems().addAll(times);

    }
}




