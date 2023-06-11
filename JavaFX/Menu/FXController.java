package JavaFX.Menu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label welcomeText;

    @FXML
    protected void jogarButtonClick() {
        welcomeText.setText("Bem vindo ao IBILCE RPG!Boa Diversao");
    }

    @FXML
    public void creditosButtonClick(ActionEvent event) throws IOException {
        //Font.loadFont(getClass().getResourceAsStream("/Files/8_bit_hud.ttf"), 78);
        Parent creditos = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Creditos/Creditos.fxml")));
        Scene creditosScene = new Scene(creditos);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creditosScene);
        //window.setTitle("Creditos");
        window.show();
    }

    @FXML
    protected void sairButtonClick(){
        System.exit(0);
    }


}
