package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WelcomeFormController {

    public Button btnLogin;
    public Button btnRegister;
    public AnchorPane pneWelcome;

    public void initialize(){

    }

    public void btnRegisterOnAction(ActionEvent actionEvent) throws IOException {
        URL resource1 = this.getClass().getResource("/view/RegisterForm.fxml");
        AnchorPane registerForm = FXMLLoader.load(resource1);
        Scene scene = new Scene(registerForm);
        AnchorPane pneContainer = (AnchorPane) pneWelcome.getParent();
        pneContainer.getChildren().clear();
        pneContainer.getChildren().add(registerForm);

        AnchorPane.setLeftAnchor(registerForm, 0.0);
        AnchorPane.setRightAnchor(registerForm, 0.0);
        AnchorPane.setTopAnchor(registerForm, 0.0);
        AnchorPane.setBottomAnchor(registerForm, 0.0);

    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource2 = this.getClass().getResource("/view/LoginForm.fxml");
        AnchorPane loginForm = FXMLLoader.load(resource2);
        Scene scene = new Scene(loginForm);
        AnchorPane pneContainer = (AnchorPane) pneWelcome.getParent();
        pneContainer.getChildren().clear();
        pneContainer.getChildren().add(loginForm);

        AnchorPane.setLeftAnchor(loginForm, 0.0);
        AnchorPane.setRightAnchor(loginForm, 0.0);
        AnchorPane.setTopAnchor(loginForm, 0.0);
        AnchorPane.setBottomAnchor(loginForm, 0.0);

    }
}
