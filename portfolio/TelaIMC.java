package portfolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

public class TelaIMC extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtResultado;
	private JLabel lblStatus;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIMC frame = new TelaIMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaIMC() {
		setTitle("Calculadora IMC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIMC.class.getResource("/img/Calculadora.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblStatus = new JLabel("");
		lblStatus.setBounds(0, 0, 213, 425);
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc.png")));
		contentPane.add(lblStatus);

		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setBounds(259, 60, 49, 22);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);

		txtPeso = new JTextField();
		txtPeso.setBounds(259, 85, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setBounds(259, 150, 67, 22);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);

		txtAltura = new JTextField();
		txtAltura.setBounds(259, 172, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnLimpar = new JButton("");
		btnLimpar.setBounds(214, 320, 67, 74);
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setToolTipText("Limpar\r\n");
		btnLimpar.setBorder(null);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/Borracha.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		contentPane.add(btnLimpar);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(307, 320, 64, 64);
		btnCalcular.setToolTipText("Calcular\r\n");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setBackground(Color.BLACK);
		btnCalcular.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/Balan\u00E7a.png")));
		btnCalcular.setBorder(null);
		btnCalcular.setSelectedIcon(new ImageIcon(TelaIMC.class.getResource("/img/Balan\u00E7a.png")));
		contentPane.add(btnCalcular);

		JLabel lblNewLabel_2_1 = new JLabel("Seu IMC \u00E9:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(259, 231, 100, 22);
		contentPane.add(lblNewLabel_2_1);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(259, 253, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		// Uso da Biblioteca

		RestrictedTextField validar = new RestrictedTextField(txtPeso, "0123456789.");
		validar.setLimit(4);

		new RestrictedTextField(txtAltura, "0123456789.");
		validar.setLimit(4);

	}// fim do construtor

	// Uso da Biblioteca

	void calcular() {
		// valida��o

		if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha Peso");
			txtPeso.requestFocus();

		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha Altura");
			txtAltura.requestFocus();

		} else {

			// variavel
			double peso, altura, imc;

			// Formatador de casas decimais
			DecimalFormat formatador = new DecimalFormat("#0.00");

			// entrada
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());

			// Processamento
			imc = peso / (altura * altura);

			// resultado
			txtResultado.setText(String.valueOf(formatador.format(imc)));

			// status
			if (imc < 17) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc1.png")));

			} else if (imc < 18.5) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc2.png")));

			} else if (imc < 25) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc3.png")));

			} else if (imc < 30) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc4.png")));

			} else if (imc < 35) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc5.png")));

			} else if (imc < 40) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc6.png")));

			} else {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc7.png")));
			}
		}
	}

	void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtResultado.setText(null);
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc.png")));
		txtPeso.requestFocus();
	}
}
