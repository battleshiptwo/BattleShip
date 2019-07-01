package sample.Controller;

import jaco.mp3.player.MP3Player;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import sample.Model.Main;

import javax.sound.midi.ControllerEventListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //public static String bip = "C:\\Users\\Asus\\Desktop\\Programming\\Java\\Battle Ship\\src\\sample\\Sounds\\Musics\\Background\\2.mp3";
    //public static MP3Player mp3;
    @FXML
    public ImageView image;
    public AnchorPane root;
    public AnchorPane secondPane;
    public Pane thirdPane;
    public Label menu1 = new Label();
    public Label menu2 = new Label();
    public Label menu3 = new Label();
    public Label menu4 = new Label();
    public ImageView backImage;
    Main main;
    Stage stage ;
    public void main(Stage stage, Main main){
        this.stage = stage;
        this.main = main;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //music();

        image.setScaleX(5);
        image.setScaleY(5);
        image.setTranslateX(380);
        image.setTranslateY(330);
        backImage.setOpacity(0);
        menu1.setOpacity(0);
        menu2.setOpacity(0);
        menu3.setOpacity(0);
        menu4.setOpacity(0);
        image.setOpacity(0);

        setEvent(menu1);
        setEvent(menu2);
        setEvent(menu3);
        setEvent(menu4);
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(3000));
        fade.setFromValue(0);
        fade.setToValue(10);

        fade.setAutoReverse(true);

        fade.setNode(image);
        fade.play();
            fade.setOnFinished(event1 -> {
                    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2),image);
                   logoanimation(image,translateTransition);
                    translateTransition.setOnFinished(event2 -> {
                        FadeTransition fade3 = new FadeTransition();
                        fade3.setDuration(Duration.millis(2000));
                        fade3.setFromValue(0);
                        fade3.setToValue(10);
                        fade3.setAutoReverse(true);
                        fade3.setNode(backImage);
                        fade3.play();
                        fade3.setOnFinished(event3 -> {
                                FadeTransition fadea = new FadeTransition();
                                FADE(fadea, menu1);
                                fadea.setOnFinished(event4 -> {
                                    FadeTransition fadeb = new FadeTransition();
                                    FADE(fadeb, menu2);
                                    fadeb.setOnFinished(event5 -> {
                                        FadeTransition fadec = new FadeTransition();
                                        FADE(fadec, menu3);
                                        fadec.setOnFinished(event6 -> {
                                            FadeTransition faded = new FadeTransition();
                                            FADE(faded, menu4);
                                        });
                                    });
                                });

                        });
                    });
                });
    }
public void FADE (FadeTransition fade4, Label label){
    TranslateTransition tr = new TranslateTransition(Duration.seconds(0.5),label);
    tr.setFromX(-30);
    tr.setToX(0);
    fade4.setDuration(Duration.millis(500));
    fade4.setFromValue(0);
    fade4.setToValue(9);
    fade4.setAutoReverse(true);
    fade4.setNode(label);
    fade4.play();
    tr.play();


}
public static void setEvent(Label label){
    label.setOnMouseEntered(event -> {
        TranslateTransition t10 = new TranslateTransition(Duration.seconds(0.2),label);
        t10.setToX(20);
        t10.play();
    });
    label.setOnMouseExited(event -> {
        TranslateTransition t10 = new TranslateTransition(Duration.seconds(0.2),label);
        t10.setToX(0);
        t10.play();
    });


}
public void logoanimation(ImageView image , TranslateTransition translateTransition){
    ScaleTransition t2 = new ScaleTransition(Duration.seconds(2),image);
    t2.setToX(1);
    t2.setToY(1);
    translateTransition.setToX(0);
    translateTransition.setToY(0);
    translateTransition.play();
    t2.play();

    }
//    public static void music (){
//        mp3 = new MP3Player(new File(bip));
//        mp3.setRepeat(true);
//        if(Setting.musicIsOn) {
//            mp3.play();
//        }
//    }
    public void Exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void hi(MouseEvent mouseEvent) {

    }


    public static void OpenSettingForAll(MouseEvent mouseEvent){
//            mp3.pause();
            Parent root = null;
            try {
                root = FXMLLoader.load(Controller.class.getResource("/sample/View/FXML/Setting.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage1 = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage1.setScene(new Scene(root));
            stage1.show();
    }

    public static void PlayMusic(){
    }
//    public static void StopMusic(){
//        Controller.mp3.pause();
//    }

    public void OpenSetting(MouseEvent mouseEvent) {
        Controller.OpenSettingForAll(mouseEvent);
    }

    public static void GotoDesignForAll(MouseEvent mouseEvent) {
//        mp3.pause();
        Parent root = null;
        try {
            root = FXMLLoader.load(Controller.class.getResource("/sample/View/FXML/DesignTable.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage1 = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        stage1.setScene(new Scene(root));
        stage1.show();
    }
    public void GotoDesign(MouseEvent mouseEvent) {
        Controller.GotoDesignForAll(mouseEvent);
    }
}
