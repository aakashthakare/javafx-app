module com.app.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.javafxapp to javafx.fxml;
    exports com.app.javafxapp;
}