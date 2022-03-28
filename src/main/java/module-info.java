module com.example.loginjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginjdbc to javafx.fxml;
    exports com.example.loginjdbc;
}