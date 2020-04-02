import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// Technique1 afin de gerer les evenemnt listener on doit implementer l'interface ActionListener //implements ActionListener
// ou alors de facon direct Technique 2 addActionListener
// Technique d'utilisation d'outil graphique pour swing ex: WindowsBuilder dans ce cas il  est necessaire de dl le plugin
public class MaFenetre extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// label Swing
	JLabel jLabel1 = new JLabel("Nom : ");
	// Texte Swing
	JTextField jTextField1 = new JTextField(12);
	// 2 bouton Swing
	JButton btnAdd = new JButton("Add");
	JButton btnRemove = new JButton("Delete");

	// 2 list AWT (Abstract Window Toolkit) interface graphique Windows
	List list1 = new List();
	List list2 = new List();

	// Constructeur
	public MaFenetre() {
		// afin de terminer le processus une fois un clik sur la x de fermer il
		// est nécessaire d'utiliser la methode si dessous
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// technique de placement de la fenetre qui utilise BorderLayout
		// cad la fenetre est divise en 5 (nord, sud, est, ouest et centre)
		this.setLayout(new BorderLayout());
		// mis au nord le paneau jPanel1
		JPanel jPanel1 = new JPanel();
		// flowLayout Construit un nouveau FlowLayout avec un alignement centré et un écart horizontal et vertical par défaut de 5 unités.
		jPanel1.setLayout(new FlowLayout());
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);
		jPanel1.add(btnAdd);
		jPanel1.add(btnRemove);
		// objet anonyme , cad il a une implementataion, addActionListener
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String string = jTextField1.getText();
				list1.add(string);
			}
		});
		btnRemove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int numero = list1.getSelectedIndex();
				list1.remove(numero);
			}
		});
		// on doit lié les elements qui doivent etre ecoute Technique1
		// btnAdd.addActionListener(this);
		// btnRemove.addActionListener(this);


		// on met la fenetre au nord
		this.add(jPanel1, BorderLayout.NORTH);

		// autre paneau qui vas masquer le 1er mais qui sera une grille
		// qui sera divisé par le nombre l'element ajout (add)
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new GridLayout());
		jPanel2.add(list1);
		jPanel2.add(list2);
		this.add(jPanel2, BorderLayout.CENTER);

		//Dimension de la fenetre setBounds
		// this.setBounds(10,10,500,500);
		// si vs desirez que la fenetre prenne tous l'ecran et quelle soit rtesponsive
		// on utile la librairy Toolkit de AWT
		// Toolkit.getDefaultToolkit() permet d'avoir acces au propriete system
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		// affichage de la fenetre
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new MaFenetre();
	}

	// redefinir actionPerformed Technique1

	//	@Override
	//	public void actionPerformed(ActionEvent e) {
	//		if(e.getSource() == btnAdd) {
	//			String string = jTextField1.getText();
	//			list1.add(string);
	//		}
	//		//suppression
	//		else if (e.getSource() == btnRemove) {
	//			int numero = list1.getSelectedIndex();
	//			list1.remove(numero);
	//		}
	//		
	//	}


}
