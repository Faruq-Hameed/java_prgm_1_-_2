import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        Button button = new Button("This is a button");
        Button buttonB = new Button("This is a button");
        Button buttonC = new Button("This is a button");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(buttonB);
        componentGroup.getChildren().add(buttonC);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFXApplication.class);
    }
}