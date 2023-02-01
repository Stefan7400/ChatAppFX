module com.example.chatappfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappfx to javafx.fxml;
    exports com.example.chatappfx;
    exports com.example.chatappfx.ui.main;
    opens com.example.chatappfx.ui.main to javafx.fxml;
}