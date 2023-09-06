package com.example.think_match;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;




public class MainApplication extends Application {

    public Object showInputStage;
    private Stage mainstage;
    private MainApplication mainapp;

    public void start(Stage stage)throws IOException{
     homepage();
    }

    public void homepage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("start-view.fxml"));
        AnchorPane root = fxmlLoader.load();

        Scene scene = new Scene(root, 500,400);
        Stage homestage = new Stage(StageStyle.DECORATED);
        homestage.setFullScreen(true);
        homestage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Esc"));
        homestage.setFullScreenExitHint("Press ESC to Exit Fullscreen");
        homestage.setTitle("Think & Match");
        homestage.setScene(scene);
        homestage.show();
    }

    private Stage showInputStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Input-Name.fxml"));
        Parent root = fxmlLoader.load();
        Input_Name_Controller mainController =fxmlLoader.getController();
        Stage stage =new Stage(StageStyle.DECORATED);
        stage.setTitle("Think & Match");
        stage.setScene(new Scene(root));
        stage.show();
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}