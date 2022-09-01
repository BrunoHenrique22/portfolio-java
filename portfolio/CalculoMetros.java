package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoMetros extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResultado;
	private JTextField txtM2;
	private JTextField txtResultado3;
	private JTextField txtM;
	private JTextField txtResultado2;
	private JTextField txtCm;
	private JTextField txtResultado4;
	private JTextField txtKm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoMetros frame = new CalculoMetros();
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
	public CalculoMetros() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoMetros.class.getResource("/Img/Km.png")));
		setBackground(Color.BLACK);
		setTitle("Calculadora De Metros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 563, 534);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(" Quilômetros para Metros");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 54, 253, 17);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Km");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 86, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Para");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(130, 82, 46, 22);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("m");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(186, 82, 37, 19);
		contentPane.add(lblNewLabel_1_1_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon(CalculoMetros.class.getResource("/Img/=.png")));
		btnNewButton.setToolTipText("Calcular");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(237, 65, 64, 64);
		contentPane.add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(311, 87, 86, 21);
		contentPane.add(txtResultado);

		JLabel lblMetrosParaCe = new JLabel("Metros Para Centímetros");
		lblMetrosParaCe.setForeground(Color.WHITE);
		lblMetrosParaCe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMetrosParaCe.setBounds(10, 238, 265, 17);
		contentPane.add(lblMetrosParaCe);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("m");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 276, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_1);

		txtM2 = new JTextField();
		txtM2.setColumns(10);
		txtM2.setBounds(52, 275, 68, 20);
		contentPane.add(txtM2);

		JLabel lblNewLabel_1_1_2 = new JLabel("Para");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(130, 273, 46, 22);
		contentPane.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Cm");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(186, 277, 37, 18);
		contentPane.add(lblNewLabel_1_1_1_1_1);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular3();
			}

		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(CalculoMetros.class.getResource("/Img/=.png")));
		btnNewButton_1.setToolTipText("Calcular");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(252, 253, 64, 64);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("m");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(407, 84, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_2);

		txtResultado3 = new JTextField();
		txtResultado3.setEditable(false);
		txtResultado3.setColumns(10);
		txtResultado3.setBounds(337, 275, 86, 21);
		contentPane.add(txtResultado3);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Cm");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(442, 272, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);

		JLabel lblMetrosParaQuilmetros = new JLabel("Metros para Quilômetros");
		lblMetrosParaQuilmetros.setForeground(Color.WHITE);
		lblMetrosParaQuilmetros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMetrosParaQuilmetros.setBounds(10, 140, 253, 17);
		contentPane.add(lblMetrosParaQuilmetros);

		JLabel lblNewLabel_1_1_1_3 = new JLabel("m");
		lblNewLabel_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_3.setBounds(10, 176, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_3);

		txtM = new JTextField();
		txtM.setColumns(10);
		txtM.setBounds(38, 179, 68, 20);
		contentPane.add(txtM);

		JLabel lblNewLabel_1_1_3 = new JLabel("Para");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(116, 173, 46, 25);
		contentPane.add(lblNewLabel_1_1_3);

		JLabel lblNewLabel_1_2 = new JLabel("Km");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(177, 178, 46, 14);
		contentPane.add(lblNewLabel_1_2);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular2();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(CalculoMetros.class.getResource("/Img/=.png")));
		btnNewButton_1_1.setToolTipText("Calcular");
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(233, 163, 64, 64);
		contentPane.add(btnNewButton_1_1);

		txtResultado2 = new JTextField();
		txtResultado2.setEditable(false);
		txtResultado2.setColumns(10);
		txtResultado2.setBounds(337, 179, 86, 21);
		contentPane.add(txtResultado2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Km");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(445, 178, 46, 14);
		contentPane.add(lblNewLabel_1_2_1);

		JLabel lblCentmetrosParaMetros = new JLabel("Centímetros Para Metros");
		lblCentmetrosParaMetros.setForeground(Color.WHITE);
		lblCentmetrosParaMetros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCentmetrosParaMetros.setBounds(10, 338, 265, 17);
		contentPane.add(lblCentmetrosParaMetros);

		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Cm");
		lblNewLabel_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_2.setBounds(10, 378, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Para");
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(148, 376, 46, 22);
		contentPane.add(lblNewLabel_1_1_2_1);

		txtCm = new JTextField();
		txtCm.setColumns(10);
		txtCm.setBounds(57, 381, 68, 20);
		contentPane.add(txtCm);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("m");
		lblNewLabel_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2.setBounds(204, 378, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_1_2);

		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular4();
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon(CalculoMetros.class.getResource("/Img/=.png")));
		btnNewButton_1_2.setToolTipText("Calcular");
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(251, 358, 64, 64);
		contentPane.add(btnNewButton_1_2);

		txtResultado4 = new JTextField();
		txtResultado4.setEditable(false);
		txtResultado4.setColumns(10);
		txtResultado4.setBounds(358, 381, 86, 21);
		contentPane.add(txtResultado4);

		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("m");
		lblNewLabel_1_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2_1.setBounds(454, 378, 37, 19);
		contentPane.add(lblNewLabel_1_1_1_1_2_1);

		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1_2_1.setIcon(new ImageIcon(CalculoMetros.class.getResource("/Img/Borracha.png")));
		btnNewButton_1_2_1.setToolTipText("Limpar");
		btnNewButton_1_2_1.setBorder(null);
		btnNewButton_1_2_1.setBackground(Color.BLACK);
		btnNewButton_1_2_1.setBounds(462, 420, 64, 64);
		contentPane.add(btnNewButton_1_2_1);

		txtKm = new JTextField();
		txtKm.setColumns(10);
		txtKm.setBounds(52, 87, 68, 20);
		contentPane.add(txtKm);

		RestrictedTextField validar = new RestrictedTextField(txtKm, "0123456789.");
		validar.setLimit(10);

		RestrictedTextField validar2 = new RestrictedTextField(txtM, "0123456789.");
		validar2.setLimit(10);

		RestrictedTextField validar3 = new RestrictedTextField(txtM2, "0123456789.");
		validar3.setLimit(10);

		RestrictedTextField validar4 = new RestrictedTextField(txtCm, "0123456789.");
		validar4.setLimit(10);

	}// Fim Do construtor

	public void calcular() {

		// validação
		if (txtKm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Km ");
			txtKm.requestFocus();

		} else {

			// variaveis
			double Km, Resultado;

			// entrada
			Km = Double.parseDouble(txtKm.getText());

			// Processamento
			Resultado = Km * 1000;
			txtResultado.setText(String.valueOf(Resultado));

		}
	}

	public void calcular2() {

		// validação
		if (txtM.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo M ");
			txtKm.requestFocus();

		} else {

		}
		// variaveis
		double m, Resultado2;

		// entrada
		m = Double.parseDouble(txtM.getText());

		// Processamento
		Resultado2 = m / 1000;
		txtResultado2.setText(String.valueOf(Resultado2));

	}

	public void calcular3() {

		// validação
		if (txtM2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo M ");
			txtM2.requestFocus();

		} else {

			// variaveis
			double m2, Resultado3;

			// entrada
			m2 = Double.parseDouble(txtM2.getText());

			// Processamento
			Resultado3 = m2 * 100;
			txtResultado3.setText(String.valueOf(Resultado3));

		}
	}

	public void calcular4() {

		// validação
		if (txtCm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Cm ");
			txtCm.requestFocus();

		} else {

			// variaveis
			double cm, Resultado4;

			// entrada
			cm = Double.parseDouble(txtCm.getText());

			// Processamento
			Resultado4 = cm / 100;
			txtResultado4.setText(String.valueOf(Resultado4));

		}
	}

	void limpar() {
		txtResultado.setText(null);
		txtM2.setText(null);
		txtResultado3.setText(null);
		txtM.setText(null);
		txtResultado2.setText(null);
		txtCm.setText(null);
		txtResultado4.setText(null);
		txtKm.setText(null);
	}

}
// Fim
