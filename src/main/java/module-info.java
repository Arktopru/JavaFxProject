module com.example.javafxpoject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javafxpoject to javafx.fxml;
    exports com.example.javafxpoject;
}