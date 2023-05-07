import java.awt.*;
import javax.swing.*;




class fenetre extends JFrame {

	   public JTextField j1;
	   public JTextField j2;
	   public JTextField j3;
	   public JTextField j4;
	   public JTextField j5;
	   
	   public JButton b1;
	   
	   
	   private static final long serialVersionUID = 1L;
	  
	   
	   public fenetre() {
		      
		   Container c = getContentPane();

		   
		   
		   
		   c.setLayout(null);
		   j1 = new JTextField("Nom");
		   j2 = new JTextField("Prenom");
		   j3 = new JTextField("Date de Naissance");
		   j4 = new JTextField("Lieu");
		   j5 = new JTextField("Logement");
		   b1 = new JButton("Enregistrer");
		   j1.setBounds(570,200,150,30);
		   j2.setBounds(570,240,150,30);
		   j3.setBounds(570,280,150,30);
		   j4.setBounds(570,320,150,30);
		   j5.setBounds(570,360,150,30);
		   
		   b1.setBounds(570,480,150,30);
		   c.add(j1);
		   c.add(j2);
		   c.add(j3);
		   c.add(j4);
		   c.add(j5);
		   c.add(b1);
		 
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setSize(1280,720);
		   setVisible(true);
		   setTitle("Finoana");
		   setLocationRelativeTo(null);
		   setResizable(false);
		   
	   }
	
}




public class main {

	public static void main(String[] args) {
	     
		  fenetre p = new fenetre();
		  
	}

}