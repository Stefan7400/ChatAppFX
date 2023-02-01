package com.example.chatappfx.ui.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.function.Consumer;

public class LoginController {

    private final LoginBusinessLogic backendBusinessLogic = new LoginBusinessLogic();
    private Runnable runnable;

    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;

    public void onLogin(){
        runnable.run();
    }

    public void onLoginAction(final Runnable runnable){
        this.runnable = runnable;
    }



}
