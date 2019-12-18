package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class tabledemo  extends Application {

    @Override
    public void start(Stage stage) {

        TableView<UserAccount> table = new TableView<UserAccount>();


        TableColumn<UserAccount, String> emailCol= new TableColumn<UserAccount, String>("Telephone");
        TableColumn<UserAccount, String> fullNameCol= new TableColumn<UserAccount, String>("Nom Complet");
        TableColumn<UserAccount, String> firstNameCol = new TableColumn<UserAccount, String>("Nom");
        TableColumn<UserAccount, String> lastNameCol = new TableColumn<UserAccount, String>("Prenom");

        fullNameCol.getColumns().addAll(firstNameCol, lastNameCol);

        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        lastNameCol.setSortable(false);
        ObservableList<UserAccount> list = getUserList();
        table.setItems(list);

        table.getColumns().addAll( emailCol, fullNameCol);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("TableView ");

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<UserAccount> getUserList() {

        UserAccount user1 = new UserAccount(1L,  "06 66 15 13 65", "Susan", "Smith");
        UserAccount user2 = new UserAccount(2L,  "06 66 15 13 65","sawsaw", "lol");
        UserAccount user3 = new UserAccount(3L,  "06 66 15 13 65", "azerazer", "asqfqsd");

        ObservableList<UserAccount> list = FXCollections.observableArrayList(user1, user2, user3);
        return list;
    }

    public static void main(String[] args) {
        launch(args);
    }
}