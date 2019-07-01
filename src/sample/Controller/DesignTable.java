package sample.Controller;

import javafx.animation.TranslateTransition;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableRow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import sample.Model.Ship;

import java.net.URL;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DesignTable implements Initializable {
    public ImageView SmallShip = new ImageView();
    public ImageView MassiveShip;
    public ImageView bigShip;
    public ImageView mediomShip;
    public Pane designPane;
    public ImageView startGameIMage;
    public Label startGameLabel;
    public Label canselLabel;
    public ImageView canselImage;
    public Pane cancelPane;
    public Pane startPane;
    public int shipPosition[][] = new int[10][10];



    //            small ships
    Image s1 = new Image("sample/View/Images/ships/ship1.png");
    Image s2 = new Image("sample/View/Images/ships/ship1.png");
    Image s3 = new Image("sample/View/Images/ships/ship1.png");
    Image s4 = new Image("sample/View/Images/ships/ship1.png");
//            mediem ships
    Image m1 = new Image("sample/View/Images/ships/ship2.png");
    Image m2 = new Image("sample/View/Images/ships/ship2.png");
    Image m3 = new Image("sample/View/Images/ships/ship2.png");
//            big ships
    Image b1 = new Image("sample/View/Images/ships/ship3.png");
    Image b2 = new Image("sample/View/Images/ships/ship3.png");
//            enormess ships
    Image e1 = new Image("sample/View/Images/ships/ship4.png");
//               arrayList for ship
    ArrayList<Ship> ships = new ArrayList();

    public Boolean validate() {

        boolean flag1=false;


        for (int i = 0; i < ships.size(); i++) {
            int a = ships.get(i).getxHouse();
            int b = ships.get(i).getyHouse();
            int x = (int) ships.get(i).getX();
            int y = (int) ships.get(i).getY();
            int xl = (int) ships.get(i).getLimitX();
            int yl = (int) ships.get(i).getLimitY();

            if (ships.get(i).getName().equals("Ship1")) {
                if (shipPosition[a+1][b]==0||shipPosition[a+1][b]==-1){
                    flag1=true;
                }
                else {
                    return false;
                }
                if (shipPosition[a-1][b]==0||shipPosition[a-1][b]==-1){
                    flag1=true;
                }
                else{
                    return false;
                }
                if (shipPosition[a][b-1]==0||shipPosition[a][b-1]==-1){
                    flag1=true;
                }
                else{
                    return false;
                }
                if (shipPosition[a][b+1]==0||shipPosition[a][b+1]==-1){
                    flag1=true;
                }
                else {
                    return false;
                }
            }
            if (ships.get(i).getName().equals("Ship2")) {

                if (shipPosition[a + 2][b] ==0||shipPosition[a + 2][b] ==-1){
                    flag1=true;
                }
                else {
                    return false;
                }
                if (shipPosition[a - 1][b] ==0||shipPosition[a - 1][b] ==-1){
                    flag1=true;
                }
                else {
                    return false;
                }
                for (int j = 0; j < 4; j++) {
                    if (shipPosition[a + j - 1][b - 1] == 0||shipPosition[a + j - 1][b - 1] ==-1){
                        flag1= true;
                    }
                    else {
                        return false;
                    }
                }
                for (int j = 0; j < 4; j++) {
                    if (shipPosition[a + j - 1][b + 1] == 0||shipPosition[a + j - 1][b + 1] ==-1){
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }
            }
            if (ships.get(i).getName().equals("Ship2r")) {
                if (shipPosition[a][b + 2] ==0||shipPosition[a][b + 2] ==-1){
                    flag1=true;
                }
                else {
                    return false;
                }
                if (shipPosition[a][b - 1] == 0||shipPosition[a][b - 1] ==-1) {
                    flag1 = true;
                }
                else {
                    return false;
                }

                for (int j = 0; j < 4; j++) {
                    if (shipPosition[a + 1][b + j] ==0||shipPosition[a + 1][b + j] ==-1){
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }
                for (int j = 0; j < 4; j++) {
                    if (shipPosition[a - 1][b + j] ==0||shipPosition[a - 1][b + j] ==-1){
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }

            }
            if (ships.get(i).getName().equals("Ship3")) {
                if (shipPosition[a + 3][b] ==0||shipPosition[a + 3][b] ==-1){
                    flag1=true;
                }
                else {
                    return false;
                }
                if (shipPosition[a - 1][b] ==0||shipPosition[a - 1][b] ==-1){
                    flag1=true;
                }
                else {
                    return false;
                }

                for (int j = 0; j < 5; j++) {
                    if (shipPosition[a + j - 1][b + 1] ==0||shipPosition[a + j - 1][b + 1]==-1){
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }
                for (int j = 0; j < 5; j++) {
                    if (shipPosition[a + j - 1][b - 1] ==0||shipPosition[a + j - 1][b - 1]==-1){
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }
            }
            if (ships.get(i).getName().equals("Ship3r")) {
                if (shipPosition[a][b + 3] == 0||shipPosition[a][b + 3] == -1) {
                    flag1 = true;
                }
                else {
                    return false;
                }
                if (shipPosition[a][b - 1] == 0||shipPosition[a][b - 1] ==-1){
                    flag1=true;
                }
                else
                {
                    return false;
                }

                for (int j = 0; j < 5; j++) {
                    if (shipPosition[a + 1][b + j - 1] == 0||shipPosition[a + 1][b + j - 1] == 0){
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }
                for (int j = 0; j < 5; j++) {
                    if (shipPosition[a - 1][b + j - 1] ==0||shipPosition[a - 1][b + j - 1] ==-1) {
                        flag1=true;
                    }
                    else {
                        return false;
                    }
                }
            }
            if (ships.get(i).getName().equals("Ship4")) {
                if (shipPosition[a + 4][b] == 0 || shipPosition[a + 4][b] == -1) {
                    flag1 = true;
                } else {
                    return false;
                }

                if (shipPosition[a - 1][b] == 0 || shipPosition[a - 1][b] == -1)
                    flag1 = true;
            } else {
                return false;
            }
            for (int j = 0; j < 6; j++) {
                if (shipPosition[a + j - 1][b + 1] == 0 || shipPosition[a + j - 1][b + 1] == -1) {
                    flag1 = true;
                } else {
                    return false;
                }
            }
            for (int j = 0; j < 6; j++) {
                if (shipPosition[a + j - 1][b - 1] == 0 || shipPosition[a + j - 1][b - 1] == -1) {
                    flag1 = true;
                } else {
                    return false;
                }
            }
        }
        return flag1;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        Funcs();
        
        
        
        
        
        Image a = new Image("sample/View/Images/ships/ship4.png");
        MassiveShip = new ImageView(a);
//       these are ships of 1 element
            Ship ali11 = new Ship("sample/View/Images/ships/ship1.png" , "Ship1",50 ,35,0,5 , 9 , 9);
            ships.add(ali11);
             Ship ali12 = new Ship("sample/View/Images/ships/ship1.png" , "Ship1",50 ,35,5,0 , 9 , 9);
            ships.add(ali12);
             Ship ali13 = new Ship("sample/View/Images/ships/ship1.png" , "Ship1",50 ,35,9,5  , 9 , 9);
            ships.add(ali13);
             Ship ali14 = new Ship("sample/View/Images/ships/ship1.png" , "Ship1",50 ,35,3,9 , 9 , 9);
            ships.add(ali14);



//            these are the ships of 2 element
            Ship ali20 = new Ship("sample/View/Images/ships/ship2.png" ,"Ship2", 100 ,35,5,5 , 8,9);
            ships.add(ali20);
            Ship ali21 = new Ship("sample/View/Images/ships/ship2-rotate.png" ,"Ship2r", 35 ,100,0,7 ,9,8);
            ships.add(ali21);
            Ship ali22 = new Ship("sample/View/Images/ships/ship2-rotate.png" ,"Ship2r", 35 ,100,3,4,9,8);
            ships.add(ali22);



//                      these are the 3 element ships
            Ship ali30 = new Ship("sample/View/Images/ships/ship3-rotate.png","Ship3r", 35 , 165 , 7 , 6 , 7 , 8);
            ships.add(ali30);
            Ship ali31 = new Ship("sample/View/Images/ships/ship3.png","Ship3", 165 ,35 , 0 , 0,8,7);
            ships.add(ali31);
//


//        this is the four element ship
            Ship ali40 = new Ship("sample/View/Images/ships/ship4.png" ,"Ship4", 230,35,6,2,6,2);
            ships.add(ali40);

        for (int i=0 ; i<ships.size() ; i++){
            this.designPane.getChildren().add(ships.get(i).getPane());
        }
    }

    private void Funcs() {
        
        cancelPane.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),canselImage);
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.2),canselLabel);
            t2.setByX(10);
            t1.setByX(-10);
            t1.play();
            t2.play();
        });
        cancelPane.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),canselImage);
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.2),canselLabel);
            t2.setByX(-10);
            t1.setByX(10);
            t1.play();
            t2.play();
        });
        startPane.setOnMouseEntered(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),startGameLabel);
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.2),startGameIMage);
            t2.setByX(10);
            t1.setByX(-10);
            t1.play();
            t2.play();
        });
        startPane.setOnMouseExited(event -> {
            TranslateTransition t1 = new TranslateTransition(Duration.seconds(0.2),startGameLabel);
            TranslateTransition t2 = new TranslateTransition(Duration.seconds(0.2),startGameIMage);
            t2.setByX(-10);
            t1.setByX(10);
            t1.play();
            t2.play();
        });
        
    }

    public void BackToMenu(MouseEvent mouseEvent) {
        Setting.BackToMenu(mouseEvent);
    }

    public void StartTheGame(MouseEvent mouseEvent) {
        for (int i=0 ; i<10 ;i++){
            for (int j=0 ; j<10 ; j++){
                shipPosition[i][j] = 0;
            }
        }
        for (int i=0 ;i < ships.size() ; i++){
            int a = ships.get(i).getxHouse();
            int b = ships.get(i).getyHouse();
            if(ships.get(i).getName().equals("Ship2")){
                for(int j=0 ; j<2 ; j++){
                    shipPosition[a+j][b]=1;
                }
            }
            if(ships.get(i).getName().equals("Ship2r")){
                for(int j=0 ; j<2 ; j++){
                    shipPosition[a][b+j]=1;
                }
            }
            if(ships.get(i).getName().equals("Ship3")){
                for(int j=0 ; j<3 ; j++){
                    shipPosition[a+j][b]=1;
                }
            }
            if(ships.get(i).getName().equals("Ship3r")){
                for(int j=0 ; j<3 ; j++){
                    shipPosition[a][b+j]=1;
                }
            }
            if (ships.get(i).getName().equals("Ship4")){
                for(int j=0 ; j<4 ; j++){
                    shipPosition[a+j][b]=1;
                }
            }
            else{
                shipPosition[a][b] = 1;
            }
        }
    }
}
