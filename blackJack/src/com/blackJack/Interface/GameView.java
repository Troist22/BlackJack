package com.blackJack.Interface;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameView {

    private final Scene scene;

    public GameView(Stage stage) {

        // Switch to borderpane for menu bar
        BorderPane root = new BorderPane();
        scene = new Scene(root, 800, 600);

        // Add the shared menu bar
        root.setTop(AppMenuBar.create(stage));

        //existing code reworked
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color: #009245;");

        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.BOTTOM_LEFT);

        pane.getChildren().add(vBox);

        // center in borderpane
        root.setCenter(pane);
    }

    public Scene getScene() {
        return scene;
    }
}