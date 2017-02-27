package voyage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormulaireDeCo extends JFrame {
	

	public FormulaireDeCo() {      

	
	this.setTitle("Ma premeiere fenetre");
	
	this.setSize(400,100);
	
	this.setLocationRelativeTo(null);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setContentPane(new ConnexionBdd());
	
	this.setVisible(true);
	

	
	
	}
}
