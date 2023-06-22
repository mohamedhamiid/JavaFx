
/* Shape */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        ShapesPane pane = new ShapesPane();
        // Create a scene and place a button in the scene
        Scene scene = new Scene(pane, 500, 500);
        scene.setFill(Color.GREY);

        // STAGE
        primaryStage.setTitle("View Shape"); // Set the stage title
        primaryStage.setScene(scene); // Put the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class ShapesPane extends Pane {
    public ShapesPane() {

        // Circle
        Circle circle = new Circle(50, 50, 25); // Center(50,50) Radius 25
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
        // Add to Pane
        this.getChildren().add(circle);

        // Rectangle
        Rectangle rect = new Rectangle(400, 400, 50, 50);
        rect.setFill(Color.GREEN);
        rect.setStroke(Color.BLACK);
        rect.setRotate(45);
        // add to Pane
        this.getChildren().add(rect);

        // Text
        Text c = new Text(80, 50, "Circle");
        c.setFill(Color.RED);
        c.setStroke(Color.BLACK);
        // add to pane
        this.getChildren().add(c);

        Text r = new Text(350, 450, "Rotated \n Rectangle");
        r.setFill(Color.GREEN);
        r.setStroke(Color.BLACK);
        // add to pane
        this.getChildren().add(r);

        // Line
        Line line = new Line(50, 50, 425, 425);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(5);

        this.getChildren().add(line);

        // Border Rect
        Rectangle mainRec = new Rectangle(10, 10, 480, 480);
        mainRec.setStroke(Color.BLACK);
        mainRec.setStrokeWidth(2);
        mainRec.setFill(null);
        mainRec.setArcHeight(20);
        mainRec.setArcWidth(20);
        // Add to Pane
        this.getChildren().add(mainRec);
    }
}
