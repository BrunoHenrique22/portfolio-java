package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Voto extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voto dialog = new Voto();
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
	public Voto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Voto.class.getResource("/Img/Vote.png")));
		getContentPane().setBackground(Color.BLACK);
		setTitle("Eleitor");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Idade: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 31, 86, 47);
		getContentPane().add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setBounds(86, 40, 110, 29);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(Voto.class.getResource("/Img/Check.png")));
		btnNewButton.setToolTipText("Verificar");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voto();
			}
		});
		btnNewButton.setBounds(110, 165, 64, 64);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Voto.class.getResource("/Img/Borracha.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(239, 165, 64, 64);
		getContentPane().add(btnNewButton_1);

	}// Fim Do Construtor

	void voto() {

		if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Idade ");
			txtIdade.requestFocus();

		} else {

			// entrada
			int idade;

			// processamento
			idade = Integer.parseInt(txtIdade.getText());

			System.out.println("Idade: " + idade);
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Proibido Votar ", "Conclus�o", JOptionPane.DEFAULT_OPTION);

			} else if (idade > 17 && idade < 71) {
				JOptionPane.showMessageDialog(null, "Voto Obrigat�rio ", "Conclus�o", JOptionPane.DEFAULT_OPTION);

			} else {
				JOptionPane.showMessageDialog(null, "Voto Facultativo ", "Conclus�o", JOptionPane.DEFAULT_OPTION);

			}
		}
	}

	void limpar() {
		txtIdade.setText(null);

	}

}// Fim
