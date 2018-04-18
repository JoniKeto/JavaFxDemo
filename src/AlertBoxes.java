import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class AlertBoxes extends Application {
	
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)  {
		window = primaryStage;
		window.setTitle("Otsikko");
		
		button = new Button("Click me");
		button.setOnAction(e -> TheAlertBox.display("Title of the window", "Wow this is cool"));
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	
	
	
	
	
	
	

}
