package com.example.think_match;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("start-view.fxml"));
        AnchorPane root = fxmlLoader.load();

        Scene scene = new Scene(root, 500,400);
        stage.setFullScreen(true);
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Esc"));
        stage.setFullScreenExitHint("Press ESC to Exit Fullscreen");
        stage.setTitle("Think & Match");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}