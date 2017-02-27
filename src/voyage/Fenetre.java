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
	private JButton Connexion;
	private JButton Valider;
	private JButton SearchByRating;
	private JComboBox SearchByGenre;
	private JTextField Pseudo;
	// private JTextField PassWord;
	private JTextArea Resultat;
	private JPanel panel;
	private JPanel panel1;
	private boolean connecte = false;
	private boolean inscription = false;
	private boolean test = false;
	private String Id;
	private char[] Psw;
	private JTextField Nom;
	private JTextField Prenom;
	private JTextField DateNaissance;
	private String SNom;
	private String SPrenom;
	private String Date;
	private java.util.Date SDateNaissance;
	private JPasswordField PassWord;

	// ReadJson Json= new ReadJson();

	// récupération des données du fichier
	// static ArrayList<Serie> lesSeries;
	// static ArrayList<Actor> lesActors;

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

	public JTextArea getResultat() {
		return Resultat;
	}

	public void setResultat(JTextArea resultat) {
		Resultat = resultat;
	}

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

	// paramètre de la fenêtre ( taille, titre, position ...)
	public void build() {
		setTitle("Réservation voyage"); // On donne un titre à l'application
		setSize(400, 430); // On donne une taille à notre fenêtre
		setLocationRelativeTo(null); // On centre la fenêtre sur l'écran
		setResizable(true); // On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On dit à
														// l'application de se
														// fermer lors du clic
														// sur la croix
		setContentPane(buildContentPane());

		if (connecte) {

			setContentPane(buildContentPane1());
			this.setVisible(true);
			connecte = false;
		}

		if (inscription) {

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
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		// ajout label
		JLabel label = new JLabel("Pseudo");
		panel.add(label);

		JLabel label1 = new JLabel("Mot de Passe");
		panel.add(label1);

		JLabel lb_url = new JLabel();
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
		Connexion = new JButton("Connexion");
		Connexion.addActionListener(this);
		panel.add(Connexion);

		// ajout texte
		Pseudo = new JTextField();
		panel.add(Pseudo);
		Id = Pseudo.getText();

		PassWord = new JPasswordField();
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
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);

		JButton test = new JButton("Test");
		panel.add(test);

		JLabel label = new JLabel("Connecté");
		panel.add(label);

		label.setBounds(30, 10, 170, 30);
		test.setBounds(180, 100, 140, 30);
		return panel;
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

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		System.out.println(source);
		// action SearchByName
		if (source == Connexion) {
			connecte = true;
			Psw = getPassWord().getPassword();
			Id = getPseudo().getText();
			ConnexionBdd.CoUser(Id, Psw);
			build();

			System.out.println("AV insc");
		}

	}


	// public JTextArea getResultat(){
	// return Resultat;
	// }
}
