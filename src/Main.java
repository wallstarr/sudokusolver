import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane mainPane = (AnchorPane) FXMLLoader.load(Main.class.getResource("sudokugui.fxml"));
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }
}
