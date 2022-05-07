module com.example.airline_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.airline_application to javafx.fxml;
    exports com.example.airline_application;
}