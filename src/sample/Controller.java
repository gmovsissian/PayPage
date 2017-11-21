package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
@FXML
    Button button3;
@FXML
TextField firstname;

    @FXML
    TextField field1;
    @FXML
    TextField field2;
    @FXML
    ChoiceBox chbox;
    @FXML
    TextField emailfield;
    @FXML
    ImageView imageview1;
    @FXML
    Image image1=new Image("sample/image/1.jpg");
    @FXML
    Image image2=new Image("sample/image/images.jpg");
    @FXML
    Image image3=new Image("sample/image/Yes.png");
    ObservableList<String> availableChoices = FXCollections.observableArrayList("Armenia", "America", "Russia", "China", "Germany", "Italy", "Spain");

    public void initialize() {
        chbox.setValue("Armenia");
        chbox.setItems(availableChoices);

        emailfield.setOnKeyTyped(event -> {
            if (emailfield.getText().toString().contains("@")) {
                imageview1.setImage(image3);
            } else {
                imageview1.setImage(image1);
            }
        });







        button3.setOnAction(event -> {
          Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource(
                        "layout/samplesec.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Other");
                stage.setScene(new Scene(root, 600, 450));
                stage.show();
                // Hide this current window (if this is what you want)
//                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        });}



}



