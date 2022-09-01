package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Toolkit;

public class TelaJogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTesoura;
	private JRadioButton rdbtnPapel;
	private JLabel lblPc;
	private JRadioButton rdbtnPedra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
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
	public TelaJogo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaJogo.class.getResource("/img/Pedra Papel Tesoura.png")));
		setTitle("JoKenPo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 607, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setToolTipText("Pedra");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pedra.png")));
		lblNewLabel.setBounds(32, 55, 64, 64);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setToolTipText("Papel\r\n");
		lblNewLabel_1.setBackground(new Color(25, 25, 112));
		lblNewLabel_1.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/papel.png")));
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(32, 201, 64, 64);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Tesoura");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/tesoura.png")));
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setBounds(32, 351, 64, 64);
		contentPane.add(lblNewLabel_2);

		lblPc = new JLabel("");
		lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pc.png")));
		lblPc.setBounds(350, 165, 171, 139);
		contentPane.add(lblPc);

		rdbtnPedra = new JRadioButton("");
		rdbtnPedra.setToolTipText("Pedra");
		rdbtnPedra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonGroup.add(rdbtnPedra);
		rdbtnPedra.setBackground(Color.BLACK);
		rdbtnPedra.setBounds(102, 78, 21, 23);
		contentPane.add(rdbtnPedra);

		rdbtnPapel = new JRadioButton("");
		rdbtnPapel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnPapel.setToolTipText("Papel");
		buttonGroup.add(rdbtnPapel);
		rdbtnPapel.setBackground(Color.BLACK);
		rdbtnPapel.setBounds(102, 228, 21, 23);
		contentPane.add(rdbtnPapel);

		rdbtnTesoura = new JRadioButton("");
		rdbtnTesoura.setToolTipText("Tesoura");
		rdbtnTesoura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonGroup.add(rdbtnTesoura);
		rdbtnTesoura.setBackground(Color.BLACK);
		rdbtnTesoura.setBounds(102, 375, 21, 23);
		contentPane.add(rdbtnTesoura);

		JButton btnJogar = new JButton("");
		btnJogar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJogar.setBorder(null);
		btnJogar.setBackground(Color.BLACK);
		btnJogar.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/play.png")));
		btnJogar.setToolTipText("Jogar\r\n");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogar();
			}
		});
		btnJogar.setBounds(205, 201, 64, 64);
		contentPane.add(btnJogar);
	}// fim do construtor

	void jogar() {

		if (!rdbtnPedra.isSelected() && !rdbtnPapel.isSelected() && !rdbtnTesoura.isSelected()) {
			JOptionPane.showMessageDialog(null, "Selecione uma op��o");

		} else {
			Random random = new Random();
			int Pc = random.nextInt(3);
			// System.out.println(Pc); (achar erro)

			// associar o n�mero a imagem
			switch (Pc) {
			case 0:
				lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpedra.png")));
				break;
			case 1:
				lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpapel.png")));
				break;
			case 2:
				lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcTesoura.png")));
				break;

			// compara��es do resultado do jogo

			}

			if ((rdbtnPedra.isSelected() && Pc == 0) || (rdbtnPapel.isSelected() && Pc == 1)
					|| (rdbtnTesoura.isSelected() && Pc == 2)) {
				JOptionPane.showMessageDialog(null, "EMPATE");
				
			} else if ((rdbtnPedra.isSelected() && Pc == 2) || (rdbtnPapel.isSelected() && Pc == 0)
						|| (rdbtnTesoura.isSelected() && Pc == 1)) {
					JOptionPane.showMessageDialog(null, "JOGADOR VENCEU");
					
			} else { 
				JOptionPane.showMessageDialog(null, "JOGADOR PERDEU");

			}
//limpar os campos
			lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pc.png")));
			buttonGroup.clearSelection();
		}

	}

}// fim do codigo
