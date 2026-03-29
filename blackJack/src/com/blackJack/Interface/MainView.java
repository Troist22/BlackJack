package com.blackJack.Interface;


import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView {

	private final Scene scene;
	
	//creates menu for leaderboard and other games/settings menus (engine layer)
	public MainView(Stage stage) {
		
		//Create scene
		StackPane pane = new StackPane();
		VBox vBox = new VBox(10);
		scene = new Scene(pane, 800, 600);
		pane.setStyle("-fx-background-color: #009245;");
		
		//create elements
		Button startGameButton = new Button("Start Game");
		Button exitGameButton = new Button("Exit");
		
		//give elements function
		startGameButton.setOnAction(e -> {
			GameView game = new GameView(stage);
			stage.setScene(game.getScene());
		});
		exitGameButton.setOnAction(e -> Platform.exit());
		
		//position elements
		vBox.setAlignment(Pos.CENTER);
		
		//finalize scene
		pane.getChildren().add(vBox);
		vBox.getChildren().addAll(startGameButton, exitGameButton);

	}
	
	public Scene getScene() {
		return scene;
	}
}
