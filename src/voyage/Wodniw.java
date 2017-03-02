package voyage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Wodniw extends JFrame implements ActionListener {
	
	public Wodniw(String text) {
		build(text);
		this.setVisible(true);
	}
	public boolean build(String text){
		
		setTitle("Title"); // On donne un titre à l'application
		setSize(400, 430); // On donne une taille à notre fenêtre
		setLocationRelativeTo(null); // On centre la fenêtre sur l'écran
		setResizable(true); // On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On dit à 
														// l'application de se
														// fermer lors du clic
														// sur la croix
		setContentPane(buildContentPanel(text));
		
		return true;
	}

	
	private JPanel buildContentPanel(String text) {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		
		JLabel label = new JLabel(text);
		panel.add(label);
		
		label.setBounds(30, 10, 170, 30);
		return panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
