import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyFirstGraphicsProgram extends Application{

    public void start(Stage stage) {
        final int xy = 250;
        final int namex = 225;

        Group root = new Group();

        Circle circle1 = new Circle(xy, xy, 100);
        Text name = new Text(namex, xy, "Scott Reid");
        circle1.setFill(Color.GREEN);
        name.setFill(Color.WHITE);

        root.getChildren().addAll(circle1, name);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTYELLOW);
        stage.setTitle("My First JavaFX Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}