import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL res = this.getClass().getResource("view/SplashScreenForm.fxml"); // 7
        Parent root = FXMLLoader.load(res); // 8  // Java object ekakata load wenn kiyla tyenne
        Scene scene = new Scene(root); // 4
        primaryStage.setScene(scene); // 5
        scene.setFill(Color.TRANSPARENT); // 6  // scene eke background eka transparent karana eka
        primaryStage.initStyle(StageStyle.TRANSPARENT); // 3  //decorated stage ekak by default enne
        primaryStage.show(); // 1
        primaryStage.centerOnScreen(); // 2
    }
}
