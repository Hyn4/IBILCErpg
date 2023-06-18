import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class MainJogo extends Application {

    @Override
    public void start(@NotNull Stage stage) throws IOException {
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
        launch();

    }



}
