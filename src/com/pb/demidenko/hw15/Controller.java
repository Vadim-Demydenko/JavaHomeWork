package com.pb.demidenko.hw15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

        @FXML
        private Button buttonSend;

        @FXML
        private TextField inuser;


        @FXML
        private void click(ActionEvent event) {
            buttonSend.setText("You've clicked!");
            System.out.println("Нажата кнопеп");
        }
    String str  = inuser.getText();
        inuser.
                System.out.println(str);

}


