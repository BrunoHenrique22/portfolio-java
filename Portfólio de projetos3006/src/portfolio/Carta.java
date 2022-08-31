package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Carta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblFace;
	private JLabel lblNipe;
	private JLabel lblNipeCentro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carta dialog = new Carta();
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
	public Carta() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Carta");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 469, 498);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.text);
		panel.setBounds(112, 27, 220, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblFace = new JLabel("");
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setFont(new Font("Arial", Font.BOLD, 22));
		lblFace.setBounds(11, 11, 28, 20);
		panel.add(lblFace);

		lblNipe = new JLabel("");
		lblNipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNipe.setFont(new Font("Arial", Font.BOLD, 32));
		lblNipe.setBounds(11, 42, 28, 20);
		panel.add(lblNipe);

		lblNipeCentro = new JLabel("");
		lblNipeCentro.setFont(new Font("Arial", Font.BOLD, 90));
		lblNipeCentro.setBounds(37, 36, 160, 250);
		panel.add(lblNipeCentro);

		JButton btnCarta = new JButton("Carta");
		btnCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortearCarta();
			}
		});
		btnCarta.setBounds(179, 393, 89, 23);
		getContentPane().add(btnCarta);

	}// fim do construtor

	void sortearCarta() {

		String[] nipes = { "♥", "♦", "♣", "♠"};
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","JJ"};

		Random carta = new Random();
		int indiceFace = carta.nextInt(faces.length);
		int indiceNipe = carta.nextInt(nipes.length);
		lblFace.setText(faces[indiceFace]);
		lblNipe.setText(nipes[indiceNipe]);
		lblNipeCentro.setText(nipes[indiceNipe] + faces[indiceFace]);

		// trocar a cor
		if (indiceNipe == 0 || indiceNipe == 1) {
			lblFace.setForeground(Color.RED);
			lblNipe.setForeground(Color.RED);
			lblNipeCentro.setForeground(Color.RED);

		} else {

			lblFace.setForeground(Color.BLACK);
			lblNipe.setForeground(Color.BLACK);
			lblNipeCentro.setForeground(Color.BLACK);

		}

		// exibir imagens Valete, Dama, Rei
		if (indiceFace == 10) {
			lblNipeCentro.setIcon(new ImageIcon(Combustivel.class.getResource("/img/Valete.png")));

		} else if (indiceFace == 11) {
			lblNipeCentro.setIcon(new ImageIcon(Combustivel.class.getResource("/img/Dama.png")));

		} else if (indiceFace == 12) {
			lblNipeCentro.setIcon(new ImageIcon(Combustivel.class.getResource("/img/Rei.png")));
			
		} else if (indiceFace == 13) {
			lblNipeCentro.setIcon(new ImageIcon(Combustivel.class.getResource("/img/Joker.png")));
			
		} else {
			lblNipeCentro.setIcon(null);
			lblNipeCentro.setText("  " + nipes[indiceNipe]);

		}
	}
}

// fim do codigo
