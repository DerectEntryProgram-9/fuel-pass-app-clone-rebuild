package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashScreenFormController {

    public Label lblStatus;
    public Rectangle pgbContainer;
    public Rectangle pgbLoad;

    public void initialize(){
        Timeline t1 = new Timeline(250);
        var frame1 = new KeyFrame(Duration.millis(800), new EventHandler<ActionEvent>() {  //800millis giyta passe key frame ekak add wenna
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Connecting with database ...!");
                pgbLoad.setWidth(pgbLoad.getWidth() + 129);
            }
        });

        var frame2 = new KeyFrame(Duration.millis(1600), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Loading data ...!");
                pgbLoad.setWidth(pgbLoad.getWidth() + 129);
            }
        });

        var frame3 = new KeyFrame(Duration.millis(2400), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Loading optional data ...!");
                pgbLoad.setWidth(pgbLoad.getWidth() + 129);
            }
        });

        var frame4 = new KeyFrame(Duration.millis(3200), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("Setting up the UI ...!");
                pgbLoad.setWidth(pgbLoad.getWidth() + 129);
            }
        });

        var frame5 = new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


                try {
                    pgbLoad.setWidth(pgbContainer.getWidth());
                    URL res = this.getClass().getResource("/view/HomeForm.fxml"); // 7
                    Parent container = FXMLLoader.load(res); // 8
                    Scene scene = new Scene(container); // 5
                    Stage stage = new Stage(); // 1
                    stage.setScene(scene); // 6
                    stage.setTitle("National fuel pass app"); // 4
                    stage.show();  // 2
                    stage.centerOnScreen(); // 3
                    lblStatus.getScene().getWindow().hide(); // lblstatus eka tiyena scene eke window eka ran hide karanna
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        t1.getKeyFrames().addAll(frame1, frame2, frame3, frame4, frame5);
        t1.playFromStart();
    }
}
