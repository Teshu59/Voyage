package voyage;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener {
	Inscription Ins = new Inscription();
	// initialisation des composants graphiques(bouton, texte, label ...)
	private JButton Connexion= new JButton("Connexion");
	private JButton Valider = new JButton("Valider");
	private JButton SearchByRating = new JButton("Connexion");
	private JButton test1 = new JButton("Test");
	private JLabel connect� = new JLabel("Connect�");
	private JComboBox SearchByGenre;
	private JTextField Pseudo= new JTextField();
	// private JTextField PassWord;
	private JTextArea Resultat= new JTextArea();
	private JPanel panel= new JPanel();
	private JPanel panel1 = new JPanel();
	private boolean connecte = false;
	private boolean inscription = false;
	private boolean test = false;
	private String Id;
	private char[] Psw;
	private String Mdp;
	private JTextField Nom;
	private JTextField Prenom;
	private JTextField DateNaissance;
	private String SNom;
	private String SPrenom;
	private String Date;
	private java.util.Date SDateNaissance;
	private JPasswordField PassWord;
	private JLabel label = new JLabel("Pseudo");
	private JLabel label1 = new JLabel("Mot de Passe");
	private JLabel lb_url = new JLabel();

	// ReadJson Json= new ReadJson();

	// r�cup�ration des donn�es du fichier
	// static ArrayList<Serie> lesSeries;
	// static ArrayList<Actor> lesActors;
	
	// param�tre de la fen�tre ( taille, titre, position ...)
	public void build() {
		setTitle("R�servation voyage"); // On donne un titre � l'application
		setSize(400, 430); // On donne une taille � notre fen�tre
		setLocationRelativeTo(null); // On centre la fen�tre sur l'�cran
		setResizable(true); // On interdit le redimensionnement de la fen�tre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On dit �
														// l'application de se
														// fermer lors du clic
														// sur la croix
		// Ouverture de la page de connexion
		setContentPane(buildContentPane());

		if (connecte) {

			setContentPane(buildContentPane1());
			this.setVisible(true);
			connecte = false;
		}

		if (inscription) {

			// Ouverture de la page d'incription
			// setContentPane(buildContentPane2());
			setContentPane(Ins.buildContentPane2());
			this.setVisible(true);
			inscription = false;
		}

		if (test) {
			setContentPane(buildContentPane1());
			this.setVisible(true);
			test = false;
		}
	}
	
	private JPanel buildContentPane() {
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		// ajout label
		
		panel.add(label);
		panel.add(label1);

		
		lb_url.setText("Inscription");
		lb_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// addListener(lb_url);
		panel.add(lb_url);
		lb_url.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				// inscription = true;
				// build();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				inscription = true;
				build();

			}
		});

		// ajout bouton SearchByName
		Connexion.addActionListener(this);
		panel.add(Connexion);

		// ajout texte
		panel.add(Pseudo);
		Id = Pseudo.getText();

		panel.add(PassWord);

		// taille et position des composants
		// setBounds(Posisiont en x, position en y, largeur, hauteur)
		label.setBounds(30, 10, 170, 30);
		label1.setBounds(30, 60, 170, 30);
		Connexion.setBounds(180, 100, 140, 30);
		lb_url.setBounds(220, 125, 140, 30);
		Pseudo.setBounds(150, 10, 200, 30);
		PassWord.setBounds(150, 60, 200, 30);

		return panel;
	}
	
	private JPanel buildContentPane1() {
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		
		panel.add(test1);

		panel.add(connect�);

		connect�.setBounds(30, 10, 170, 30);
		test1.setBounds(180, 100, 140, 30);
		return panel;
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		System.out.println(source);
		// action SearchByName
		if (source == Connexion) {
			connecte = true;
			Psw = getPassWord().getPassword();
			Mdp = String.valueOf(Psw);
			Id = getPseudo().getText();
//			ConnexionBdd.CoUser(Id, Mdp);
			if (ConnexionBdd.CoOk)
			{
				build();
			}

		}

	}


	// public JTextArea getResultat(){
	// return Resultat;
	// }
	
	
	public JButton getConnexion() {
		return Connexion;
	}

	public void setConnexion(JButton connexion) {
		Connexion = connexion;
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

	// public void setPassWord(JTextField passWord) {
	// PassWord = passWord;
	// }


	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public boolean isConnecte() {
		return connecte;
	}

	public void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	// public String getPsw() {
	// return Psw;
	// }
	//
	// public void setPsw(String psw) {
	// Psw = psw;
	// }

	public Fenetre() {
		super();
		build();
		this.setVisible(true);
	}

	public void setPassWord(JPasswordField passWord) {
		PassWord = passWord;
	}

	

	



	
	public boolean isInscription() {
		return inscription;
	}

	public void setInscription(boolean inscription) {
		this.inscription = inscription;
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

	public void setSDateNaissance(java.util.Date sDateNaissance) {
		SDateNaissance = sDateNaissance;
	}
}
