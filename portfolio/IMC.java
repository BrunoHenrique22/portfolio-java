package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class IMC extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtPeso;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC dialog = new IMC();
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
	public IMC() {
		setForeground(Color.WHITE);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setIconImage(Toolkit.getDefaultToolkit().getImage(IMC.class.getResource("/Img/Cadastro.png")));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(Color.BLACK);
		setModal(true);
		setTitle("Cadastro");
		setResizable(false);
		setBounds(100, 100, 457, 407);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(46, 42, 46, 14);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(97, 39, 272, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(IMC.class.getResource("/Img/Save.png")));
		btnNewButton.setToolTipText("Salvar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(119, 266, 64, 64);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(46, 106, 46, 14);
		getContentPane().add(lblNewLabel_1);

		txtIdade = new JTextField();
		txtIdade.setBounds(97, 103, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.WHITE);
		lblPeso.setBounds(46, 168, 46, 14);
		getContentPane().add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(97, 165, 86, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(283, 165, 86, 20);
		getContentPane().add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(224, 168, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(IMC.class.getResource("/Img/Borracha.png")));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(242, 266, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		
		RestrictedTextField validar = new RestrictedTextField(txtIdade, "0123456789.");
		validar.setLimit(3);
		
		RestrictedTextField validar1= new RestrictedTextField(txtPeso, "0123456789.");
		validar1.setLimit(4);
		
		RestrictedTextField validar2 = new RestrictedTextField(txtAltura, "0123456789.");
		validar2.setLimit(4);
		
		RestrictedTextField validar3 = new RestrictedTextField(txtNome, "qwertyuiopasdfghjklçzxcvbnm ");
		validar3.setLimit(50);
		

	}// fim do construtor

	// M�todo respons�vel pelo c�lculo do IMC
	void calcular() {

		// Valida��o
		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Nome");
			txtNome.requestFocus();

		} else if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Idade");
		txtIdade.requestFocus();
		
		} else if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Peso");
			txtPeso.requestFocus();
			
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Campo Altura");
			txtAltura.requestFocus();
			
		} else {
			
			//Variaveis
			String nome;
			int idade;
			double peso, altura, imc;

			DecimalFormat formatador = new DecimalFormat("#0.00");

			
			// Entrada
			// Armazenando o conte�do da caixa de texto na vari�vel
			nome = txtNome.getText();
			// Integer.parseInt (converter o conte�do da caixa de texto para n�mero inteiro)
			idade = Integer.parseInt(txtIdade.getText());
			// Double.parseDouble (converter o conte�do da caixa de texto para n�meros
			// inteiros e n�o inteiro)
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());

			// Processamento
			imc = peso / (altura * altura);

			// Sa�da
			// A linha abaixo exibe o nome armazenado na vari�vel em uma caixa de mensagem.
			// Para personalizar a caixa de mensagem devemos adicionar um texto para o
			// t�tulo e um �cone personalizado
			JOptionPane.showMessageDialog(null,
					"Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + (String.valueOf(formatador.format(imc))),
					"Ficha do aluno", JOptionPane.DEFAULT_OPTION);

		}

		// Vari�veis

	}
	void limpar() {
		txtNome.setText(null);
		txtIdade.setText(null);
		txtPeso.setText(null);
		txtAltura.setText(null);
	
		
	}
}
