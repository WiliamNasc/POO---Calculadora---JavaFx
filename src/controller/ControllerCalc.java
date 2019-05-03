package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerCalc implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	Integer val1 = null;
	Integer val2 = null;
	Integer soma = null;

	
	@FXML
	private Button btnN1, btnN2, btnIgual, btnSoma;
	
	@FXML
	private TextField txtResult;
	
	
	public void acaoNum(ActionEvent event) {
		
		
		
		if (event.getTarget() == btnN1) {
			
			txtResult.setText(txtResult.getText() + btnN1.getText());
			
			
			
			
		}else if (event.getTarget() == btnN2) {
			

			txtResult.setText(txtResult.getText()+ btnN2.getText());
			val2 = Integer.parseInt(txtResult.getText());
			
			
		}else if (event.getTarget() == btnSoma) {
			if (val1 != null)  { 
				val2 = Integer.parseInt(txtResult.getText());
				soma = val1 + val2;
				txtResult.setText("");
				JOptionPane.showMessageDialog(null, "Soma = " + soma);
				soma = 0;
			} else { 
				val1 = Integer.parseInt(txtResult.getText());
				txtResult.setText("");
			}
		}
		
		
			
		
		
		
	}

}
