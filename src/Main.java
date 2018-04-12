import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/main_view.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 361.0, 380.0, Color.TRANSPARENT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
