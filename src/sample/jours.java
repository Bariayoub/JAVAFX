package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class jours extends Application {

    @Override
    public void start(Stage s) throws Exception{
        s.setTitle("jours ");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        ObservableList<String> jours= FXCollections.observableArrayList("Lundi","Mardi","Mercredi","Jeudi","Vendredi","samedi","dimanche");

        ListView lvJours =new ListView<String>(jours);
        lvJours.setPrefSize(200,150);

         Text rep = new Text();


        Text scenetitle = new Text("Jours");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
        grid.add(scenetitle, 0, 0, 2, 1);


        MultipleSelectionModel lvSelModel = lvJours.getSelectionModel();
        lvSelModel.selectedItemProperty().addListener((observableValue, s1, t1) -> {
            rep.setText("vous avez choisis : "+t1);
        });
        grid.add(lvJours, 0, 1);
        grid.add(rep, 0, 2);
        // create a scene
        Scene sc = new Scene(grid, 400, 400);
        sc.setFill(Color.LIGHTBLUE);
        s.setScene(sc);
        s.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}