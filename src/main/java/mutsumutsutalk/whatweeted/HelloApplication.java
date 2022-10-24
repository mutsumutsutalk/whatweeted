package mutsumutsutalk.whatweeted;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloApplication extends Application {

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage) throws IOException {
    log.debug("Initializing JavaFX GUI...");
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    log.debug("loading complete.");
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
    log.info("Awakened Secret Society Braid.");
  }
}