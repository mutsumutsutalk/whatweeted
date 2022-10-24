package mutsumutsutalk.whatweeted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloController {

  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
    log.info("helloButton has been clicked!");
  }
}