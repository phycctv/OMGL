import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class VueNouveauPeriodique extends Vue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldIssn;
	private JTextField textFieldNomPerio;

	public VueNouveauPeriodique(Controleur controleur) {
		super(controleur);
		setTitle("Nouveau périodique");
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setBounds(400, 300, 400, 200);
		contentPane = new JPanel();
		this.addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
			getControleur().fermerVue(VueNouveauPeriodique.this);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIssn = new JLabel("Issn :");
		lblIssn.setBounds(127, 31, 61, 15);
		contentPane.add(lblIssn);
		
		textFieldIssn = new JTextField();
		textFieldIssn.setBounds(170, 29, 142, 19);
		contentPane.add(textFieldIssn);
		textFieldIssn.setColumns(10);
		
		JLabel lblNomDuPriodique = new JLabel("Nom du périodique :");
		lblNomDuPriodique.setBounds(33, 70, 127, 15);
		contentPane.add(lblNomDuPriodique);
		
		textFieldNomPerio = new JTextField();
		textFieldNomPerio.setBounds(170, 68, 173, 19);
		contentPane.add(textFieldNomPerio);
		textFieldNomPerio.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String issn = textFieldIssn.getText();
				String nomPerio = textFieldNomPerio.getText();
			
				getControleur().nouvPeriodique(issn, nomPerio);
				}
		});
		btnEnregistrer.setBounds(237, 99, 107, 25);
		contentPane.add(btnEnregistrer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			getControleur().fermerVue(VueNouveauPeriodique.this);}
		});
		btnAnnuler.setBounds(236, 136, 107, 25);
		contentPane.add(btnAnnuler);
	}
}
