package com.blackJack.Interface;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class AppMenuBar {
	
	public static MenuBar create(Stage stage) {
		Menu file = new Menu("File");
		
		MenuItem newGame = new MenuItem("New Game");
		//MenuItem leaderBoard = new MenuItem("LeaderBoard"); implement later
		MenuItem mainMenu = new MenuItem("Main Menu");
		MenuItem exitGame = new MenuItem("Exit");
		
		//Starts a new blackjack game
		newGame.setOnAction(e -> {
			GameView gv = new GameView(stage);
			stage.setScene(gv.getScene());
		});
		
		//calls a new window leader board
		
		
		//return to main menu
		mainMenu.setOnAction(e -> {
			MainView mv = new MainView(stage);
			stage.setScene(mv.getScene());
		});
		
		//Call screen to confirm and exit (At the moment just exits)
		exitGame.setOnAction(e -> {
			Platform.exit();
		});
		
		//add items to menu
		file.getItems().addAll(newGame, mainMenu, exitGame);
		
		//build bar
		MenuBar bar = new MenuBar();
		bar.getMenus().add(file);
		
		return bar;
	}
}
