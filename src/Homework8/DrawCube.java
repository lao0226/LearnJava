package Homework8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

public class DrawCube extends Application{

	private static final double PANE_HEIGHT=400;
	private static final double PANE_WIDTH=400;
	private static final double RECT_HEIGHT=200;
	private static final double RECT_WIDTH=200;
	
	
	public void start(Stage primaryStage) {
		
		Pane pane=new Pane();
		drawCube(pane);
		
		Scene scene=new Scene(pane,PANE_HEIGHT,PANE_WIDTH);
		primaryStage.setTitle("Cube");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void drawCube(Pane pane) {
		Rectangle rect1=new Rectangle(RECT_WIDTH,RECT_HEIGHT);
		Rectangle rect2=new Rectangle(RECT_WIDTH,RECT_HEIGHT);
		rect1.setX(100);
		rect1.setY(100);
		rect1.setFill(Color.TRANSPARENT);
		rect1.setStroke(Color.BLACK);
		rect2.setX(200);
		rect2.setY(40);
		rect2.setFill(Color.TRANSPARENT);
		rect2.setStroke(Color.BLACK);
		
		
		Line line1=new Line();
		line1.setStartX(100);
		line1.setStartY(100);
		line1.setEndX(200);
		line1.setEndY(40);
		
		Line line2=new Line();
		line2.setStartX(300);
		line2.setStartY(100);
		line2.setEndX(400);
		line2.setEndY(40);
		
		Line line3=new Line();
		line3.setStartX(100);
		line3.setStartY(300);
		line3.setEndX(200);
		line3.setEndY(240);
		
		Line line4=new Line();
		line4.setStartX(300);
		line4.setStartY(300);
		line4.setEndX(400);
		line4.setEndY(240);
	
		
		pane.getChildren().add(rect1);
		pane.getChildren().add(rect2);
		pane.getChildren().add(line1);
		pane.getChildren().add(line2);
		pane.getChildren().add(line3);
		pane.getChildren().add(line4);
		
	}
}
