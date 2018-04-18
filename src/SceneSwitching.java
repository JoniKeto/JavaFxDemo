import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class SceneSwitching extends Application {
	
	Stage window;
	Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		Label label1 = new Label ("First scene");
		Button button1 = new Button("Go to scene two");
		button1.setOnAction(e -> window.setScene(scene2));
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		// Button2
		Button button2 = new Button("This scene sucks, go back to scene one");
		button2.setOnAction(e -> window.setScene(scene1));
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(button2);
		scene2 = new Scene(layout2, 500, 300);
		
		window.setScene(scene1);
		window.setTitle("Title here");
		window.show();
		
		
		
		
		
	}
	
	

}
