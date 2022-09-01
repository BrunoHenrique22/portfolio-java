package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Appderenda extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtRMD;
	private JTextField txtCHM;
	private JTextField txtCO;
	private JTextField txtVHS;
	private JTextField txtEHS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appderenda dialog = new Appderenda();
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
	public Appderenda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Appderenda.class.getResource("/Img/Renda.png")));
		getContentPane().setBackground(Color.BLACK);
		setTitle("C\u00E1lculo De Renda");
		setModal(true);
		setBounds(100, 100, 367, 428);
		getContentPane().setLayout(null);

		JLabel txt1 = new JLabel("Remunera\u00E7\u00E3o Mensal Desejada: ");
		txt1.setForeground(Color.WHITE);
		txt1.setBounds(10, 11, 190, 27);
		getContentPane().add(txt1);

		txtRMD = new JTextField();
		txtRMD.setBounds(212, 14, 86, 20);
		getContentPane().add(txtRMD);
		txtRMD.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Custo Operacional:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 61, 142, 14);
		getContentPane().add(lblNewLabel_1);

		txtCHM = new JTextField();
		txtCHM.setBounds(212, 107, 86, 20);
		getContentPane().add(txtCHM);
		txtCHM.setColumns(10);

		JLabel txt = new JLabel("Carga Hor\u00E1ria  Mensal:");
		txt.setForeground(Color.WHITE);
		txt.setBounds(10, 110, 142, 14);
		getContentPane().add(txt);

		txtCO = new JTextField();
		txtCO.setBounds(212, 58, 86, 20);
		getContentPane().add(txtCO);
		txtCO.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Calcular");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon(Appderenda.class.getResource("/Img/Calculadora.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularHora();
			}
		});
		btnNewButton.setBounds(111, 135, 64, 64);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Valor Da Hora De Servi\u00E7o:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 203, 190, 14);
		getContentPane().add(lblNewLabel);

		txtVHS = new JTextField();
		txtVHS.setEditable(false);
		txtVHS.setBounds(212, 200, 86, 20);
		getContentPane().add(txtVHS);
		txtVHS.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Estimativa De Horas De Servi\u00E7o:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 290, 190, 14);
		getContentPane().add(lblNewLabel_2);

		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.setIcon(new ImageIcon(Appderenda.class.getResource("/Img/Calculadora.png")));
		btnNewButton_1.setSelectedIcon(new ImageIcon(Appderenda.class.getResource("/Img/Calculadora.png")));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularservico();
			}
		});
		btnNewButton_1.setBounds(161, 314, 64, 64);
		getContentPane().add(btnNewButton_1);

		txtEHS = new JTextField();
		txtEHS.setBounds(212, 280, 86, 20);
		getContentPane().add(txtEHS);
		txtEHS.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(10, 240, 331, 10);
		getContentPane().add(panel);

		RestrictedTextField validar = new RestrictedTextField(txtRMD, "0123456789.");
		validar.setLimit(20);

		RestrictedTextField validar1 = new RestrictedTextField(txtCO, "0123456789.");
		validar1.setLimit(20);

		RestrictedTextField validar2 = new RestrictedTextField(txtCHM, "0123456789.");
		validar2.setLimit(20);

		RestrictedTextField validar3 = new RestrictedTextField(txtEHS, "0123456789.");

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 limpar();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Appderenda.class.getResource("/Img/Borracha.png")));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Limpar");
		btnNewButton_2.setBounds(33, 314, 64, 64);
		getContentPane().add(btnNewButton_2);
		validar3.setLimit(20);

	}// Fim do construtor

	// V�riavies Globais
	double VHS;


	// Calculo da Hora

	void calcularHora() {

		if (txtRMD.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Remuneração Mensal Desejada ");
			txtRMD.requestFocus();

		} else if (txtCO.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Custo Operacional");
			txtCO.requestFocus();

		} else if (txtCHM.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Carga Horária Mensal");
			txtCHM.requestFocus();

		} else {

			// vari�veis
			double RMD, CO, CHM;
			
			DecimalFormat formatador = new DecimalFormat("#0.00");
			
			
			
			// Entrada
			RMD = Double.parseDouble(txtRMD.getText());
			CO = Double.parseDouble(txtCO.getText());
			CHM = Double.parseDouble(txtCHM.getText());

			// processamento
			VHS = (RMD + 0.3 * RMD + CO + 0.2 * RMD) / CHM;

			// Sa�da
			txtVHS.setText(String.valueOf(formatador.format(VHS)));

		}
	}

	// c�lculo do servi�o

	void calcularservico() {

		if (txtEHS.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Estimativa De Horas");
			txtEHS.requestFocus();

		} else {

			// vari�veis
			double EHS, valor;
			DecimalFormat formatador1 = new DecimalFormat("#0.00");
			
			// Entrada
			EHS = Double.parseDouble(txtEHS.getText());

			// processamento
			valor = EHS * VHS;

			// Sa�da
			JOptionPane.showMessageDialog(null, "Valor De Servi�o " + valor, "Relat�rio", JOptionPane.DEFAULT_OPTION);

			txtEHS.setText(String.valueOf(formatador1.format(EHS)));
		}
	}

	void limpar() {
	   txtRMD.setText(null);
	   txtCHM.setText(null);
	   txtCO.setText(null);
	   txtVHS.setText(null);
	   txtEHS.setText(null);

	}
}// Fim
