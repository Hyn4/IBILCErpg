import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class Inventario extends Application {

    @Override
    public void start(@NotNull Stage stage) throws IOException {
        Font.loadFont(getClass().getResourceAsStream("/Files/8_bit_hud.ttf"), 78);
        FXMLLoader fxmlLoader = new FXMLLoader(Inventario.class.getResource("JavaFX/Inventario/Inventario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 930, 540);
        scene.getStylesheets().addAll(Objects.requireNonNull(this.getClass().getResource("JavaFX/style.css")).toExternalForm());
        stage.setTitle("Inventario");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();

    }


}
