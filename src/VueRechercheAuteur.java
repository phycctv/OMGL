import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class VueRechercheAuteur extends Vue {

	private JPanel contentPane;
	private JComboBox comboBox = new JComboBox();

	public VueRechercheAuteur(Controleur controleur) {
		super(controleur);
		setTitle("Recherche par auteur");
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		this.addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
			getControleur().fermerVue(VueRechercheAuteur.this);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("hello world");
			}
		});
		
		comboBox.setBounds(195, 12, 218, 24);
		contentPane.add(comboBox);
		comboBox.setEditable(false);
		comboBox.addItem("");
		
		JLabel lblAuteurs = new JLabel("Auteurs :");
		lblAuteurs.setBounds(116, 17, 61, 15);
		contentPane.add(lblAuteurs);
		
		Set<String> keys = controleur.getAuteurs().keySet();
		Iterator<String> ite = keys.iterator();
		
		while (ite.hasNext()){
			String str = ite.next();
			Auteur auteur = controleur.getAuteurs().get(str);
			comboBox.addItem(auteur.getPrenomAuteur()+" "+auteur.getNomAuteur());
		}
	}
}
