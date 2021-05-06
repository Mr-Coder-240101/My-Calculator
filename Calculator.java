import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Calculator extends Application {

	public static void main(String args[]) {
		Application.launch(args);
	}

	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
		Scene scene = new Scene(root);
		Image image = new Image("MyCalculator.png");
		stage.getIcons().add(image);
		stage.setScene(scene);
		stage.setTitle("My Calculator");
		stage.show();
	}

}