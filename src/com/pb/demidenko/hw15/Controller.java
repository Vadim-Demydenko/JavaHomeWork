package com.pb.demidenko.hw15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static com.pb.demidenko.hw15.ClientGUI.*;

public class Controller {
    String inserv = "";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSend;

    @FXML
    private TextField inuser;

    @FXML
    private TextArea inserver;

    @FXML
    void click(ActionEvent event) throws Exception {
        String serverIp = "127.0.0.1";
        int serverPort = 1234;
//        System.out.println("Соединяемся с сервером " + serverIp + ":" + serverPort);

        Socket server = new Socket(serverIp, serverPort);
        BufferedReader inServerVV = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);
         String vvuser = inuser.getText();
        outServer.println(vvuser);//отправили серверу поле ввода
        inuser.setText("");
        String dataFromServer = inServerVV.readLine();//
//        System.out.println(dataFromServer);
        inserv = inserv + "\n" + dataFromServer;//считали
        inserver.setText(inserv);

        inServerVV.close();
        outServer.close();
        server.close();


    }

    @FXML
    void initialize() {
        assert buttonSend != null : "fx:id=\"buttonSend\" was not injected: check your FXML file 'ClientGUI.fxml'.";
        assert inuser != null : "fx:id=\"inuser\" was not injected: check your FXML file 'ClientGUI.fxml'.";
        assert inserver != null : "fx:id=\"inserver\" was not injected: check your FXML file 'ClientGUI.fxml'.";

    }
}


