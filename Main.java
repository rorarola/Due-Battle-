package Due_Battle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Due Battle");
        Scene window = new Scene(root, 1200, 900);
        window.getRoot().requestFocus();
        primaryStage.setScene(window);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
