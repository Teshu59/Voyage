package voyage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Inscription extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JButton Valider;
	private JTextField Pseudo;
	private JPasswordField PassWord;
	private JTextField Nom;
	private JTextField Prenom;
	private String Date;

	public void setValider(JButton valider) {
		Valider = valider;
	}

	private JTextField DateNaissance; 
	private String SNom;
	private String SPrenom;
	private java.util.Date SDateNaissance; 
	private String Id;
	private char[] Psw;
	
//	public static String Formulaire() {
	
	
		public JPanel buildContentPane2(){
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.gray);
			
			Valider = new JButton("Valider Inscription");
			Valider.addActionListener(this);
			panel.add(Valider);
			
			JLabel label = new JLabel("Nom");
			panel.add(label);
			JLabel label1 = new JLabel("Prénom");
			panel.add(label1);
			JLabel label2 = new JLabel("Date de Naissance");
			panel.add(label2);
			JLabel label3 = new JLabel("Pseudo");
			panel.add(label3);
			JLabel label4 = new JLabel("Mot De Passe");
			panel.add(label4);
			
			Nom = new JTextField();
			panel.add(Nom);
//			SNom = Nom.getText();
			
			Prenom = new JTextField();
			panel.add(Prenom);
//			SPrenom = Prenom.getText();
			
			DateNaissance = new JTextField();
			panel.add(DateNaissance);
//			SDateNaissance = DateNaissance.getText();
			
			Pseudo = new JTextField();
			panel.add(Pseudo);
//			Id = Pseudo.getText();
			
			PassWord = new JPasswordField();
			panel.add(PassWord);
//			Psw = PassWord.getPassword();
			
			label.setBounds		 	(30, 10, 170, 30);
			Nom.setBounds        	(150, 10, 200, 30);
			label1.setBounds	 	(30, 50, 170, 30);
			Prenom.setBounds        (150, 50, 200, 30);
			label2.setBounds		(30, 90, 170, 30);
			DateNaissance.setBounds (150, 90, 200, 30);
			label3.setBounds		(30, 130, 170, 30);
			Pseudo.setBounds        (150, 130, 200, 30);
			label4.setBounds		(30, 170, 170, 30);
			PassWord.setBounds      (150, 170, 200, 30);
			Valider.setBounds			(180, 210, 140, 30);
			return panel;
		}
		
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			System.out.println(source);
			
			if(source == Valider){
				System.out.println("Valider");
//				test = true;
				Psw = getPassWord().getPassword();
				Id = getPseudo().getText(); 
				SNom = getNom().getText();
				SPrenom = getPrenom().getText();
				SimpleDateFormat sdateform = new SimpleDateFormat ("dd/MM/yyyy");
//				Date date = null;
				Date = getDateNaissance().getText();
//				SDateNaissance = sdateform.parse(Date);
				try {
					SDateNaissance = sdateform.parse(Date);
//					Date DTest = sdateform.format(SDateNaissance);
					System.out.println(DateNaissance);
					System.out.println(sdateform.format(SDateNaissance));
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				
				ConnexionBdd.InscriptionUser(SNom, SPrenom, sdateform.format(SDateNaissance), Id, Psw);
		}
		}
		
//		public String requeteNewUser(){
//			ConnexionBdd.InscriptionUser(SNom, SPrenom, sdateform.format(SDateNaissance), Id, Psw);
//			return Id;
//			
//		}

		public JPanel getPanel() {
			return panel;
		}

		public void setPanel(JPanel panel) {
			this.panel = panel;
		}

		public JTextField getPseudo() {
			return Pseudo;
		}

		public void setPseudo(JTextField pseudo) {
			Pseudo = pseudo;
		}

		public JPasswordField getPassWord() {
			return PassWord;
		}

		public void setPassWord(JPasswordField passWord) {
			PassWord = passWord;
		}

		public JTextField getNom() {
			return Nom;
		}

		public void setNom(JTextField nom) {
			Nom = nom;
		}

		public JTextField getPrenom() {
			return Prenom;
		}

		public void setPrenom(JTextField prenom) {
			Prenom = prenom;
		}

		public JTextField getDateNaissance() {
			return DateNaissance;
		}

		public void setDateNaissance(JTextField dateNaissance) {
			DateNaissance = dateNaissance;
		}

		public String getSNom() {
			return SNom;
		}

		public void setSNom(String sNom) {
			SNom = sNom;
		}

		public String getSPrenom() {
			return SPrenom;
		}

		public void setSPrenom(String sPrenom) {
			SPrenom = sPrenom;
		}

		public java.util.Date getSDateNaissance() {
			return SDateNaissance;
		}

		public void setSDateNaissance(java.util.Date sDateNaissance) {
			SDateNaissance = sDateNaissance;
		}

		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public char[] getPsw() {
			return Psw;
		}

		public void setPsw(char[] psw) {
			Psw = psw;
		}


}
