package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
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
	private Button btnN1, btnN2
	, btnN3, btnSoma, btnIgual;
	
	@FXML
	private TextField txtResult;
	
	
	public void acaoBotao (ActionEvent event) {
		
		OperacoesBotoes op = new OperacoesBotoes();
	    
		if (event.getTarget() == btnN1){
			txtResult.setText(txtResult.getText() + btnN1.getText());
			op.captaText(txtResult);
		}
		if (event.getTarget() == btnN2){
			txtResult.setText(txtResult.getText() + btnN2.getText());
			op.captaText(txtResult);
		}if (event.getTarget() == btnSoma){
			op.captaText(txtResult);
			op.soma(txtResult);
		}
		
		/*if (event.getTarget() == btnN1) {
			
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
		}*/
		
		
	/* fz um split no texto do textfield e pegar o que est� antes		
	   do "+" e depois do mais e somar. */
		
		
	}

}
