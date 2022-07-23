package controller;

import javafx.application.Platform;
import javafx.scene.layout.AnchorPane;

public class ControlCenterFormController {

    public AnchorPane pneControlCenter;

    public void initialize(){
        Platform.runLater(pneControlCenter::requestFocus);

        AnchorPane.setLeftAnchor(pneControlCenter,0.0);
        AnchorPane.setRightAnchor(pneControlCenter,0.0);
        AnchorPane.setTopAnchor(pneControlCenter,0.0);
        AnchorPane.setBottomAnchor(pneControlCenter,0.0);
    }
}
