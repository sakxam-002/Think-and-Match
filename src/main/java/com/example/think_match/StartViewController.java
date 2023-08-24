package com.example.think_match;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class StartViewController extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Image bgimage = new Image("/imgs/thnk-bg.jpg");
        ImageView bgimgview = new ImageView(bgimage);

        Group root=new Group();
        root.getChildren().addAll(bgimgview);

        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
