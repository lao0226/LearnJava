package Homework8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DrawHangman extends Application {
	
	private static final double PANE_WIDTH = 400;
	private static final double PANE_HEIGHT = 400;
	private static final double HEAD_RADIUS = 20;
	
	
	public void start(Stage primaryStage) {       
	    Pane pane = new Pane();
	 
	    drawHanger(pane);
	    drawHead(pane);
	    drawArms(pane);
	    drawBody(pane);
	    drawLegs(pane);
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, PANE_WIDTH, PANE_HEIGHT);
	    primaryStage.setTitle("DrawHangman"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	
	public void drawHanger(Pane pane) {
		Line line1=new Line();
		line1.setStartX(50);
		line1.setStartY(380);
		line1.setEndX(200);
		line1.setEndY(380);
		
		Line line2=new Line();
		line2.setStartX(125);
		line2.setStartY(380);
		line2.setEndX(125);
		line2.setEndY(40);
		
		Line line3=new Line();
		line3.setStartX(125);
		line3.setStartY(40);
		line3.setEndX(320);
		line3.setEndY(40);
		
		Line line4=new Line();
		line4.setStartX(320);
		line4.setStartY(40);
		line4.setEndX(320);
		line4.setEndY(100);
		
		pane.getChildren().add(line1);
		pane.getChildren().add(line2);
		pane.getChildren().add(line3);
		pane.getChildren().add(line4);
	}
	
	public void drawHead(Pane pane) {
		
		Circle head=new Circle();
		head.setRadius(HEAD_RADIUS);
		head.setCenterX(320);
		head.setCenterY(120);
		head.setStroke(Color.BLACK);
		head.setFill(Color.WHITE);
		pane.getChildren().add(head);
		

	}
	
	public void drawArms(Pane pane) {
		
		Line line5=new Line();
		line5.setStartX(300);
		line5.setStartY(130);
		line5.setEndX(260);
		line5.setEndY(160);
		
		Line line6=new Line();
		line6.setStartX(340);
		line6.setStartY(130);
		line6.setEndX(380);
		line6.setEndY(160);
		
		pane.getChildren().add(line5);
		pane.getChildren().add(line6);
	}
	
	public void drawBody(Pane pane) {

		Line line7=new Line();
		line7.setStartX(320);
		line7.setStartY(140);
		line7.setEndX(320);
		line7.setEndY(200);
		pane.getChildren().add(line7);
	}
	
	public void drawLegs(Pane pane) {
		Line line8=new Line();
		line8.setStartX(320);
		line8.setStartY(200);
		line8.setEndX(270);
		line8.setEndY(320);
		
		Line line9=new Line();
		line9.setStartX(320);
		line9.setStartY(200);
		line9.setEndX(370);
		line9.setEndY(320);
		
		pane.getChildren().add(line8);
		pane.getChildren().add(line9);
	}

} 
