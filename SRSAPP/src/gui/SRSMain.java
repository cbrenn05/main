package gui;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ListView;
import javafx.scene.layout.*;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

public class SRSMain extends Application {

    private Stage theStage;
    private GridPane myGrid;
    private Controller myController;
    private VBox leftMenu;
    private HBox topLabels;

    /**
    * Initializes the gui window.
    * @param stage the stage the gui is set on.
    */
    @Override
    public void start(Stage stage) throws Exception {
        theStage = stage;
        myController = new Controller(this);
        myGrid = setHome();
        Scene scene = new Scene(myGrid, 900, 600);
        theStage.setScene(scene);
        theStage.setTitle("Spaced Repetition Flashcards");
        theStage.show();
    }

    /**
    * main function that launches gui.
    * @param args arguments for main.
    */
    public static void main(String[] args) {
        launch(args);
    }

    private GridPane setHome() {
        GridPane aGrid = new GridPane();
        aGrid.setHgap(10);
        aGrid.setVgap(10);
        aGrid.setMinSize(400,400);
        aGrid.setPadding(new Insets(0, 10, 0, 10));

        topLabels = createTopLabels();
        leftMenu = createLeftMenu();
        
        aGrid.add(topLabels, 0, 0);
        aGrid.add(leftMenu, 0, 1);
        return aGrid;
    }

    private VBox createLeftMenu(){
        VBox box = new VBox();
        box.setPadding(new Insets(10, 10, 10, 10));
        box.setPrefWidth(200);
        box.setPrefHeight(400);
        box.setStyle("-fx-border-color: #A96DA3;\n"
                   + "-fx-border-width: 2;\n"
                   + "-fx-border-style: solid;\n"
                   + "-fx-border-radius: 3px;\n");
        return box;
    }

    private HBox createTopLabels(){
        HBox box = new HBox();

        Text welcome = new Text("Welcome to SRS Flashcards!");
        welcome.setFont(Font.font("Verdana", 40));
        welcome.setFill(Color.web("160F29"));
        //welcome.setAligment(Pos.CENTER);

        box.setPadding(new Insets(10, 10, 10, 10));
        box.setPrefWidth(895);
        box.setPrefHeight(50);
        box.setStyle("-fx-border-color: #368F8B;\n"
                   + "-fx-border-width: 2;\n"
                   + "-fx-border-style: solid;\n"
                   + "-fx-border-radius: 3px;\n");
        box.getChildren().add(welcome);
        return box;
    }
}
