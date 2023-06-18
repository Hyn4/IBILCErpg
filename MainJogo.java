import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainJogo extends Application {

    


    @Override
    public void start(Stage stage) throws IOException {
        Font.loadFont(getClass().getResourceAsStream("Files/8_bit_hud.ttf"), 78);
        FXMLLoader fxmlLoader = new FXMLLoader(MainJogo.class.getResource("JavaFX/Menu/Menu.fxml"));
        Scene sceneMenu = new Scene(fxmlLoader.load(), 930, 540);
        sceneMenu.getStylesheets().addAll(Objects.requireNonNull(this.getClass().getResource("JavaFX/stylebutton.css")).toExternalForm());
        stage.setTitle("IbilceRPG");
        stage.setScene(sceneMenu);
        stage.setResizable(false);
        stage.show();

    }


    public static void main(String[] args){
        //launch();
        Player jogador = new Player();
        Biologo adversario = new Biologo();
        Traduteiro adversario2 = new Traduteiro();
        Matematico adversario3 = new Matematico();
        CombatManager combate = new CombatManager(jogador, adversario);
        CombatManager combate2 = new CombatManager(jogador, adversario2);
        CombatManager combate3 = new CombatManager(jogador, adversario3);
    }



}
