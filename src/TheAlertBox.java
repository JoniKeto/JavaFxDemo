import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class TheAlertBox {

	public static void display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.showAndWait();									
		/* Shows this stage and waits for it to be hidden (closed) 
		 * before returning to the caller. This method temporarily 
		 * blocks processing of the current event, and starts a nested 
		 * event loop to handle other events. This method must be called 
		 * on the FX Application thread
		 */

	}
	
}
