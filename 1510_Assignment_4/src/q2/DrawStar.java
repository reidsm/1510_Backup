package q2;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * <p>This program draws a five pointed star based on the
 * distance of the mouse cursor from a center point, which
 * is determined by the first mouse click. The star 
 * re-orients based on mouse movement and also re-sizes
 * based on mouse movement.</p>
 *
 * @author Scott Reid A01160090
 * @version 1.0
 */
public class DrawStar extends Application {
    /** 1/5 of a circle is 72, so 72 * 2 is 144. This
     * allows a line to be drawn from one point, skipping
     * the next point on the circle if all points are 
     * equidistant, and it goes to the point after the next
     * point. */
    static final double DEGREE_TO_SKIP = 72 * 2;   
    /** circle to move to first mouse click location. */
    private final Circle atCenter = new Circle(0, 0, 3);
    /** The contents of the application scene. */
    private Group root;
    /** center point. */
    private Point2D center;
    /** The first line from point 0 to point 2. */
    private Line line0;
    /** The first line from point 0 to point 3. */
    private Line line1;
    /** The first line from point 1 to point 3. */
    private Line line2;
    /** The first line from point 1 to point 4. */
    private Line line3;
    /** The first line from point 2 to point 4. */
    private Line line4;
    /** The current xcoord of the mouse. */
    private double eventX;
    /** The current ycoord of the mouse. */
    private double eventY;
    /** An instance of the rotate class. */
    private Rotate rotate;
    
    /**
     * This is a getter for eventX.
     * @return the eventX
     */
    public double getEventX() {
        return eventX;
    }


    /**
     * This is a getter for eventY.
     * @return the eventY
     */
    public double getEventY() {
        return eventY;
    }


    /**
     * Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        root = new Group(atCenter);
        atCenter.setFill(Color.CYAN);

        final int appWidth = 1000;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);
        
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("Star");
        primaryStage.setScene(scene);
        primaryStage.show();
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
    
    /**
     * This function instantiates the center point
     * to the location of the mouse click. It initializes
     * all 5 lines to basically a length of 0. 
     * 
     * @param event is the mouse press event
     */
    
    public void processMousePress(MouseEvent event) {
        root.getChildren().clear();
        root.getChildren().add(atCenter);
        
        this.center = new Point2D(event.getX(), event.getY());
        this.atCenter.setCenterX(this.center.getX());
        this.atCenter.setCenterY(this.center.getY());
        
        line0 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line0.setStroke(Color.CYAN);
        root.getChildren().add(line0);
        
        line1 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line1.setStroke(Color.CYAN);
        root.getChildren().add(line1);
        
        line2 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line2.setStroke(Color.CYAN);
        root.getChildren().add(line2);
        
        line3 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line3.setStroke(Color.CYAN);
        root.getChildren().add(line3);
        
        line4 = new Line(event.getX(), event.getY(), 
                event.getX(), event.getY());
        line4.setStroke(Color.CYAN);
        root.getChildren().add(line4);    

    }
    
    /**
     * This function instantiates a rotate instance
     * and sets the pivot point as the x and 
     * y coordinates of the center. It also
     * stores the current mouse location as
     * the event x and event y isntance variables
     * so they can be easily accessed by multiple
     * methods.
     * 
     * @param event is the mouse drag event
     */
    public void processMouseDrag(MouseEvent event) {
        
        eventX = event.getX();
        eventY = event.getY();
        
        rotate = new Rotate();
        rotate.setPivotX(center.getX());
        rotate.setPivotY(center.getY());
        
        updateLine0(eventX, eventY);    
        
    }
    /**
     * This function draws the first line.
     * 
     * @param x is the x coord of the point before last
     * on the circle
     * @param y is the y coord of the point before last
     * on the circle
     */
    public void updateLine0(double x, double y) {
        rotate.setAngle(DEGREE_TO_SKIP * (0 + 1));
        
        line0.setStartX(x);
        line0.setStartY(y);
        
        x = rotate.transform(eventX, eventY).getX();
        y = rotate.transform(eventX, eventY).getY();

        line0.setEndX(x);
        line0.setEndY(y);
        
        updateLine1(x, y);
    }
    /**
     * This function draws the first line.
     * 
     * @param x is the x coord of the point before last
     * on the circle
     * @param y is the y coord of the point before last
     * on the circle
     */
    public void updateLine1(double x, double y) {
        rotate.setAngle(DEGREE_TO_SKIP * (1 + 1));
        
        line1.setStartX(x);
        line1.setStartY(y);
        
        x = rotate.transform(eventX, eventY).getX();
        y = rotate.transform(eventX, eventY).getY();
        
        line1.setEndX(x);
        line1.setEndY(y);
        
        updateLine2(x, y);
    }
    /**
     * This function draws the second line.
     * 
     * @param x is the x coord of the point before last
     * on the circle
     * @param y is the y coord of the point before last
     * on the circle
     */
    public void updateLine2(double x, double y) {
        rotate.setAngle(DEGREE_TO_SKIP * (2 + 1));
        
        line2.setStartX(x);
        line2.setStartY(y);
        
        x = rotate.transform(eventX, eventY).getX();
        y = rotate.transform(eventX, eventY).getY();
        
        line2.setEndX(x);
        line2.setEndY(y);
        
        updateLine3(x, y);
    }
    /**
     * This function draws the third line.
     * 
     * @param x is the x coord of the point before last
     * on the circle
     * @param y is the y coord of the point before last
     * on the circle
     */
    public void updateLine3(double x, double y) {
        final int third = 3;
        
        rotate.setAngle(DEGREE_TO_SKIP * (third + 1));
        
        line3.setStartX(x);
        line3.setStartY(y);
        
        x = rotate.transform(eventX, eventY).getX();
        y = rotate.transform(eventX, eventY).getY();
        
        line3.setEndX(x);
        line3.setEndY(y);
        
        updateLine4(x, y);
    }
    /**
     * This function draws the last line.
     * 
     * @param x is the x coord of the point before last
     * on the circle
     * @param y is the y coord of the point before last
     * on the circle
     */
    public void updateLine4(double x, double y) {
        final int fourth = 4;
        
        rotate.setAngle(DEGREE_TO_SKIP * (fourth + 1));
        
        line4.setStartX(x);
        line4.setStartY(y);
        
        x = rotate.transform(eventX, eventY).getX();
        y = rotate.transform(eventX, eventY).getY();
        
        line4.setEndX(x);
        line4.setEndY(y);
    }
    
    
}

