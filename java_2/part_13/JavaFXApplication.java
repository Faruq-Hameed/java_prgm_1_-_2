package part_13;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    @Override
    public void start(Stage window) {
        window.setTitle("Hello World!");
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}