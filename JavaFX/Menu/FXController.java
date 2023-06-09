package JavaFX.Menu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Objects;

public class FXController {
    @FXML
    public Button jogarButton;
    @FXML
    public Button creditosButton;
    @FXML
    public Button sairButton;


    @FXML
    protected void jogarButtonClick(ActionEvent event) throws IOException{
        Parent mapa = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Mapa/Mapa.fxml")));
        Scene mapaScene = new Scene(mapa);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mapaScene);
        window.setTitle("Mapa");
        window.show();

    }

    @FXML
    public void creditosButtonClick(ActionEvent event) throws IOException {
        Parent creditos = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Creditos/Creditos.fxml")));
        Scene creditosScene = new Scene(creditos);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creditosScene);
        window.setTitle("Creditos");
        window.show();
    }

    @FXML
    protected void sairButtonClick(){
        System.exit(0);
    }


}
