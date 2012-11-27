import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class VueConsultationPeriodique extends Vue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldIssn;
	private JTextField textFieldNomPer;
	private JTextField textFieldNbPar;
	private JButton buttonRech;
	private JButton buttonAnnuler;
	private JButton buttonFermer;

	public VueConsultationPeriodique(Controleur controleur) {
		super(controleur);
		setTitle("Consultation d'un périodique");
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setBounds(100, 100, 402, 274);
		contentPane = new JPanel();
		this.addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
			getControleur().fermerVue(VueConsultationPeriodique.this);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("Issn :");
		label_1.setBounds(29, 44, 61, 15);
		contentPane.add(label_1);
		
		textFieldIssn = new JTextField();
		textFieldIssn.setColumns(10);
		textFieldIssn.setBounds(72, 42, 142, 19);
		contentPane.add(textFieldIssn);
		
		JLabel label = new JLabel("Nom du périodique :");
		label.setBounds(29, 123, 127, 15);
		contentPane.add(label);
		
		textFieldNomPer = new JTextField();
		textFieldNomPer.setEnabled(false);
		textFieldNomPer.setEditable(false);
		textFieldNomPer.setColumns(10);
		textFieldNomPer.setBounds(166, 121, 173, 19);
		contentPane.add(textFieldNomPer);
		
		buttonAnnuler = new JButton("Annuler");
		buttonAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			getControleur().fermerVue(VueConsultationPeriodique.this);}
		});
		buttonAnnuler.setBounds(247, 73, 107, 25);
		contentPane.add(buttonAnnuler);
		
		buttonRech = new JButton("Rechercher");
		buttonRech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getControleur().rechPeriodique(textFieldIssn.getText());
				}
		});
		buttonRech.setBounds(247, 36, 107, 25);
		contentPane.add(buttonRech);
		
		JLabel lblNombresDeParutions = new JLabel("Nombre de parutions :");
		lblNombresDeParutions.setBounds(14, 150, 142, 15);
		contentPane.add(lblNombresDeParutions);
		
		textFieldNbPar = new JTextField();
		textFieldNbPar.setEnabled(false);
		textFieldNbPar.setEditable(false);
		textFieldNbPar.setBounds(166, 152, 88, 19);
		contentPane.add(textFieldNbPar);
		textFieldNbPar.setColumns(10);
		
		buttonFermer = new JButton("Fermer");
		buttonFermer.setEnabled(false);
		buttonFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			getControleur().fermerVue(VueConsultationPeriodique.this);}
		});
		buttonFermer.setBounds(154, 200, 107, 25);
		contentPane.add(buttonFermer);
	}
	/**
	 * alimentation des composants d'affichage en consultant directement le periodique
	 */
	public void alimente(Periodique per) {
			textFieldNomPer.setText(per.getNomPeriodique());
	}
	/**
	 * définition des états de la fenêtre, cad des régions actives selon l'état
	 */
	public void setEtat (int etat){
		switch (etat) {
		case initiale: {
			buttonRech.setEnabled(true);
			buttonAnnuler.setEnabled(true);
			buttonFermer.setEnabled(false);
			break;
			}
		case finale: {
			buttonRech.setEnabled(false);
			buttonAnnuler.setEnabled(false);
			buttonFermer.setEnabled(true);
			break;
			}
		}
	}
}
