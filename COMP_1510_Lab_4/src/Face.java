import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Face extends Application{

    public void start(Stage stage) {
        Group root = new Group();

        Circle head = new Circle(250, 250, 200, Color.PEACHPUFF);
        Circle eye1 = new Circle(180, 190, 10, Color.BLACK);
        Circle eye2 = new Circle(320, 190, 10, Color.BLACK);

        Rectangle leftGlass = new Rectangle(130, 168, 100, 50);
        leftGlass.setFill(null);
        leftGlass.setStroke(Color.GREY);
        leftGlass.setStrokeWidth(3);

        Rectangle rightGlass = new Rectangle(275, 168, 100, 50);
        rightGlass.setFill(null);
        rightGlass.setStroke(Color.GREY);
        rightGlass.setStrokeWidth(3);

        Line bridge = new Line(230, 193, 275, 193);
        bridge.setStroke(Color.GREY);
        Line mouth = new Line(150, 340, 350, 340);

        Ellipse hair = new Ellipse(250, 70, 115, 25);
        hair.setFill(Color.SADDLEBROWN);

        root.getChildren().addAll(head, eye1, eye2, leftGlass, rightGlass, hair, mouth, bridge);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTYELLOW);
        stage.setTitle("Scott's Hi-Fidelity Face");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}