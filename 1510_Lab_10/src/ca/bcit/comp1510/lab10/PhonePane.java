package ca.bcit.comp1510.lab10;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;

public class PhonePane extends GridPane {
	
	public PhonePane() {
		int buttonLabel = 1;
		
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				Integer label = buttonLabel;
				Button button = new Button(label.toString());
				buttonLabel++;
				button.setOnAction(this::dialNumber);
				
				add(button, column, row);
			}
		}
		
		Button star = new Button("*");
		star.setOnAction(this::dialNumber);
		Button zero = new Button("0");
		zero.setOnAction(this::dialNumber);
		Button pound = new Button("#");
		pound.setOnAction(this::dialNumber);
		
		add(star, 0, 3);
		add(zero, 1, 3);
		add(pound, 2, 3);
		
	}
	
	public void dialNumber(ActionEvent event) {
		String num = ((Button) event.getSource()).getText();
		System.out.println(num);
	}

}
