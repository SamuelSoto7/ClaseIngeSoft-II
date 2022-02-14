package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//AWT - Peligro
import javafx.stage.Stage;
import main.Main;

public class VentanaA implements Initializable {

	@FXML
	private Button SubmitBoton;

	@FXML
	private TextField email;

	private String emailSTR;

	public VentanaA() {
		emailSTR = "alfa@a.com";
	}

	@FXML
	void Submit(ActionEvent event) throws Exception{
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaB.fxml"));
		loader.setController(new VentanaB());
		Parent parent  = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.email.setText(emailSTR);
	}

}