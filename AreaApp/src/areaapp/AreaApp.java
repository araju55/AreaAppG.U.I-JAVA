/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Joseph
 */
public class AreaApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("getArea'");

        TextField widthField = new TextField("Enter width");   
        TextField heightField = new TextField("Enter height");
        Label areaLabel = new Label("Area");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle (ActionEvent event) {
              String area = getArea(widthField.getText(), heightField.getText());   
              areaLabel.setText(area);
         }
            
        });
            
        VBox root = new VBox(5.0);
        Scene scene = new Scene(root);
        root.getChildren().add(widthField);
        root.getChildren().add(heightField);
        root.getChildren().add(areaLabel);
        root.getChildren().add(btn);
        
        primaryStage.setTitle("Areas");
        primaryStage.setScene(scene);
        primaryStage.show();      
    }
    
    public String getArea(String h, String w) {
        int height = Integer.parseInt(h);
        int width = Integer.parseInt(w);      
        return String.valueOf(width * height);   
    }

    public static void main(String[] args) {
        launch(args);
    }
}
