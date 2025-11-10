module com.example.oop2a3zms {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.oop2a3zms to javafx.fxml;
    exports com.example.oop2a3zms;
    exports com.example.oop2a3zms.Controllers;
    opens com.example.oop2a3zms.Controllers to javafx.fxml;
    exports com.example.oop2a3zms.Model;
    opens com.example.oop2a3zms.Model to javafx.fxml;
}