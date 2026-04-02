package com.blackJack.Interface;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView {

    private final Scene scene;

    public MainView(Stage stage) {

        // add menu to screen using borderpane
        BorderPane root = new BorderPane();
        scene = new Scene(root);

        // menu called
        root.setTop(AppMenuBar.create(stage));

        //window
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color: #009245;");

        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        
        //buttons
        Button startGameButton = new Button("Start Game");
        Button exitGameButton = new Button("Exit");

        startGameButton.setOnAction(e -> {
            GameView game = new GameView(stage);
            stage.setScene(game.getScene());
        });

        exitGameButton.setOnAction(e -> Platform.exit());

        vBox.getChildren().addAll(startGameButton, exitGameButton);
        pane.getChildren().add(vBox);

        // center in pane
        root.setCenter(pane);
    }

    public Scene getScene() {
        return scene;
    }
}
