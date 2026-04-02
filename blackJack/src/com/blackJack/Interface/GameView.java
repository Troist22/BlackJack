package com.blackJack.Interface;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
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

        
        //putting a test card on the screen. Had to research some things and probably have overdone it. Could probably return to simpler syntax as solution was how it was organized in my  directories
        Image cardImage = new Image(
        	    getClass().getResource("/com/images/2Hearts.png").toString()
        	);

        	ImageView cardView = new ImageView(cardImage);
        	pane.getChildren().add(cardView);


        // center 
        root.setCenter(pane);
    }

    public Scene getScene() {
        return scene;
    }
}