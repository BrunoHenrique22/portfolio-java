package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Toolkit;

public class Tabuada extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTabuada;
	private JTextArea txtArea;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada dialog = new Tabuada();
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
	public Tabuada() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tabuada.class.getResource("/img/Tabuada.png")));
		getContentPane().setBackground(Color.BLACK);
		setResizable(false);
		setTitle("Tabuada");
		setModal(true);
		setBounds(100, 100, 450, 434);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tabuada :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 33, 69, 14);
		getContentPane().add(lblNewLabel);

		txtTabuada = new JTextField();
		txtTabuada.setBounds(88, 30, 86, 20);
		getContentPane().add(txtTabuada);
		txtTabuada.setColumns(10);

		JButton button = new JButton("New button");
		button.setBounds(125, 127, -49, -35);
		getContentPane().add(button);

		btnCalcular = new JButton("");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setBorder(null);
		btnCalcular.setBackground(Color.BLACK);
		btnCalcular.setIcon(new ImageIcon(Tabuada.class.getResource("/img/Calculadora.png")));
		btnCalcular.setSelectedIcon(new ImageIcon(Tabuada.class.getResource("/img/Calculadora.png")));
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(71, 92, 64, 64);
		getContentPane().add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setBorder(null);
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setIcon(new ImageIcon(Tabuada.class.getResource("/img/Borracha.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(234, 92, 64, 64);
		getContentPane().add(btnLimpar);

		txtArea = new JTextArea();
		txtArea.setBackground(Color.BLACK);
		txtArea.setForeground(new Color(0, 0, 0));
		txtArea.setEnabled(false);
		txtArea.setBounds(71, 174, 280, 210);
		getContentPane().add(txtArea);

		// biblioteca
		RestrictedTextField validar = new RestrictedTextField(txtTabuada, "0123456789.");
		validar.setLimit(20);

	}// fim do Construtor

	void calcular() {

		if (txtTabuada.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Escolha O Valor Para Ser Calculado");
			txtTabuada.requestFocus();

		} else {

			// vari�vies + entrada
			int valor = Integer.parseInt(txtTabuada.getText());

			// processamento + sa�da
			for (int i = 1; i < 11; i++) {
				txtArea.append(" " + String.valueOf(valor) + " x " + String.valueOf(i) + " = "
						+ String.valueOf(valor * i) + "\n");

			}
			// desabilitar but�o
			btnCalcular.setEnabled(false);
		}
	}

	void limpar() {
		txtTabuada.setText(null);
		txtArea.setText(null);
		btnCalcular.setEnabled(true);

	}
}// fim de tudo
