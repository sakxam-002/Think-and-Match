package com.example.think_match;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.io.IOException;


public class StartViewController {

    @FXML
    private Label gamelabel;

    @FXML
    private Button startbutton , exitbutton;


    private MainApplication mainapp;
    @FXML
    private void initialize(){
        gamelabel.setText("A Memory Matching Game");
        Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/Kodchasan-Bold.ttf"), 25);
        gamelabel.setFont(font);
        startbutton.setFont(font);
        exitbutton.setFont(font);


    }
    private void onStartButtonClicked(ActionEvent actionEvent) throws IOException {
        Object showInputStage = mainapp.showInputStage;

    }
}
