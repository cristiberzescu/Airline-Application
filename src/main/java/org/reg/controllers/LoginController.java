package org.reg.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    private static String loggedUsername;
    @FXML
    private static String loggedRole;

    public static String getLoggedUsername() { return loggedUsername;}
}