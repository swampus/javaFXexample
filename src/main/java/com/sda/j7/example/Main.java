package com.sda.j7.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


        Button button2 = (Button) root.getChildrenUnmodifiable().stream().filter(
                t->t.getId().equals("theButton3")).findFirst().get();

        button2.setOnMouseClicked(t->{
            System.out.println("theButton3 Clicked");
        });



    }


    public static void main(String[] args) {
        launch(args);
    }
}
