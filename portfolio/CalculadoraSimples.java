package portfolio;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import Atxy2k.CustomTextField.RestrictedTextField;

class CalculadoraSimples extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String MAIS = "+";
	private final static String MENOS = "-";
	private final static String MULT = "*";
	private final static String DIV = "/";

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JComboBox<String> operCBB;
	private JButton btnCalcular;

	private DecimalFormat df = new DecimalFormat("0.00");
	private JTextField txtResult;
	private JLabel lblNewLabel;
	private JLabel lblSegundon;
	private JLabel lblResultado;

	public CalculadoraSimples() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(CalculadoraSimples.class.getResource("/Img/Calculadora.png")));
		setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));

		JPanel conteudoPNL = new JPanel();
		conteudoPNL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		conteudoPNL.setAlignmentY(Component.TOP_ALIGNMENT);
		conteudoPNL.setAlignmentX(Component.LEFT_ALIGNMENT);
		conteudoPNL.setBackground(Color.BLACK);
		conteudoPNL.setBorder(null);
//conteudoPNL.setSize(200,800);
		super.setTitle("Calculadora");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setContentPane(conteudoPNL);

		btnCalcular = new JButton("");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setBorder(null);
		btnCalcular.setBackground(Color.BLACK);
		btnCalcular.setIcon(new ImageIcon(CalculadoraSimples.class.getResource("/Img/Calculadora.png")));
		btnCalcular.setToolTipText("Calcular");
		txtNum2 = new JTextField(5);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar();
			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setBorder(null);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setIcon(new ImageIcon(CalculadoraSimples.class.getResource("/Img/Borracha.png")));
		btnLimpar.setToolTipText("Limpar");

		txtResult = new JTextField(5);
		txtResult.setEditable(false);
		txtNum1 = new JTextField(5);

		operCBB = new JComboBox<String>();
		operCBB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		operCBB.addItem(MAIS);
		operCBB.addItem(MENOS);
		operCBB.addItem(MULT);
		operCBB.addItem(DIV);

		lblNewLabel = new JLabel("Primeiro Nº");
		lblNewLabel.setForeground(Color.WHITE);

		lblSegundon = new JLabel("Segundo Nº");
		lblSegundon.setForeground(Color.WHITE);

		lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(Color.WHITE);
		GroupLayout gl_conteudoPNL = new GroupLayout(conteudoPNL);
		gl_conteudoPNL.setHorizontalGroup(gl_conteudoPNL.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_conteudoPNL.createSequentialGroup().addGap(10)
						.addGroup(gl_conteudoPNL.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNum1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGap(10)
						.addComponent(operCBB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addGroup(gl_conteudoPNL.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblSegundon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(txtNum2, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
						.addGap(48)
						.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_conteudoPNL.createSequentialGroup().addGap(93).addComponent(lblResultado,
						GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_conteudoPNL.createSequentialGroup().addGap(61)
						.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addGap(131)
						.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)));
		gl_conteudoPNL.setVerticalGroup(gl_conteudoPNL.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_conteudoPNL.createSequentialGroup().addGap(52)
						.addGroup(gl_conteudoPNL.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_conteudoPNL.createSequentialGroup().addComponent(lblNewLabel).addGap(11)
										.addComponent(txtNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_conteudoPNL.createSequentialGroup().addGap(25).addComponent(operCBB,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_conteudoPNL.createSequentialGroup().addComponent(lblSegundon).addGap(11)
										.addComponent(txtNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGap(34).addComponent(lblResultado).addGap(8)
						.addGroup(gl_conteudoPNL.createParallelGroup(Alignment.LEADING)
								.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))));
		conteudoPNL.setLayout(gl_conteudoPNL);

		btnCalcular.addActionListener(this);
		super.pack();
		super.setLocationRelativeTo(this);
		getContentPane().setLayout(null);
		
		RestrictedTextField validar = new RestrictedTextField(txtNum1, "0123456789.");
		validar.setLimit(10);
		
		RestrictedTextField validar2 = new RestrictedTextField(txtNum2, "0123456789.");
		validar2.setLimit(10);

	}// Fim do Construtor

	public void actionPerformed(ActionEvent e) {
		boolean num1Ok = true;
		boolean num2Ok = true;

		double num1 = 0;
		try {
			num1 = df.parse(txtNum1.getText()).doubleValue();
		} catch (ParseException ex) {
			num1Ok = false;
		}

		double num2 = 0;
		try {
			num2 = df.parse(txtNum2.getText()).doubleValue();
		} catch (ParseException ex) {
			num2Ok = false;
		}

		if (num1Ok && num2Ok) {
			boolean divZero = false;
			double result = 0;

			Object selItem = operCBB.getSelectedItem();
			if (selItem.equals(MAIS)) {
				result = num1 + num2;
			} else if (selItem.equals(MENOS)) {
				result = num1 - num2;
			} else if (selItem.equals(MULT)) {
				result = num1 * num2;
			} else if (selItem.equals(DIV)) {
				if (num2 == 0) {
					divZero = true;
				} else {
					result = num1 / num2;
				}
			}

			if (divZero) {
				String msg = "Operação inválida - divisão por zero!";
				JOptionPane.showMessageDialog(null, msg, "Calculadora", JOptionPane.WARNING_MESSAGE);
			} else {
				txtResult.setText(String.valueOf(result));
			}
		} else {
			if (num1Ok == false) {
				String msg = "Digite O Primeiro Valor Válido";
				JOptionPane.showMessageDialog(this, msg, "Calculadora", JOptionPane.WARNING_MESSAGE);
			} else if (num2Ok == false) {
				String msg = "Digite O Segundo Valor Válido";
				JOptionPane.showMessageDialog(this, msg, "Calculadora", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static void main(String[] args) {
		CalculadoraSimples calc = new CalculadoraSimples();
		calc.setVisible(true);
	}

	void Limpar() {
		txtResult.setText(null);
		txtNum1.setText(null);
		txtNum2.setText(null);

	}
}
// Fim
