package ca.bcit.comp1510.lab10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PhonePad extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new PhonePane(), 500, 250);
		
		primaryStage.setTitle("Phone Pad");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
