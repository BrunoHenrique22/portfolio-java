package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Dado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dado frame = new Dado();
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
	public Dado() {
		setTitle("Dado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dado.class.getResource("/Img/Dice.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblDado = new JLabel("");
		lblDado.setIcon(new ImageIcon(Dado.class.getResource("/Img/face1.png")));
		lblDado.setBounds(156, 25, 128, 125);
		contentPane.add(lblDado);

		JButton btnJogar = new JButton("");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogar();
			}
		});
		btnJogar.setBorder(null);
		btnJogar.setBackground(Color.BLACK);
		btnJogar.setToolTipText("Jogar");
		btnJogar.setIcon(new ImageIcon(Dado.class.getResource("/Img/play.png")));
		btnJogar.setBounds(176, 170, 64, 64);
		contentPane.add(btnJogar);
	}// fim Do construtor

	void Jogar() {

		Random random = new Random();
		int face = random.nextInt(6) + 1;
		switch (face) {
		case 1:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face1.png")));
			break;
		case 2:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face2.png")));
			break;
		case 3:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face3.png")));
			break;
		case 4:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face4.png")));
			break;
		case 5:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face5.png")));
			break;
		case 6:
			lblDado.setIcon(new ImageIcon(Dado.class.getResource("/img/face6.png")));
			break;
		}
	}
}