import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PasswordValidator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new PasswordPane(), 500, 250);
		
		primaryStage.setTitle("Password Validator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}