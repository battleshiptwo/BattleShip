package sample.Controller;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.*;
import jaco.mp3.a.D;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Setting implements Initializable{
    public Pane backPane = new Pane();
    public Label backLabel = new Label();
    public ImageView backImg = new ImageView();
    public AnchorPane rootPane;
    public ImageView MusicLeft = new ImageView();
    public Label MusicPro = new Label();
    public Label SoundPro = new Label();
    public ImageView SoundLeft = new ImageView();
    public ImageView SoundRight = new ImageView();
    public ImageView musicLeft = new ImageView();
    public ImageView musicRight = new ImageView();
    public static boolean musicIsOn = true;
    public static boolean soundIsOn = true;
    public Pane MusicPane = new Pane();
    public Label MusicSetting = new Label();
    public Label GamesSetting;
    public Label PlayerSetting;
//    public JFXTextField playerTextField = new JFXTextField();
//    public static Label playerName = new Label();
//    public JFXRadioButton soundRadio = new JFXRadioButton();
//    public JFXRadioButton musicRadio = new JFXRadioButton();

    //    public String bip = "C:\\Users\\Asus\\Desktop\\Programming\\Java\\Battle Ship\\src\\sample\\Sounds\\Musics\\Background\\2.mp3";
//    public MP3Player mp3;
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        MusicPane.setVisible(false);
        MusicPane.setDisable(true);
        if(musicIsOn) {
            MusicPro.setText("ON");
        }
        else{MusicPro.setText("OFF");}
        if(soundIsOn) {
            SoundPro.setText("ON");
        }
        else{SoundPro.setText("OFF");}
       ValueOfOthers();
        //music();
        GetFunctions();
        GetSettingPro();
        FadeTransition f1 = new FadeTransition(Duration.seconds(0.5),rootPane);
        f1.setFromValue(0.5);
        f1.setToValue(1);
        f1.play();
    }

    private void GetSettingPro() {

        SoundLeft.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),SoundLeft);
            t1.setByX(-5);
            t1.play();
        });
        SoundLeft.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),SoundLeft);
            t1.setByX(5);
            t1.play();
        });
        SoundRight.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),SoundRight);
            t1.setByX(5);
            t1.play();
        });
        SoundRight.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),SoundRight);
            t1.setByX(-5);
            t1.play();
        });
        musicLeft.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),musicLeft);
            t1.setByX(-5);
            t1.play();
        });
        musicLeft.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),musicLeft);
            t1.setByX(5);
            t1.play();
        });
        musicRight.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),musicRight);
            t1.setByX(5);
            t1.play();
        });
        musicRight.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),musicRight);
            t1.setByX(-5);
            t1.play();
        });

    }

    public void GetFunctions() {
        backPane.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),backImg);
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.3),backLabel);
            t1.setByX(-10);
            t2.setByX(10);
            t1.play();
            t2.play();
        });
        backPane.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),backImg);
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.3),backLabel);
            t1.setByX(10);
            t2.setByX(-10);
            t1.play();
            t2.play();
        });

        MusicSetting.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),MusicSetting);
            t1.setToX(20);
            t1.play();
        });
        MusicSetting.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),MusicSetting);
            t1.setToX(0);
            t1.play();
        });
        PlayerSetting.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),PlayerSetting);
            t1.setToX(20);
            t1.play();
        });
        PlayerSetting.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),PlayerSetting);
            t1.setToX(0);
            t1.play();
        });
        GamesSetting.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),GamesSetting);
            t1.setToX(20);
            t1.play();
        });
        GamesSetting.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),GamesSetting);
            t1.setToX(0);
            t1.play();
        });






















    }

//    public void music (){
//        setVolume();
//    }
//    public void setVolume(){
//        Controller.bip = "C:\\Users\\Asus\\Desktop\\Programming\\Java\\Battle Ship\\src\\sample\\Sounds\\Musics\\Background\\1.mp3";
//        Controller.music();
//    }


    public void MusicOnOROff(MouseEvent mouseEvent) {
//        if (!musicRadio.isSelected()){

//        }
    }

    public void SoundOnOROff(MouseEvent mouseEvent) {
    }

    public static void BackToMenu(MouseEvent mouseEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Setting.class.getResource("/sample/View/FXML/Munu2.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage1 = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        stage1.setScene(new Scene(root));
        stage1.show();
    }

    public void CahngeSoundSystem(MouseEvent mouseEvent) {
        TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),SoundPro);
        t1.setFromX(0);
        t1.setToX(100);
        FadeTransition f1 = new FadeTransition(Duration.seconds(0.3),SoundPro);
        f1.setFromValue(1);
        f1.setToValue(0);
        t1.play();
        f1.play();
        f1.setOnFinished(event -> {
            if(soundIsOn){
                SoundPro.setText("OFF");
                soundIsOn = false;
            }
            else{
                SoundPro.setText("ON");
                soundIsOn = true;
            }
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.3),SoundPro);
            t2.setFromX(-100);
            t2.setToX(0);
            FadeTransition f2 = new FadeTransition(Duration.seconds(0.3),SoundPro);
            f2.setFromValue(0);
            f2.setToValue(1);
            t2.play();
            f2.play();
        });



    }

    public void CahngeMusicSystem(MouseEvent mouseEvent) {
        TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),MusicPro);
        t1.setFromX(0);
        t1.setToX(100);
        FadeTransition f1 = new FadeTransition(Duration.seconds(0.3),MusicPro);
        f1.setFromValue(1);
        f1.setToValue(0);
        t1.play();
        f1.play();
        f1.setOnFinished(event -> {
            if(musicIsOn){
                MusicPro.setText("OFF");
                musicIsOn = false;
//                Controller.mp3.pause();
//                Controller.music();

            }
            else{
                MusicPro.setText("ON");
                musicIsOn = true;
//                Controller.mp3.pause();
//                Controller.music();

            }
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.3),MusicPro);
            t2.setFromX(-100);
            t2.setToX(0);
            FadeTransition f2 = new FadeTransition(Duration.seconds(0.3),MusicPro);
            f2.setFromValue(0);
            f2.setToValue(1);
            t2.play();
            f2.play();
        });
    }

    public void MusicSetting(MouseEvent mouseEvent) {
        ValueOfOthers();
        MusicSetting.setOpacity(1);
        MusicSetting.setTranslateX(20);
        MusicPane.setVisible(true);
        MusicPane.setDisable(false);
    }

    private void ValueOfOthers() {
        MusicSetting.setOpacity(0.4);
        MusicSetting.setTranslateX(0);
        PlayerSetting.setOpacity(0.4);
        PlayerSetting.setTranslateX(0);
        GamesSetting.setOpacity(0.4);
        GamesSetting.setTranslateX(0);
    }

    public void GamesSetting(MouseEvent mouseEvent) {
    }

    public void PlayerSetting(MouseEvent mouseEvent) {
    }

    public void CahngeMusicSystemLeft(MouseEvent mouseEvent) {
        TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),MusicPro);
        t1.setFromX(0);
        t1.setToX(-100);
        FadeTransition f1 = new FadeTransition(Duration.seconds(0.3),MusicPro);
        f1.setFromValue(1);
        f1.setToValue(0);
        t1.play();
        f1.play();
        f1.setOnFinished(event -> {
            if(musicIsOn){
                MusicPro.setText("OFF");
                musicIsOn = false;
//                Controller.mp3.pause();
//                Controller.music();
            }
            else{
                MusicPro.setText("ON");
                musicIsOn = true;
//                Controller.mp3.pause();
//                Controller.music();

            }
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.3),MusicPro);
            t2.setFromX(100);
            t2.setToX(0);
            FadeTransition f2 = new FadeTransition(Duration.seconds(0.3),MusicPro);
            f2.setFromValue(0);
            f2.setToValue(1);
            t2.play();
            f2.play();
        });
    }

    public void CahngeSoundSystemLeft(MouseEvent mouseEvent) {
        TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.3),SoundPro);
        t1.setFromX(0);
        t1.setToX(-100);
        FadeTransition f1 = new FadeTransition(Duration.seconds(0.3),SoundPro);
        f1.setFromValue(1);
        f1.setToValue(0);
        t1.play();
        f1.play();
        f1.setOnFinished(event -> {
            if(soundIsOn){
                SoundPro.setText("OFF");
                soundIsOn = false;
            }
            else{
                SoundPro.setText("ON");
                soundIsOn = true;
            }
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.3),SoundPro);
            t2.setFromX(100);
            t2.setToX(0);
            FadeTransition f2 = new FadeTransition(Duration.seconds(0.3),SoundPro);
            f2.setFromValue(0);
            f2.setToValue(1);
            t2.play();
            f2.play();
        });
    }
}
