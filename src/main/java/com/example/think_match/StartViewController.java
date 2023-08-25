package com.example.think_match;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;



public class StartViewController {

    @FXML
    private Label gamelabel;

    @FXML
    private Button startbutton , exitbutton;
    @FXML
    private void initialize(){
        gamelabel.setText("A Memory Matching Game");
        Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/Kodchasan-Bold.ttf"), 25);
        gamelabel.setFont(font);
        startbutton.setFont(font);
        exitbutton.setFont(font);


    }
}
