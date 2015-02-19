
package login;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login extends Application {

    public static void main(String[] args) {
        
    	launch();
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
        BorderPane grid = new BorderPane();
       
        Scene scene = new Scene(grid, 600, 46);
       
        scene.getStylesheets().add(getClass().getResource("../css/Login.css").toExternalForm());
        scene.setFill(null);
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
        //primaryStage.hide();
    }
}