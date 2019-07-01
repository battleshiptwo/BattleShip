package sample.Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Menu implements Initializable {
    public Label menu1;
    public Label menu3;
    public Label menu4;

    public void OpenSetting(MouseEvent mouseEvent) {
        Controller.OpenSettingForAll(mouseEvent);
    }

    public void Exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Controller.setEvent(menu1);
        Controller.setEvent(menu3);
        Controller.setEvent(menu4);
    }


    public void GotoDesign(MouseEvent mouseEvent) {
        Controller.GotoDesignForAll(mouseEvent);
    }
}
