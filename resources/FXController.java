package resources;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    protected void creditosButtonClick() {
        welcomeText.setText("feito pelos melhores");
    }

    @FXML
    protected void sairButtonClick(){
        System.exit(0);
    }}
