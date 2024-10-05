module com.jjfc.superturboservice {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jjfc.superturboservice to javafx.fxml;
    opens controllers to javafx.fxml;
    exports com.jjfc.superturboservice;
    exports controllers;
}
