import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class FirstEventHandler extends Application{
    /** Holds the number of time the button is pressed. */
    private int count;
    private int count2;
    private TextField setCount;
    
    /** Displays the number of times the button is pressed. */
    private Text countText;
    private Text countText2;

    /**
     * Presents a GUI containing a button and text that displays
     * how many times the button is pushed.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {        
        count = 0;
        countText = new Text("Pushes: 0");
        countText2 = new Text("Pushes: 0");

        Button YES = new Button("YES");
        YES.setOnAction(this::processButtonPress); // Wow!

        Button NO = new Button ("NO");
        NO.setOnAction(this::processButtonPress2);
        
        Button DECREMENT_YES = new Button("NOT_YES");
        DECREMENT_YES.setOnAction(this::processButtonPress3); // Wow!

        Button DECREMENT_NO = new Button ("NOT_NO");
        DECREMENT_NO.setOnAction(this::processButtonPress4);
        
        setCount = new TextField();
        setCount.setOnAction(this::resetCount);
        
        FlowPane pane = new FlowPane(YES, countText, NO, countText2, DECREMENT_YES, DECREMENT_NO, setCount);
        pane.setAlignment(Pos.CENTER);
        
        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: cyan");

        final int appWidth = 300;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Updates the counter and text when the button is pushed.
     * @param event invokes this method
     */
    public void processButtonPress(ActionEvent event) {
        count++;
        countText.setText("Pushes: " + count);
    }
    
    public void processButtonPress2(ActionEvent event) {
        count2++;
        countText2.setText("Pushes: " + count2);
    }
    public void processButtonPress3(ActionEvent event) {
        count--;
        countText.setText("Pushes: " + count);
    }
    
    public void processButtonPress4(ActionEvent event) {
        count2--;
        countText2.setText("Pushes: " + count2);
    }
    
    public void resetCount(ActionEvent event) {
        String newCount = setCount.getText();
        count = Integer.parseInt(newCount);
        count2 = Integer.parseInt(newCount);
        countText.setText("Pushes: " + count);
        countText2.setText("Pushes: " + count2);
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
