package voyage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassePanel extends JPanel implements ActionListener {
	
	public static JPanel buildContentPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		
		JLabel label = new JLabel("tessssssssssst");
		panel.add(label);
		
		label.setBounds(30, 10, 170, 30);
		return panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
