package com.blackJack.Interface;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameView {

	private final Scene scene;
	//Play blackjack here - straps to api going to TableLogic(Will be created later)
	
	public GameView(Stage stage) {
		
		//Create scene
		StackPane pane = new StackPane();
		VBox vBox = new VBox(10);
		scene = new Scene(pane, 800, 600);
		pane.setStyle("-fx-background-color: #009245;");
		
		
		//create elements
		Button backButton = new Button("Back"); //change this button and functionality to menu items under file>Main Menu - include confirmation box making sure they know it will end their current game.
		backButton.setOnAction(e -> {
			MainView mainMenu = new MainView(stage);
			stage.setScene(mainMenu.getScene());
		});
		
		//position elements
		vBox.setAlignment(Pos.BOTTOM_LEFT);
		
		//finalize scene
		pane.getChildren().add(vBox);
		vBox.getChildren().addAll(backButton);

	}
	
	public Scene getScene() {
		return scene;
	}
}