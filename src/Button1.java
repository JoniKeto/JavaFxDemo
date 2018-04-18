

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class Button1 extends Application  {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Some title");

        button = new Button();
        button.setText("click me!");
        
        // This class will handle the button events
        button.setOnAction(e -> System.out.println("JuuJuu"));
        
        
        // Is exactly the same as:
//        button.setOnAction(new EventHandler<ActionEvent>() {
//        	@Override
//        	public void handle(ActionEvent event) {
//        		System.out.println("JeeJee!");
//        	}
//		});

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

//    @Override
//    public void handle(ActionEvent event) {
//        if (event.getSource() == button) {
//            System.out.println("JAAHAS, nyt tapahtuu jotain!");
//        }
        
    
}
