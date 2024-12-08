import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Override
    public void start(Stage primaryStage) throws Exception {
        // Menampilkan halaman login
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Zeppeli's Listening Bar");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
