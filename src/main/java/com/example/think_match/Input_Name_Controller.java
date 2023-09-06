package com.example.think_match;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;



public class Input_Name_Controller {

    private MainApplication mainapp;

    @FXML
    private Label name1label, name2label;

    @FXML
    private TextField onenamefield, twonamefield;

    @FXML
    private Button playbutton;
    private void initialize(){
        name1label.setText("Enter Player 1 Name: ");
        name2label.setText("Enter Player 2 Name: ");
        Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/Kodchasan-Bold.ttf"), 25);
        name1label.setFont(font);
        name2label.setFont(font);
        playbutton.setFont(font);
        onenamefield.setFont(font);
        twonamefield.setFont(font);
    }
}
