module javafxdemo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens javafxdemo1 to javafx.fxml;
    exports javafxdemo1;
}
