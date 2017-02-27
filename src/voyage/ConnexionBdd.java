package voyage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConnexionBdd extends JPanel {

	private static Connection conn;
	private static Statement vSt;
	private static ResultSet req;
	public static boolean  CoOk;
		  public static void connexion() {      

			String idCircuit;
			String pseudo = "Teshu";
		    try {

		      Class.forName("oracle.jdbc.driver.OracleDriver");

		      System.out.println("Driver O.K.");


		      String url = "jdbc:oracle:thin:@//localhost:1521/xe";

		      String user = "voyage";

		      String passwd = "A1Z2E3R4T5";


		       conn = DriverManager.getConnection(url, user, passwd);

		      System.out.println("Connexion effective !");         

		      vSt = conn.createStatement();
//		         String test;
//		         test = "SEQIDCLIENT.nextval";
//		      vSt.execute("INSERT INTO Client VALUES ("+ test+" ,'MOORELS', 'Alexis',"
//		      		+ " '09/06/1991', 'Teshu', 'A1Z2E3R4T5')");
		      
		      req = vSt.executeQuery("select MOTDEPASSE from client where identifiant = '" + pseudo +"'");
		      

			    while (req.next()){
			    	   idCircuit = req.getString("MOTDEPASSE");
			    	   
			    	   System.out.println("Psw = " + idCircuit + " !");
			      }
		      
		      
		      
		      System.out.println("Ligne insérée !");
		      
		      
		      

		    } catch (Exception e) {

		      e.printStackTrace();

		    } 

		  }
		  
		  public static Boolean CoUser(String id, String psw){
			  String Nom="";
//			  String psw1 = psw.toString();
			  try {
			  req = vSt.executeQuery("SELECT * FROM Client WHERE identifiant = '" + id +"' AND motdepasse = '" + psw + "'");
			  
			  System.out.println(id);
			  System.out.println(psw);
			  
			  
			  while (req.next()){
				  System.out.println("ok");
		    	   Nom = req.getString("NOM");
		    	   
		    	   System.out.println("Nom = " + Nom + " !");
		      }
	      
			  if (!req.next())
			  {
				  JOptionPane.showMessageDialog(null, "Mauvaise association Pseudo/Mot de passe, veuillez vérifier les information");
				  CoOk = false;
				  
			  }else {
				  CoOk = true;
			  }
			  
			  }catch (Exception e) {

			      e.printStackTrace();
		  }
			  
			return CoOk;
		}
		  
		  public static boolean isCoOk() {
			return CoOk;
		}

		public static void setCoOk(boolean coOk) {
			CoOk = coOk;
		}

		public static String InscriptionUser(String nom, String prenom, String bDate, String id, String psw){
//			  String Psw="";
			  String seq = "SEQIDCLIENT.nextval";
			  try {
			  req = vSt.executeQuery("INSERT INTO Client VALUES ("+ seq + ",'" + nom +"','"+ prenom+"','"
					  + bDate + "','" + id + "','" + psw +"')");
			  
			  
			  System.out.println("Test2");
//			  while (req.next()){
////		    	   Psw = req.getString("MOTDEPASSE");
//		    	   
//		    	  
//		      }
			  System.out.println("User créé");
			  
			  }catch (Exception e) {

			      e.printStackTrace();
		  }
			  return null;
		}
}