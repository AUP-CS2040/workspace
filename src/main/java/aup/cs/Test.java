package aup.cs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.beans.property.StringProperty;

import javafx.util.converter.DoubleStringConverter;


public class Test extends Application {
  @Override
  public void start(Stage primaryStage) {
    Pane pane = new Pane();

    Circle circ = new Circle(300,300, 150.0);

    TextField celsius = new TextField();
    celsius.setLayoutX(150.0);
    celsius.setLayoutY(50.0);

    TextField farenheit = new TextField();
    farenheit.setLayoutX(150.0);
    farenheit.setLayoutY(100.0);

    celsius.textProperty().bindBidirectional(farenheit.textProperty(),new DoubleStringConverter());

    pane.getChildren().addAll(celsius, farenheit);

    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setTitle("MyJavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
