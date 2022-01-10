package com.pb.demidenko.hw15;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import javax.xml.soap.Text;

public class ClientGUI extends Application  {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/ClietGUI.fxml"));
Parent root = FXMLLoader.load(getClass().getResource("ClientGUI.fxml"));
Scene scene = new Scene(root);
primaryStage.setScene(scene);
primaryStage.show();
        // установка надписи
 //       Text text = new Text("Hello METANIT.COM!");
//        text.setLayoutY(80);    // установка положения надписи по оси Y
 //       text.setLayoutX(80);   // установка положения надписи по оси X
/*
      Group group = new Group();
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(250);
        primaryStage.show();
*/
    }
}
