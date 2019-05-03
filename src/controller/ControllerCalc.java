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
	
	int val1, val2, soma;
	
	@FXML
	private Button btnN1, btnN2, btnIgual, btnSoma;
	
	@FXML
	private TextField txtResult;
	
	
	public void acaoNum(ActionEvent event) {
		
		
		
		if (event.getTarget() == btnN1) {
			
			txtResult.setText(btnN1.getText());
			val1 = Integer.parseInt(txtResult.getText());
			
			
			
		}else if (event.getTarget() == btnN2) {
			

			txtResult.setText(btnN2.getText());
			val2 = Integer.parseInt(txtResult.getText());
			
			
		}else if (event.getTarget() == btnSoma) {
            
			soma += val1 + val2;
			JOptionPane.showMessageDialog(null, "Soma = " + soma);
			soma = 0;
		}
		
		
			
		
		
		
	}

}
