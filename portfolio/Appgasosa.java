package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Appgasosa extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtGasolina;
	private JTextField txtEtanol;
	private JLabel lblStatus;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appgasosa dialog = new Appgasosa();
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
	public Appgasosa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Appgasosa.class.getResource("/Img/gas-pump.png")));
		getContentPane().setBackground(Color.BLACK);
		setTitle("Etanol X Gasolina");
		setModal(true);
		setBounds(100, 100, 414, 383);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Etanol:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 31, 93, 23);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gasolina:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 111, 75, 14);
		getContentPane().add(lblNewLabel_1);

		txtGasolina = new JTextField();
		txtGasolina.setBounds(95, 108, 86, 20);
		getContentPane().add(txtGasolina);
		txtGasolina.setColumns(10);

		txtEtanol = new JTextField();
		txtEtanol.setBounds(95, 32, 86, 20);
		getContentPane().add(txtEtanol);
		txtEtanol.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Appgasosa.class.getResource("/Img/Calculadora.png")));
		btnNewButton.setToolTipText("Calcular");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(217, 55, 64, 64);
		getContentPane().add(btnNewButton);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Appgasosa.class.getResource("/Img/neutro.png")));
		lblStatus.setBounds(38, 181, 320, 138);
		getContentPane().add(lblStatus);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Appgasosa.class.getResource("/Img/Borracha.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(312, 55, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		RestrictedTextField validar1 = new RestrictedTextField(txtGasolina, "0123456789.");
		validar1.setLimit(4);
		
		RestrictedTextField validar2 = new RestrictedTextField(txtEtanol, "0123456789.");
		validar2.setLimit(4);

	}// Fim Do Construtor

	// script do app

	void calcular() {

		// Valida��o
		if (txtEtanol.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Valor Do Etanol");
			txtEtanol.requestFocus();

		} else if (txtGasolina.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Valor Da Gasolina");
			txtGasolina.requestFocus();

		} else {

			// variavies
			double Etanol, Gasolina;

			// Entrada
			Etanol = Double.parseDouble(txtEtanol.getText());
			Gasolina = Double.parseDouble(txtGasolina.getText());

			// Processamento //Saida
			if (Etanol < 0.7 * Gasolina) {

				// Como Trocar a mensagem por uma imagem
				lblStatus.setIcon(new ImageIcon(Appgasosa.class.getResource("/img/Etanol.png")));

			} else {
				// JOptionPane.showMessageDialog(null, "Compesa Usar Gasolina", "Resultado",
				// JOptionPane.DEFAULT_OPTION);
				lblStatus.setIcon(new ImageIcon(Appgasosa.class.getResource("/img/Gasolina.png")));

			}
		}
	}

	void limpar() {
		txtEtanol.setText(null);
		txtGasolina.setText(null);
	}
}

// Fim
