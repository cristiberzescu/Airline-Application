package org.reg.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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

    }
}