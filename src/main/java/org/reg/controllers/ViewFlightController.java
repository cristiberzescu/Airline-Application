package org.reg.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.reg.model.Flight;
import org.reg.model.User;
import org.reg.services.FlightService;
import org.reg.services.UserService;

import java.io.IOException;
import java.util.ArrayList;


public class ViewFlightController {
    @FXML
    Button backButton;

    @FXML
    public void handleBack(javafx.event.ActionEvent customerPage) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("customerPage.fxml"));
        Parent viewCustomer = Loader.load();
        Scene LoginScene = new Scene(viewCustomer, 650, 450);
        Stage window = (Stage) ((Node) customerPage.getSource()).getScene().getWindow();
        window.setScene(LoginScene);
        window.show();
    }
}
