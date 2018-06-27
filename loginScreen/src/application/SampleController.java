package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SampleController {

	@FXML
	private Pane pane;

	@FXML
	private TextField password;

	@FXML
	private Button btn;

	@FXML
	private TextField username;

	@FXML
	void clicked(ActionEvent event) throws IOException {

		if (username.getText().equals("Admin")) {
			if (password.getText().equals("1234")) {
				System.out.println("Welcome Admin !");
				
				// Stage dialog = new Stage();
				// VBox dialogVbox = new VBox(45);
				// dialogVbox.getChildren().add(new Text("Welcome Administrator !"));
				// Scene dialogScene = new Scene(dialogVbox, 300, 200);
				// dialog.setScene(dialogScene);
				// dialog.show();

				AnchorPane root = FXMLLoader.load(getClass().getResource("logged.fxml"));

				Stage stage = new Stage();
				Scene scene = new Scene(root, 300, 300);
				stage.setScene(scene);
				stage.show();

			}

		} else {
			 Alert alert = new Alert(AlertType.ERROR);
			 alert.setContentText("Wrong username or password");
			 alert.show();
		}

	}

	@FXML
	void initialize() {

	}

}
