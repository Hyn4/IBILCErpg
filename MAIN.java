import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class MAIN extends Application {

    @Override
    public void start(@NotNull Stage stage) throws IOException {
        Font.loadFont(getClass().getResourceAsStream("/8-bit-hud.ttf"), 78);


        FXMLLoader fxmlLoader = new FXMLLoader(MAIN.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 930, 540);
        scene.getStylesheets().addAll(Objects.requireNonNull(this.getClass().getResource("style.css")).toExternalForm());
        stage.setTitle("IbilceRPG");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }



}
