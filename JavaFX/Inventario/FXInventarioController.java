package JavaFX.Inventario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FXInventarioController {
    @FXML
    public Button sairButton;
    @FXML
    public Button equiparButton;
    @FXML
    public Button desequiparButton;

    @FXML
    public void sairButtonClick(ActionEvent event) throws IOException {
        Parent mapa = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Mapa/Mapa.fxml")));
        Scene mapaScene = new Scene(mapa);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mapaScene);
        window.setTitle("Mapa");
        window.show();
    }


}
