import java.awt.*;
import javax.swing.*;




class fenetre extends JFrame {

	   public JTextField j1;
	   public JTextField j2;
	   public JTextField j3;
	   public JTextField j4;
	   public JTextField j5;
	   public JLabel j6;
	   public JRadioButton r1;
	   public JRadioButton r2;

	   ButtonGroup buttonGroup = new ButtonGroup();
	   
	   JButton b1 = new JButton();
	   
	   
	   private static final long serialVersionUID = 1L;
	  
	   
	   public fenetre() {
		      
		   Container c = getContentPane();

		   
		   
		   
		   c.setLayout(null);
		   j1 = new JTextField("Nom");
		   j2 = new JTextField("Prenom");
		   j3 = new JTextField("Date de Naissance");
		   j4 = new JTextField("Lieu");
		   j5 = new JTextField("Logement");
		   j6 = new JLabel("Sexe");
		   r1 = new JRadioButton("Masculin");
		   r2 = new JRadioButton("Feminin");
		   b1 = new JButton("Enregistrer");
		   j1.setBounds(570,200,150,30);
		   j2.setBounds(570,240,150,30);
		   j3.setBounds(570,280,150,30);
		   j4.setBounds(570,320,150,30);
		   j5.setBounds(570,360,150,30);
		   j6.setBounds(570,400,150,30);
		   r1.setBounds(570,440,150,30);
		   r2.setBounds(570,480,150,30);
		   
		   b1.setBounds(570,480,150,30);
		   c.add(j1);
		   c.add(j2);
		   c.add(j3);
		   c.add(j4);
		   c.add(j5);
		   c.add(j6);
		   c.add(r1);
		   c.add(r2);
		   c.add(b1);

		   buttonGroup.add(r1);
		   buttonGroup.add(r2);
		 
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