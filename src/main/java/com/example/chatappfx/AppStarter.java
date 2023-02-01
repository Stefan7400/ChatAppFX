package com.example.chatappfx;

import com.example.chatappfx.ui.login.LoginController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppStarter extends Application {


    private  LoginController loginController;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppStarter.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        this.loginController = fxmlLoader.getController();
        stage.setTitle("ChatAppFX");
        stage.setScene(scene);
        loginController.onLoginAction(() -> {
            try {
                var loader = new FXMLLoader(AppStarter.class.getResource("main-view.fxml"));
                stage.setScene(new Scene(loader.load()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}