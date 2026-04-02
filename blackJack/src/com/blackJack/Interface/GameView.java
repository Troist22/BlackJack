package com.blackJack.Interface;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameView {

    private final Scene scene;

    public GameView(Stage stage) {
    	int dTotal = 0;
    	int pTotal = 0;
    	
        // Switch to borderpane for menu bar
        BorderPane root = new BorderPane();
        scene = new Scene(root);

        // Add the shared menu bar
        root.setTop(AppMenuBar.create(stage));

        //existing code reworked
        BorderPane gameBoard = new BorderPane();
        gameBoard.setStyle("-fx-background-color: #009245;");
        
        //declare areas of the gameBoard
        Pane dealerSide = new Pane(); //animation and label pane
        Pane cardArea = new Pane();  //animation and label pane
        HBox playerSide = new HBox(); //button options

        
        //Implementation of dealerSide animations and label
        Label dealerTotal = new Label(String.valueOf(dTotal));
        
        //Implementation of cardArea animations
        Label playerTotal = new Label(String.valueOf(pTotal));
        
        //PlayerSide Buttons
        Button hit = new Button("Hit");
        Button stay = new Button("stay");
        Button split = new Button("split");
        
        //Load dealerSide
        dealerSide.getChildren().addAll(dealerTotal);
        dealerTotal.setLayoutX(pTotal);
        //Load cardArea
        cardArea.getChildren().addAll(playerTotal);
        //Load playerSide
        playerSide.getChildren().addAll(hit, stay, split);
        playerSide.setAlignment(Pos.CENTER);
        
        //load gameboard
        gameBoard.setTop(dealerSide);
        gameBoard.setCenter(cardArea);
        gameBoard.setBottom(playerSide);
        
        root.setCenter(gameBoard);
        
    }

    public Scene getScene() {
        return scene;
    }
}


/*Dev notes***

**

BorderPane(Scene core)
 - Top: Border pane(dealerArea)
 ------ Top: dealerHand (HBox) cards imgs
 ------ Bottom: dealerTotal (Label) Centered

 - Center: BorderPane(tableArea)
 ------ Top: playerTotal (Label) Centered
 ------ Center: split cards (player) 
 ------ Bottom: player cards

 - Bottom: BorderPane 
 ------ HBox (Choice labels: Hit, Stand, Split)

*/