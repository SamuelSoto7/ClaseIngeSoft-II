package control;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class VentanaB {

    @FXML
    private TextArea outputTA;
    
    private String email;
    
    public VentanaB(String email) {
    	this.email = email;
    }
    
    @Override
    public void initialize(URL location)

}