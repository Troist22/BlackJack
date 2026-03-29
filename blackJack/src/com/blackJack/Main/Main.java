package com.blackJack.Main;

import com.blackJack.Interface.MainView;

//fx imports
import javafx.application.Application;
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
		
		//set stage and begin scene
		stage = primaryStage; //Sets the stage globally to be used by all scenes
		MainView mainMenu = new MainView(stage);
		stage.setScene(mainMenu.getScene());
		stage.setTitle("BothKind's BlackJack");
		stage.show();
	}
	
	@Override
	public void stop() {}
}
