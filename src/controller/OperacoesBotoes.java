package controller;

import javax.swing.JOptionPane;
import com.sun.javafx.css.CssError.StringParsingError;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class OperacoesBotoes {
	
	int val=0,soma=0;
	
	public int captaText (TextField txtResult){
		return Integer.parseInt(txtResult.getText());
	}
	
	public void soma (TextField txtResult){
	
		val = Integer.parseInt(txtResult.getText());
		soma += val;
		System.out.println(soma);
	 
	}
	
	
	/*public void soma (Button botao){
	
	
		
		switch (botao.getText()){
			
		case "1":
			val += 1;
			break;
			
		case "2":
			val += 2;
			break;
		case "3":
			val += 3;
			break;
		case "+":
			soma += val;
			System.out.println("soma = " + soma);
		default:
			soma=0;
		
		}
		
		
		
	}*/

}
