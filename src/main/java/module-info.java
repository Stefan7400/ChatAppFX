module com.example.chatappfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappfx to javafx.fxml;
    opens com.example.chatappfx.ui.login to javafx.fxml;
    exports com.example.chatappfx;
    exports com.example.chatappfx.ui.main;
    exports com.example.chatappfx.ui.login;
    opens com.example.chatappfx.ui.main to javafx.fxml;
}