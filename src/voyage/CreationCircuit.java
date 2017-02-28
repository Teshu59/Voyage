package voyage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CreationCircuit extends JFrame implements ActionListener{

	private JPanel panel;
	private JButton Enregistrer;
	private JTextArea Description;
	private JTextField VilleDepart;
	private JTextField PaysDepart;
	private JTextField VilleArrivee;
	private JTextField PaysArrivee;
	private JTextField DateDepart;
	private JTextField NbPlace;
	private JTextField Duree;
	private JTextField Prix;
	private String Date;
	
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
	}
}
