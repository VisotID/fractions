module com.inessa.fractions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.inessa.fractions to javafx.fxml;
    exports com.inessa.fractions;
}