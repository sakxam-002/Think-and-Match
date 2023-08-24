module com.example.think_match {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.think_match to javafx.fxml;
    exports com.example.think_match;
}