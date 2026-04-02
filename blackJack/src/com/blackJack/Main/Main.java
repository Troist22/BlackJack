package com.blackJack.Main;

import com.blackJack.Interface.MainView;

//fx imports
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage stage;
	
	@Override
	public void init() {}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//begin program
		
		Rectangle2D screenSize = Screen.getPrimary().getVisualBounds(); //Added this for consistent sizing
		//set stage and begin scene 
		stage = primaryStage; //Sets the stage globally to be used by all scenes
		MainView mainMenu = new MainView(stage);
		stage.setScene(mainMenu.getScene());
		stage.setTitle("BothKind's BlackJack");
		//Set initial game size
		stage.setWidth(screenSize.getWidth() / 2);
		stage.setHeight(screenSize.getHeight() / 2);
		stage.show();
	}
	
	@Override
	public void stop() {}
}
