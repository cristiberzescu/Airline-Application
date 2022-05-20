package org.reg.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class AddFlightController {
    @FXML
    public void handleBack(javafx.event.ActionEvent back) throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getClassLoader().getResource("administratorPage.fxml"));
        Parent viewAdmin = Loader.load();
        Scene AdminScene = new Scene(viewAdmin, 650, 450);
        Stage window = (Stage) ((Node) back.getSource()).getScene().getWindow();
        window.setScene(AdminScene);
        window.show();
    }
    @FXML
    public void handleSaveFlight() throws Exception {

    }
}
