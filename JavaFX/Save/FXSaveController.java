package JavaFX.Save;

import com.sun.glass.ui.CommonDialogs;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FXSaveController {
   // Save save = new Save();


    @FXML
    public Label labSingleFile;
    @FXML
    public Button salvarButton;
    @FXML
    public Button carregarSaveButton;
    @FXML
    public Button voltarButton;


    @FXML
    protected void salvarButton(ActionEvent event) throws IOException {
      //  save.salvar(usuario);
    }

    @FXML
    public void carregarSaveButton(ActionEvent event) throws IOException {
       // save.carregarSave(usuario);

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT Files","*.txt"));
        File f = fileChooser.showOpenDialog(null);

        if(f!=null) labSingleFile.setText("Selected File:"+ f.getAbsolutePath());
    }

    @FXML
    public void voltarButtonClick(ActionEvent event) throws IOException {
        //ACHO QUE NAO VAI PASSAR COM O SAVE
            Parent menu = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("JavaFX/Menu" +
                    "/Menu.fxml")));
            Scene menuScene = new Scene(menu);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(menuScene);
            window.setTitle("IbilceRPG");
            window.show();
    }

}
