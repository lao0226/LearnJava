package homework7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DrawRectangle extends Application{

	private final static double PANE_HEIGHT = 400;
	private final static double PANE_WIDTH = 400;
	private final static double RECT_HEIGHT = 150;
	private final static double RECT_WIDTH = 150;
	
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		drawRectangle(pane);
		
		Scene scene = new Scene(pane, PANE_WIDTH, PANE_HEIGHT);
		primaryStage.setTitle("DrawRectangle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void drawRectangle(Pane pane) {
		
		for(int i=0;i<80;i++) {
			Rectangle rect = new Rectangle(RECT_WIDTH, RECT_HEIGHT);
			rect.setX(PANE_WIDTH*(Math.random()*3));  // set the x-location of the left top corner
			rect.setY(PANE_HEIGHT*(Math.random()*3)); // set the y-location of the left top corner
			rect.setFill(Color.WHITE);
			rect.setStroke(Color.BLUE);
			pane.getChildren().add(rect);
		}
		
		// You can also construct a rectangle with another constructor
		// double x = PANE_WIDTH/2 - RECT_WIDTH/2;
		// double y = PANE_HEIGHT/2 - RECT_HEIGHT/2;
		// Rectangle rect = new Rectangle(x, y, RECT_WIDTH, RECT_HEIGHT);
	}
}
