package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextPane;

public class Sobre extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/Img/Sobre.png")));
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Sobre.class.getResource("/Img/MIT.png")));
		lblNewLabel_2.setToolTipText("Selo");
		lblNewLabel_2.setBounds(360, 11, 64, 64);
		getContentPane().add(lblNewLabel_2);
		
		JTextPane txtpnOiEuSou = new JTextPane();
		txtpnOiEuSou.setEditable(false);
		txtpnOiEuSou.setText("Oi Eu sou Bruno Henrique Silva, estou atualmente estudando Tecnico em Informatica, e estagiario em segurança da informação, cada vez mais estou aperfeiçoando meus conhecimentos Sobre TI, sempre quenrendo aprender coisas novas. ");
		txtpnOiEuSou.setBounds(10, 11, 173, 163);
		getContentPane().add(txtpnOiEuSou);
		
		JLabel lblNewLabel = new JLabel("Versão 22.0");
		lblNewLabel.setBounds(360, 78, 91, 14);
		getContentPane().add(lblNewLabel);
		setTitle("Sobre");
		setModal(true);
		setBounds(100, 100, 450, 300);

	}
}
