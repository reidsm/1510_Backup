import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label; 
import javafx.scene.control.Button;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;

public class PasswordPane extends GridPane {

	private TextField password;
	private TextField confirmPassword;
	private ForbiddenWords forbidden;
	
	public PasswordPane() {
		password = new TextField();
		Label pw = new Label("Password: ");
		
		confirmPassword = new TextField();
		Label confirmPW = new Label("Confirm Password: ");
		
		Button submit = new Button("Submit");
		submit.setOnAction(arg0 -> {
			try {
				processSubmit(arg0);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		add(pw, 0, 0);
		add(password, 1, 0);
		add(confirmPW, 0, 1);
		add(confirmPassword, 1, 1);
		add(submit, 0, 2);
		
		
	}
	
	public void processSubmit(ActionEvent event) throws FileNotFoundException {
		if(password.getText().equals(confirmPassword.getText())) {
			System.out.println("Passwords match");
			System.out.println("Contains uppercase letter?: " + containsUpper(password.getText()));
			System.out.println("Contains lowercase letter?: " + containsLower(password.getText()));
			System.out.println("Contains number letter?: " + containsNumber(password.getText()));
			System.out.println("Contains special letter?: " + containsSpecial(password.getText()));
			System.out.println("In range?: " + inRange(password.getText()));
			forbidden = new ForbiddenWords("C:\\Work\\Workspace_2019-06\\1510_Lab_9\\src\\wordlist.txt");
			System.out.println("Password contains forbidden words?: " + forbidden.containsWord(password.getText()));
		}else {
			System.out.println("Passwords do not match");
		}
	}
	
	public boolean containsUpper(String password) {
		String uppercaseLetters = "ACBDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean upperState = false;
		int passwordLength = password.length();
		
		for (int i = 0; i < passwordLength; i++) {
			if (uppercaseLetters.indexOf(password.charAt(i)) != -1) {
				upperState = true;
				i = passwordLength;
			} else {
				upperState = false;
			}
		}
		return upperState;
	}
	
	public boolean containsLower(String password) {
		String uppercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		boolean upperState = false;
		int passwordLength = password.length();
		
		for (int i = 0; i < passwordLength; i++) {
			if (uppercaseLetters.indexOf(password.charAt(i)) != -1) {
				upperState = true;
				i = passwordLength;
			} else {
				upperState = false;
			}
		}
		return upperState;
	}
	
	public boolean containsNumber(String password) {
		String uppercaseLetters = "123456789";
		boolean upperState = false;
		int passwordLength = password.length();
		
		for (int i = 0; i < passwordLength; i++) {
			if (uppercaseLetters.indexOf(password.charAt(i)) != -1) {
				upperState = true;
				i = passwordLength;
			} else {
				upperState = false;
			}
		}
		return upperState;
	}
	
	public boolean containsSpecial(String password) {
		String uppercaseLetters = "!#$%&'()*\"";
		boolean upperState = false;
		int passwordLength = password.length();
		
		for (int i = 0; i < passwordLength; i++) {
			if (uppercaseLetters.indexOf(password.charAt(i)) != -1) {
				upperState = true;
				i = passwordLength;
			} else {
				upperState = false;
			}
		}
		return upperState;
	}
	
	public boolean inRange(String password) {
		int passwordLength = password.length();
		return (passwordLength >= 8 && passwordLength <= 10);
	}
	
}