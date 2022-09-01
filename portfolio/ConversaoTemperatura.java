package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class ConversaoTemperatura extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtF;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoTemperatura dialog = new ConversaoTemperatura();
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
	public ConversaoTemperatura() {
		getContentPane().setBackground(Color.BLACK);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(ConversaoTemperatura.class.getResource("/Img/Temperatura.png")));
		setTitle("Convers\u00E3o de Temperatura");
		setModal(true);
		setBounds(100, 100, 320, 244);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 22, 119, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Celsius ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 84, 65, 14);
		getContentPane().add(lblNewLabel_1);

		txtF = new JTextField();
		txtF.setBounds(100, 18, 86, 20);
		getContentPane().add(txtF);
		txtF.setColumns(10);

		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(100, 80, 178, 20);
		getContentPane().add(txtC);
		txtC.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ConversaoTemperatura.class.getResource("/Img/Calculadora.png")));
		btnNewButton.setToolTipText("Calcular");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();

			}
		});
		btnNewButton.setBounds(43, 130, 64, 64);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(ConversaoTemperatura.class.getResource("/Img/Borracha.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(181, 130, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		RestrictedTextField validar1 = new RestrictedTextField(txtF, "0123456789.-");
		validar1.setLimit(4);

	}

	// Fim do Construtor

	void calcular() {

		if (txtF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Fahrenheit ");
			txtF.requestFocus();

		} else {

			// vari�veis
			double c, f;

			DecimalFormat formatador = new DecimalFormat("#0.0");

			// entrada
			f = Double.parseDouble(txtF.getText());

			// processamentos
			c = (5 * (f - 32)) / 9;

			// sa�da
			// a linha abaixo exibe o conte�do da vari�vel c na caixa de texto (� necess�rio
			// converter para string)
			txtC.setText(String.valueOf(formatador.format(c)));

		}
	}

	void limpar() {
		txtC.setText(null);
		txtF.setText(null);
	}
}
