package com.group5.iftt;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        primaryStage.setTitle("IFTTT's son");
        primaryStage.setScene(new Scene(root, 382, 462));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}