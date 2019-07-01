package sample.Model;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Ship {
    private Image image1 = new Image("sample/View/Images/Icons/icons8-back-96.png");
    private ImageView imageView1 = new ImageView(image1);
    private ImageView imageView2 = new ImageView(image1);
    private ImageView imageView3 = new ImageView(image1);
    private ImageView imageView4 = new ImageView(image1);
    private Image image;
    private ImageView imageView;
    private Pane pane = new Pane();
    private int width;
    private int height;

    private double x;
    private double y;

    private int limitX;
    private int limitY;


    private int xHouse;
    private int yHouse;

    private String name;

    public Ship(String path , String name,int a , int b , double x, double y , int limitX, int limitY){

        setName(name);

        imageView1.setOpacity(0);
        imageView2.setOpacity(0);
        imageView3.setOpacity(0);
        imageView4.setOpacity(0);
        Tras();
        setxHouse((int) x);
        setyHouse((int) y);


        imageView2.setRotate(90);
        imageView3.setRotate(180);
        imageView4.setRotate(270);
        imageView1.setFitHeight(50);
        imageView1.setFitWidth(50);
        imageView1.setTranslateY(b/2-25);
        imageView1.setTranslateX(-25);
        imageView2.setFitHeight(50);
        imageView2.setFitWidth(50);
        imageView2.setTranslateY(-25);
        imageView2.setTranslateX(a/2-25);
        imageView3.setFitHeight(50);
        imageView3.setFitWidth(50);
        imageView3.setTranslateX(a-25);
        imageView3.setTranslateY(b/2-25);
        imageView4.setFitHeight(50);
        imageView4.setFitWidth(50);
        imageView4.setTranslateY(b-25);
        imageView4.setTranslateX(a/2-25);





        image = new Image(path);
        imageView = new ImageView(getImage());
        setWidth(a);
        setHeight(b);
        imageView.setFitWidth(getWidth());
        imageView.setFitHeight(getHeight());
        x*=60;
        y*=60;
        x+=10;
        y+=10;
        setX(x);
        setY(y);
        setLimitX(limitX);
        setLimitY(limitY);


        pane.getChildren().addAll(imageView,imageView1,imageView2,imageView3,imageView4);

        pane.setTranslateX(getX());
        pane.setTranslateY(getY());
        function();
    }

    private void Tras() {
        imageView1.setOnMouseClicked(event -> {
            TranslateTransition t = new TranslateTransition(Duration.seconds(0.5),pane);
            t.setByX(-60);
            setX(getX()-60);
            t.play();
        });
        imageView3.setOnMouseClicked(event -> {
            TranslateTransition t = new TranslateTransition(Duration.seconds(0.5),pane);
            t.setByX(60);
            setX(getX()+60);
            t.play();
        });
        imageView2.setOnMouseClicked(event -> {
            TranslateTransition t = new TranslateTransition(Duration.seconds(0.5),pane);
            t.setByY(-60);
            setX(getY()-60);
            t.play();
        });
        imageView4.setOnMouseClicked(event -> {
            TranslateTransition t = new TranslateTransition(Duration.seconds(0.5),pane);
            t.setByY(60);
            setX(getY()+60);
            t.play();
        });




    }

    public Image getImage() {
        return image;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getLimitX() {
        return limitX;
    }

    public void setLimitX(int limitX) {
        this.limitX = limitX;
    }

    public int getLimitY() {
        return limitY;
    }

    public void setLimitY(int limitY) {
        this.limitY = limitY;
    }

    private void function(){
        this.imageView.setOnMouseEntered(event -> {
            fades(imageView1);
            fades(imageView2);
            fades(imageView3);
            fades(imageView4);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5),imageView1);
            FadeTransition f1 = new FadeTransition(Duration.seconds(0.5),imageView2);
            FadeTransition f2 = new FadeTransition(Duration.seconds(0.5),imageView3);
            FadeTransition f3 = new FadeTransition(Duration.seconds(0.5),imageView4);
            f.setFromValue(0);
            f.setToValue(1);
            f1.setFromValue(0);
            f1.setToValue(1);
            f2.setFromValue(0);
            f2.setToValue(1);
            f3.setFromValue(0);
            f3.setToValue(1);
            f.play();
        });
        this.imageView.setOnMouseExited(event -> {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5),imageView1);
            FadeTransition f1 = new FadeTransition(Duration.seconds(0.5),imageView2);
            FadeTransition f2 = new FadeTransition(Duration.seconds(0.5),imageView3);
            FadeTransition f3 = new FadeTransition(Duration.seconds(0.5),imageView4);
            f.setFromValue(1);
            f.setToValue(0);
            f1.setFromValue(1);
            f1.setToValue(0);
            f2.setFromValue(1);
            f2.setToValue(0);
            f3.setFromValue(1);
            f3.setToValue(0);
            f.play();
            f1.play();
            f2.play();
            f3.play();
        });
    }
    private void fades(ImageView img) {
        img.setOnMouseEntered(event -> {
            FadeTransition f =new FadeTransition(Duration.seconds(0.1),img);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
        });
        img.setOnMouseExited(event -> {
            FadeTransition f =new FadeTransition(Duration.seconds(1),img);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        });
    }
    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public int getxHouse() {
        return xHouse;
    }

    public void setxHouse(int xHouse) {
        this.xHouse = xHouse;
    }

    public int getyHouse() {
        return yHouse;
    }

    public void setyHouse(int yHouse) {
        this.yHouse = yHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
