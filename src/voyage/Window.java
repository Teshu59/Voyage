package voyage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import voyage.ClassePanel;

public class Window extends JFrame implements ActionListener {
	private JButton Enter= new JButton("Enter");
	private JTextField text = new JTextField();
	JPanel paneltest = buildContentPanel();
	
	public Window() {
		build();
		this.setVisible(true);
	}
	public boolean build(){
		
		setTitle("Title"); // On donne un titre à l'application
		setSize(400, 430); // On donne une taille à notre fenêtre
		setLocationRelativeTo(null); // On centre la fenêtre sur l'écran
		setResizable(true); // On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On dit à 
														// l'application de se
														// fermer lors du clic
														// sur la croix
		
		setContentPane(paneltest);
		
		return true;
	}

	
	private JPanel buildContentPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		
		JLabel label = new JLabel("label");
		panel.add(label);

		
		panel.add(text);
		
		
		Enter.addActionListener(this);
		panel.add(Enter);
		
		label.setBounds(30, 10, 170, 30);
		text.setBounds(180, 100, 140, 30);
		Enter.setBounds(180, 140, 140, 30);
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == Enter){
			
//			String champ = getText().getText();
//			System.out.println(champ);
//			Wodniw wodniw=new Wodniw(champ);
//			dispose();
			
			paneltest.setVisible(false);
			JPanel classePanel = ClassePanel.buildContentPanel();
			setContentPane(classePanel);
			classePanel.setVisible(true);
			
		}
	}
	public JButton getEnter() {
		return Enter;
	}
	public void setEnter(JButton enter) {
		Enter = enter;
	}
	public JTextField getText() {
		return text;
	}
	public void setText(JTextField text) {
		this.text = text;
	}
	
	
}
