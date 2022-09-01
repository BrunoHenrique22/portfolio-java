package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class CalculodePorcentagem extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtResultado;
	private JLabel lblNewLabel_2;
	private JTextField txtLucro;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtCusto;
	private JLabel lblNewLabel_5;
	private JTextField txtResult;
	private JLabel lblNewLabel_6;
	private JTextField txtSubtotal;
	private JLabel lblNewLabel_7;
	private JLabel r;
	private JTextField txtDesconto;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton_2;
	private JTextField txtResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculodePorcentagem dialog = new CalculodePorcentagem();
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
	public CalculodePorcentagem() {
		getContentPane().setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculodePorcentagem.class.getResource("/Img/_.png")));
		setTitle("C\u00E1lculo De Porcentagem");
		setModal(true);
		setBounds(100, 100, 513, 410);
		getContentPane().setLayout(null);

		txtN1 = new JTextField();
		txtN1.setBounds(10, 65, 50, 20);
		getContentPane().add(txtN1);
		txtN1.setColumns(10);

		JLabel lblNewLabel = new JLabel("% De");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(82, 68, 46, 14);
		getContentPane().add(lblNewLabel);

		txtN2 = new JTextField();
		txtN2.setBounds(126, 65, 50, 20);
		getContentPane().add(txtN2);
		txtN2.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(CalculodePorcentagem.class.getResource("/Img/=.png")));
		btnNewButton.setToolTipText("Igual");
		btnNewButton.setSelectedIcon(new ImageIcon(CalculodePorcentagem.class.getResource("/Img/=.png")));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Igual();
			}
		});
		btnNewButton.setBounds(214, 42, 64, 64);
		getContentPane().add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(302, 65, 86, 20);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Porcentagem: ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 40, 106, 14);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Lucro de Venda");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(11, 130, 117, 14);
		getContentPane().add(lblNewLabel_2);

		txtLucro = new JTextField();
		txtLucro.setBounds(145, 155, 57, 20);
		getContentPane().add(txtLucro);
		txtLucro.setColumns(10);

		lblNewLabel_3 = new JLabel("Custo");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 158, 46, 14);
		getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Lucro");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(106, 158, 46, 14);
		getContentPane().add(lblNewLabel_4);

		txtCusto = new JTextField();
		txtCusto.setBounds(46, 155, 50, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);

		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(214, 158, 46, 14);
		getContentPane().add(lblNewLabel_5);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(CalculodePorcentagem.class.getResource("/Img/=.png")));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setToolTipText("Igual");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Venda();
			}
		});
		btnNewButton_1.setBounds(247, 128, 64, 64);
		getContentPane().add(btnNewButton_1);
		{

		}

		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(336, 155, 86, 20);
		getContentPane().add(txtResult);
		txtResult.setColumns(10);

		lblNewLabel_6 = new JLabel("Desconto ");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 222, 86, 14);
		getContentPane().add(lblNewLabel_6);

		txtSubtotal = new JTextField();
		txtSubtotal.setBounds(82, 247, 57, 20);
		getContentPane().add(txtSubtotal);
		txtSubtotal.setColumns(10);

		lblNewLabel_7 = new JLabel("Subtotal");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(14, 250, 58, 14);
		getContentPane().add(lblNewLabel_7);

		r = new JLabel("Desconto");
		r.setForeground(Color.WHITE);
		r.setBounds(161, 250, 57, 14);
		getContentPane().add(r);

		txtDesconto = new JTextField();
		txtDesconto.setBounds(228, 247, 50, 20);
		getContentPane().add(txtDesconto);
		txtDesconto.setColumns(10);

		lblNewLabel_8 = new JLabel("%");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(297, 250, 30, 14);
		getContentPane().add(lblNewLabel_8);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setIcon(new ImageIcon(CalculodePorcentagem.class.getResource("/Img/=.png")));
		btnNewButton_2.setToolTipText("calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calcular();

			}
		});
		btnNewButton_2.setBounds(324, 224, 64, 64);
		getContentPane().add(btnNewButton_2);

		txtResul = new JTextField();
		txtResul.setEditable(false);
		txtResul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtResul.setBounds(401, 247, 86, 20);
		getContentPane().add(txtResul);
		txtResul.setColumns(10);

		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon(CalculodePorcentagem.class.getResource("/Img/Borracha.png")));
		btnNewButton_2_1.setToolTipText("Limpar");
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(145, 296, 64, 64);
		getContentPane().add(btnNewButton_2_1);

		RestrictedTextField validar = new RestrictedTextField(txtN1, "0123456789.");
		validar.setLimit(5);

		RestrictedTextField validar2 = new RestrictedTextField(txtN2, "0123456789.");
		validar2.setLimit(5);

		RestrictedTextField validar3 = new RestrictedTextField(txtCusto, "0123456789.");
		validar3.setLimit(5);

		RestrictedTextField validar4 = new RestrictedTextField(txtLucro, "0123456789.");
		validar4.setLimit(5);

		RestrictedTextField validar5 = new RestrictedTextField(txtSubtotal, "0123456789.");
		validar5.setLimit(5);

		RestrictedTextField validar6 = new RestrictedTextField(txtDesconto, "0123456789.");
		validar6.setLimit(5);
	}

// Fim do Construtor

	void Igual() {

		// validação
		if (txtN1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Primeiro Campo Porcentagem ");
			txtN1.requestFocus();

		} else if (txtN2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Segundo Campo Porcentagem");
			txtN2.requestFocus();
		}

		// vari�veis
		double N1, N2, Resultado;

		// entrada
		N1 = Double.parseDouble(txtN1.getText());
		N2 = Double.parseDouble(txtN2.getText());

		// processamentos
		Resultado = (N1 * N2) / 100;
		txtResultado.setText(String.valueOf(Resultado));
	}
	// sa�da

	void Venda() {

		// validação
		if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Primeiro Campo Lucro de Venda");
			txtCusto.requestFocus();

		} else if (txtLucro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Segundo Campo Lucro de Venda");
			txtLucro.requestFocus();
		}

		// vari�veis
		double Custo, Lucro, Result;

		// entrada
		Custo = Double.parseDouble(txtLucro.getText());
		Lucro = Double.parseDouble(txtCusto.getText());

		// processamentos
		Result = Lucro + (Lucro * Custo) / 100;
		txtResult.setText(String.valueOf(Result));
	}

	void Calcular() {

		// validação

		if (txtSubtotal.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Primeiro Campo Subtotal");
			txtSubtotal.requestFocus();

		} else if (txtDesconto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Segundo Campo Desconto");
			txtDesconto.requestFocus();
		}

		// vari�veis
		double Subtotal, Desconto, Calcular;

		// entrada
		Subtotal = Double.parseDouble(txtSubtotal.getText());
		Desconto = Double.parseDouble(txtDesconto.getText());

		// processamentos
		Calcular = Subtotal - (Desconto / 100 * Subtotal);
		txtResul.setText(String.valueOf(Calcular));

	}

	void limpar() {
		txtN1.setText(null);
		txtN2.setText(null);
		txtResultado.setText(null);
		txtCusto.setText(null);
		txtLucro.setText(null);
		txtResult.setText(null);
		txtResul.setText(null);
		txtDesconto.setText(null);
		txtSubtotal.setText(null);

	}
}
// Fim
