package org.reg.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    private static String loggedUsername;
    @FXML
    private static String loggedRole;

    @FXML
    public void handleLoginAction(javafx.event.ActionEvent homepage) throws IOException {

    }
    public void goToRegistration(javafx.event.ActionEvent register) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("register.fxml"));
        Parent viewRegister = Loader.load();
        Scene RegisterScene = new Scene(viewRegister, 590, 450);
        Stage window = (Stage) ((Node) register.getSource()).getScene().getWindow();
        window.setScene(RegisterScene);
        window.show();
    }
}