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
        Parent menu =
                FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Menu/Menu.fxml")));
        Scene menuScene = new Scene(menu);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(menuScene);
        window.setTitle("IbilceRPG");
        window.show();
    }


}
