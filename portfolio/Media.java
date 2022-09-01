package portfolio;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Media extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtDisciplina;
	private JTextField txtbi1;
	private JTextField txtbi2;
	private JTextField txtbi3;
	private JTextField txtbi4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Media dialog = new Media();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Media() {
		getContentPane().setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Media.class.getResource("/Img/media.png")));
		setModal(true);
		setTitle("C\u00E1lculo da Media");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Aluno:");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(10, 11, 46, 25);
			contentPanel.add(lblNewLabel);
		}
		{
			txtNome = new JTextField();
			txtNome.setBounds(46, 13, 169, 20);
			contentPanel.add(txtNome);
			txtNome.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Idade:");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(10, 48, 46, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtIdade = new JTextField();
			txtIdade.setBounds(46, 50, 57, 20);
			contentPanel.add(txtIdade);
			txtIdade.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Disciplina:");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(10, 92, 66, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txtDisciplina = new JTextField();
			txtDisciplina.setBounds(69, 89, 96, 20);
			contentPanel.add(txtDisciplina);
			txtDisciplina.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("bi1");
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setBounds(217, 120, 57, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txtbi1 = new JTextField();
			txtbi1.setText("");
			txtbi1.setBounds(256, 117, 39, 20);
			contentPanel.add(txtbi1);
			txtbi1.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("bi2");
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setBounds(217, 152, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			txtbi2 = new JTextField();
			txtbi2.setBounds(256, 149, 39, 20);
			contentPanel.add(txtbi2);
			txtbi2.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("bi3");
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setBounds(323, 120, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			txtbi3 = new JTextField();
			txtbi3.setBounds(362, 117, 39, 20);
			contentPanel.add(txtbi3);
			txtbi3.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("bi4");
			lblNewLabel_6.setForeground(Color.WHITE);
			lblNewLabel_6.setBounds(323, 152, 46, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			txtbi4 = new JTextField();
			txtbi4.setBounds(362, 149, 39, 20);
			contentPanel.add(txtbi4);
			txtbi4.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon(Media.class.getResource("/Img/Calculadora.png")));
			btnNewButton.setToolTipText("Média ");
			btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(Color.BLACK);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					media();
				}
			});
			btnNewButton.setBounds(46, 164, 64, 64);
			contentPanel.add(btnNewButton);

		}
		{
			JButton btnNewButton = new JButton("");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					limpar();
				}
			});
			btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNewButton.setIcon(new ImageIcon(Media.class.getResource("/Img/Borracha.png")));
			btnNewButton.setToolTipText("Limpar");
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(Color.BLACK);
			btnNewButton.setBounds(141, 164, 64, 64);
			contentPanel.add(btnNewButton);

			RestrictedTextField validar = new RestrictedTextField(txtNome, "qwertyuiopasdfghjklçzxcvbnm ");
			validar.setLimit(50);
			
			RestrictedTextField validar1 = new RestrictedTextField(txtIdade, "0123456789.");
			validar1.setLimit(4);
			
			RestrictedTextField validar2 = new RestrictedTextField(txtDisciplina, "qwertyuiopasdfghjklçzxcvbnm ");
			validar2.setLimit(50);
			
			RestrictedTextField validar3= new RestrictedTextField(txtbi1, "0123456789.");
			validar3.setLimit(4);
			
			RestrictedTextField validar4= new RestrictedTextField(txtbi2, "0123456789.");
			validar4.setLimit(4);
			
			RestrictedTextField validar5= new RestrictedTextField(txtbi3, "0123456789.");
			validar5.setLimit(4);
			
			RestrictedTextField validar6= new RestrictedTextField(txtbi4, "0123456789.");
			validar6.setLimit(4);
		}

	}//Fim Do Construtor

	void media() {

		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Aluno ");
			txtNome.requestFocus();

		} else if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Idade");
			txtIdade.requestFocus();

		} else if (txtDisciplina.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Disciplina");
			txtDisciplina.requestFocus();

		} else if (txtbi1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Bi1");
			txtbi1.requestFocus();

		} else if (txtbi2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Bi2");
			txtbi2.requestFocus();

		} else if (txtbi3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Bi3");
			txtbi3.requestFocus();

		} else if (txtbi4.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha O Campo Bi4");
			txtbi4.requestFocus();

		} else {

			// Vari�veis
			String nome;
			int idade;
			String Disciplina;
			double bi1, bi2, bi3, bi4, Media;
			
			DecimalFormat formatador = new DecimalFormat("#0.00");

			// Entrada
			// Armazenando o conte�do da caixa de texto na vari�vel
			nome = txtNome.getText();
			Disciplina = txtDisciplina.getText();
			// Integer.parseInt (converter o conte�do da caixa de texto para n�mero inteiro)
			idade = Integer.parseInt(txtIdade.getText());
			// Double.parseDouble (converter o conte�do da caixa de texto para n�meros
			// inteiros e n�o inteiro)
			bi1 = Double.parseDouble(txtbi1.getText());
			bi2 = Double.parseDouble(txtbi2.getText());
			bi3 = Double.parseDouble(txtbi3.getText());
			bi4 = Double.parseDouble(txtbi4.getText());

			// Processamento
			Media = (bi1 + bi2 + bi3 + bi4) / 4;

			// Sa�da

			if (Media < 5) {
				JOptionPane
						.showMessageDialog(
								null, "Nome: " + nome + "\nIdade: " + idade + "\nDisciplina: " + Disciplina
										+ "\nMedia: " + Media + "\nStatus: REPROVADO",
								"Boletim Escolar", JOptionPane.ERROR_MESSAGE);

			} else {
				JOptionPane
						.showMessageDialog(
								null, "Nome: " + nome + "\nIdade: " + idade + "\nDisciplina: " + Disciplina
										+ "\nMedia: " + (String.valueOf(formatador.format(Media))) + "\nStatus: APROVADO",
								"Boletim Escolar", JOptionPane.DEFAULT_OPTION);

			}
			// A linha abaixo exibe o nome armazenado na vari�vel em uma caixa de mensagem.
			// Para personalizar a caixa de mensagem devemos adicionar um texto para o
			// t�tulo e um �cone personalizado

		}

	}

	void limpar() {
		txtNome.setText(null);
		txtIdade.setText(null);
		txtDisciplina.setText(null);
		txtbi1.setText(null);
		txtbi2.setText(null);
		txtbi3.setText(null);
		txtbi4.setText(null);
	}
}
