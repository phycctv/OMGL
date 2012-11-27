import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
/**
 * Fenêtre principale de l'application Bibliothèque avec le menu 
 * @author IUT,  A.Culet 
 * @version 1.0
 */
public class VueMenuBiblio  extends Vue{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// ************************************************************************************************************
	// Constructeur
	// ************************************************************************************************************
	public VueMenuBiblio(Controleur controleur) {
		super (controleur);
		setTitle("Gestion de bibliothèque");
		setBounds(400, 300, 450, 300);
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		contentPane = new JPanel();
		this.addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
			getControleur().fermerVue(VueMenuBiblio.this);
			}
		});
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(44, 24, 342, 21);
		getContentPane().add(menuBar);
		
		JMenu mnApplication = new JMenu("Application");
		mnApplication.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnApplication);
		
		JMenuItem menuItemQuotas = new JMenuItem("Parametrage quotas");
		menuItemQuotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//  affichage de la fenetre de parametrages des quotas
				getControleur().parametrageQuotas(); }
		});
		mnApplication.add(menuItemQuotas);
		
		JMenuItem menuItemQuitter = new JMenuItem("Quitter");
		menuItemQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getControleur().fermerVue(VueMenuBiblio.this);
				}		
		});
		mnApplication.add(menuItemQuitter);
		
		
		
		JMenu mnOuvrage = new JMenu("Ouvrage");
		menuBar.add(mnOuvrage);
		
		JMenuItem MenuItemOuv = new JMenuItem("Nouvel ouvrage");
		
		MenuItemOuv.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de saisie d'un ouvrage
				getControleur(). saisirOuvrage() ;}
		});
		
		mnOuvrage.add(MenuItemOuv);

		JMenuItem MenuItemExemp = new JMenuItem("Nouvel exemplaire");
		MenuItemExemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//  affichage de la fenetre de saisie d'un exemplaire
				getControleur(). saisirExemplaire() ;}
		});
		
		mnOuvrage.add(MenuItemExemp);
		
		JMenuItem menuItemConsult = new JMenuItem("Consulter ouvrage");
		menuItemConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// affichage de la fenetre de consultation d'un ouvrage
				getControleur(). consulterOuvrage() ;}
		});
		
		mnOuvrage.add(menuItemConsult);
		
		JMenuItem MenuItemEmpEx = new JMenuItem("Emprunt exemplaire");
		MenuItemEmpEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//  affichage de la fenetre d'emprunt d'un exemplaire
				getControleur(). empruntExemplaire() ;}
		});
		
		mnOuvrage.add(MenuItemEmpEx);
		
		JMenuItem menuItemRetEx = new JMenuItem("Retour exemplaire");
		menuItemRetEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// affichage de la fenetre de retour d'un exemplaire
				getControleur(). retourExemplaire() ;}
		});
		
		mnOuvrage.add(menuItemRetEx);
		
		
		
		JMenu mnPeriodique = new JMenu("Periodique");
		menuBar.add(mnPeriodique);
		
		JMenuItem MenuItemNouPer = new JMenuItem("Nouveau périodique");
		
		MenuItemNouPer.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de saisie d'un périodique
				getControleur().nouveauPeriodique();}
		});
		
		mnPeriodique.add(MenuItemNouPer);
		
		JMenuItem MenuItemNouPar = new JMenuItem("Nouvelle parution");
		
		MenuItemNouPar.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de saisie d'une parution
				getControleur().nouvelleParution() ;}
		});
		
		mnPeriodique.add(MenuItemNouPar);
		
		JMenuItem MenuItemConsPar = new JMenuItem("Consultation périodique");
		
		MenuItemConsPar.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de consultation d'un périodique
				getControleur().consultationPeriodique() ;}
		});
		
		mnPeriodique.add(MenuItemConsPar);
		
		
		
		JMenu mnAuteur = new JMenu("Auteur");
		menuBar.add(mnAuteur);
		
		JMenuItem MenuItemAut = new JMenuItem("Recherche par auteur");
		
		MenuItemAut.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de recherche par auteur
				getControleur(). rechercheAuteur() ;}
		});
		
		mnAuteur.add(MenuItemAut);
		
		
		
		JMenu mnLecteur = new JMenu("Lecteur");
		menuBar.add(mnLecteur);
		
		JMenuItem MenuItemNouLec = new JMenuItem("Nouveau lecteur");
		
		MenuItemNouLec.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de saisie nouveau lecteur
				getControleur(). nouveauLecteur() ;}
		});
		
		mnLecteur.add(MenuItemNouLec);
		
		JMenuItem MenuItemConsLec = new JMenuItem("Consulter lecteur");
		
		MenuItemConsLec.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent event) {
				//  affichage de la fenetre de consultation d'un lecteur
				getControleur(). consultationLecteur() ;}
		});
		
		mnLecteur.add(MenuItemConsLec);
	
	}// Fin Constructeur
	
	/**
	 * méthode exécutée lorsque la croix de fermeture de la fenêtre a été cliquée
	 */
	public void windowClosing (WindowEvent e) {
		getControleur().fermerVue(VueMenuBiblio.this);
	}

}
