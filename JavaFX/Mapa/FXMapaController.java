package JavaFX.Mapa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FXMapaController {

    @FXML
    public Button inventarioButton;
    @FXML
    public Button irButton;
    @FXML
    public Button salvarButton;
    @FXML
    public Button sairButton;


    @FXML
    protected void inventarioClickButton(ActionEvent event) throws IOException {
        Parent inventario = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Inventario/Inventario.fxml")));
        Scene inventarioScene = new Scene(inventario);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(inventarioScene);
        window.setTitle("Inventario");
        window.show();
    }

    @FXML
    protected void salvarButtonClick(ActionEvent event) throws IOException{
            Parent combate = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Combate/Combate.fxml")));
            Scene combateScene = new Scene(combate);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(combateScene);
            window.setTitle("Combate");
            window.show();

    }

    protected void irButtonClick(){


    }

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
