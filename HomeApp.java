import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HomeApp extends Application{
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(new Button("Hello"));
        primaryStage.setTitle("HomeApp");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}