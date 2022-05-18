package org.reg.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class EnrollFlightController {
    @FXML
    Button backButton;
    Button enrollButton;
    public void handleBack(javafx.event.ActionEvent login) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("customerPage.fxml"));
        Parent viewLogin = Loader.load();
        Scene LoginScene = new Scene(viewLogin, 650, 450);
        Stage window = (Stage) ((Node) login.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }
    public void handleViewEnroll(javafx.event.ActionEvent login) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("viewEnrolledFlightPage.fxml"));
        Parent viewLogin = Loader.load();
        Scene LoginScene = new Scene(viewLogin, 650, 520);
        Stage window = (Stage) ((Node) login.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }
}
