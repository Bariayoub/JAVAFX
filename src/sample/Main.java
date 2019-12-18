package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage s) throws Exception{
        s.setTitle("creating RadioButton");

        // create a tile pane
        Group r = new Group();




        Circle c = new Circle(20,20,100,Color.YELLOW);
        Circle c1 = new Circle(200,400,40,Color.ORANGE);
        c1.setStroke(Color.RED);

        Rectangle r1 = new Rectangle(400,200,80,80);
        r1.setFill(Color.LIGHTGREEN);
        r1.setStroke(Color.DARKGREEN);

        Line l = new Line(400,200,200,400);
        l.setFill(Color.BLACK);
        l.setStroke(Color.BLACK);
        // add label
        r.getChildren().add(l);
        r.getChildren().add(c);
        r.getChildren().add(c1);
        r.getChildren().add(r1);

        // create a scene
        Scene sc = new Scene(r, 600, 600);
        sc.setFill(Color.LIGHTBLUE);
        s.setScene(sc);
        s.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
