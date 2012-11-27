import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




public class VueQuota extends Vue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VueQuota(Controleur controleur) {
		super(controleur);
		setTitle("Paramétrage des quotas");
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setBounds(100, 100, 452, 515);
		contentPane = new JPanel();
		this.addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
			getControleur().fermerVue(VueQuota.this);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
