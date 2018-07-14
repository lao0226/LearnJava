package homework7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class CheckerBoard extends Application{
	
	private final static double PANE_HEIGHT = 600;
	private final static double PANE_WIDTH = 600;
	private final static double RECT_HEIGHT = 100;
	private final static double RECT_WIDTH = 100;
	private final static int ROW = 6;
	private final static int COL = 6;
	
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		drawCheckerBoard(pane);
		
		Scene scene = new Scene(pane, PANE_HEIGHT, PANE_WIDTH); // add pane to the scene
		primaryStage.setTitle("CheckerBoard");
		primaryStage.setScene(scene); // add scene to the stage
		primaryStage.show();
	}
	
	public void drawCheckerBoard(Pane pane) {
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				double x=j*RECT_WIDTH;
				double y=i*RECT_HEIGHT;
				Rectangle rect=new Rectangle(x,y,RECT_WIDTH,RECT_HEIGHT);
				if((i+j)%2==0) {
					rect.setFill(Color.WHITE);
				}
				else {
					rect.setFill(Color.BLACK);
				}
				rect.setStroke(Color.BLACK);
				pane.getChildren().add(rect);
			}
		}
		
		
	}

}
