import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label; 
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;

public class PasswordPane extends GridPane {

	private TextField password;
	private TextField confirmPassword;
	
	public PasswordPane() {
		password = new TextField();
		Label pw = new Label("Password: ");
		
		confirmPassword = new TextField();
		Label confirmPW = new Label("Confirm Password: ");
		
		Button submit = new Button("Submit");
		submit.setOnAction(this::processSubmit);
		
		add(pw, 0, 0);
		add(password, 1, 0);
		add(confirmPW, 0, 1);
		add(confirmPassword, 1, 1);
		add(submit, 0, 2);
		
		
	}
	
	public void processSubmit(ActionEvent event) {
		if(password.getText().equals(confirmPassword.getText())) {
			System.out.println("Passwords match");
		}else {
			System.out.println("Passwords do not match");
		}
	}
	
}
