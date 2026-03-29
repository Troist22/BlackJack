module blackJack {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	
	//create export for every package that talks outside of itself - java.lang.reflect.InvocationTargetException usually means this issue
	exports com.blackJack.Interface;
	exports com.blackJack.Main;
}