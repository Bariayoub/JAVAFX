package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventHandlerTest extends Application {

    @Override
    public void start(Stage s) throws Exception{
        s.setTitle("UI Control Event Hnadlers");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text scenetitle = new Text("Laissez Un Message");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Votre Nom:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Votre Message:");
        grid.add(pw, 0, 2);

        TextField userTextField1 = new TextField();
        grid.add(userTextField1, 1, 2);



        Button btn = new Button("Envoyez");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);


        Button btn1 = new Button("Effacer");
        HBox hbBtn1 = new HBox(20);
        hbBtn1.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn1.getChildren().add(btn);
        grid.add(hbBtn1, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(e -> {

                actiontarget.setFill(Color.GREEN);
                actiontarget.setText( userTextField.getText()+ " a ecrit "+userTextField1.getText());
        });
        btn1.setOnAction(e ->{
            userTextField1.setText("");
        });

        // create a scene
        Scene sc = new Scene(grid, 600, 600);
        sc.setFill(Color.LIGHTBLUE);
        s.setScene(sc);
        s.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}