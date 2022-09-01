package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
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
	public Portfolio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/Img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 542);
		contentPane = new JPanel();
		contentPane.setToolTipText("Jokenpo");
		contentPane.setBorder(null);
		contentPane.setBackground(Color.BLACK);
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Cadastro.png")));
		btnNewButton.setToolTipText("Cadastro");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formul�rio IMC
				IMC imc = new IMC();
				imc.setVisible(true);
			}
		});
		btnNewButton.setBounds(20, 11, 64, 64);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Sobre.png")));
		btnNewButton_1.setToolTipText("Sobre");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no bot�o
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(516, 446, 48, 57);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setToolTipText("M\u00E9dia");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);

			}
		});
		btnNewButton_2.setBounds(146, 11, 70, 73);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Temperatura.png")));
		btnNewButton_3.setToolTipText("Temperatura");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversaotemperatura = new ConversaoTemperatura();
				conversaotemperatura.setVisible(true);

			}
		});
		btnNewButton_3.setBounds(10, 100, 90, 80);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculodePorcentagem calculodePorcentagem = new CalculodePorcentagem();
				calculodePorcentagem.setVisible(true);
			}
		});
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/%.png")));
		btnNewButton_4.setToolTipText("Cálculo De Porcentagem");
		btnNewButton_4.setBounds(260, 11, 70, 73);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setToolTipText("C\u00E1lculo Do Combust\u00EDvel");
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/gas-pump.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Appgasosa appgasosa = new Appgasosa();
				appgasosa.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(377, 11, 64, 64);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setToolTipText("Eleitor");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voto voto = new Voto();
				voto.setVisible(true);
			}
		});
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Vote.png")));
		btnNewButton_6.setBounds(146, 100, 70, 80);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaJogo telaJogo2 = new TelaJogo();
				telaJogo2.setVisible(true);
			}
		});
		btnNewButton_7.setToolTipText("Jokenpo");
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Jokenpo1.png")));
		btnNewButton_7.setBounds(260, 113, 64, 64);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cep cep2 = new Cep();
				cep2.setVisible(true);
			}
		});
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/CEP.png")));
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setSelectedIcon(new ImageIcon(Portfolio.class.getResource("/Img/CEP.png")));
		btnNewButton_8.setToolTipText("CEP");
		btnNewButton_8.setBackground(Color.BLACK);
		btnNewButton_8.setBounds(377, 113, 64, 64);
		contentPane.add(btnNewButton_8);

		JButton btnNewButton_8_1 = new JButton("");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnNewButton_8_1.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Multiplication.png")));
		btnNewButton_8_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8_1.setToolTipText("Tabuada");
		btnNewButton_8_1.setBorder(null);
		btnNewButton_8_1.setBackground(Color.BLACK);
		btnNewButton_8_1.setBounds(494, 113, 64, 64);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				dado.setVisible(true);
			}
		});
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Dice.png")));
		btnNewButton_9.setToolTipText("Dado");
		btnNewButton_9.setBackground(Color.BLACK);
		btnNewButton_9.setBounds(141, 223, 97, 64);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Appderenda appderenda = new Appderenda();
				appderenda.setVisible(true);
			}
		});
		btnNewButton_4_2.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Renda.png")));
		btnNewButton_4_2.setToolTipText("Cálculo De Renda");
		btnNewButton_4_2.setBorder(null);
		btnNewButton_4_2.setBackground(Color.BLACK);
		btnNewButton_4_2.setBounds(488, 11, 70, 73);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_2_1 = new JButton("");
		btnNewButton_4_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoMetros calculometros = new CalculoMetros(); 
				calculometros.setVisible(true);
			}
		});
		btnNewButton_4_2_1.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Km.png")));
		btnNewButton_4_2_1.setToolTipText("Cálculo De Quilômetros");
		btnNewButton_4_2_1.setBorder(null);
		btnNewButton_4_2_1.setBackground(Color.BLACK);
		btnNewButton_4_2_1.setBounds(30, 214, 70, 73);
		contentPane.add(btnNewButton_4_2_1);
		
		lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setBounds(80, 455, 371, 37);
		contentPane.add(lblStatus);
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblStatus.setText(formatador.format(data));
		
		JButton btnNewButton_8_1_1 = new JButton("");
		btnNewButton_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cartas cartas = new Cartas();
				cartas.setVisible(true);
				
			}
		});
		btnNewButton_8_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8_1_1.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Deck.png")));
		btnNewButton_8_1_1.setToolTipText("Jogo De Cartas");
		btnNewButton_8_1_1.setBorder(null);
		btnNewButton_8_1_1.setBackground(Color.BLACK);
		btnNewButton_8_1_1.setBounds(494, 203, 64, 117);
		contentPane.add(btnNewButton_8_1_1);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculadoraSimples CalculadoraSimples = new CalculadoraSimples();
				CalculadoraSimples.setVisible(true);
			}
			
		});
		btnNewButton_2_1.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Calculadora.png")));
		btnNewButton_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1.setToolTipText("Calculadora Simples");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(260, 214, 70, 73);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_8_2 = new JButton("");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIMC TelaIMC = new TelaIMC();
				TelaIMC.setVisible(true);
				
				
			}
		});
		btnNewButton_8_2.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Balança.png")));
		btnNewButton_8_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8_2.setToolTipText("Balança");
		btnNewButton_8_2.setBorder(null);
		btnNewButton_8_2.setBackground(Color.BLACK);
		btnNewButton_8_2.setBounds(377, 223, 64, 64);
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_4_2_1_1 = new JButton("");
		btnNewButton_4_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			hello();
			}
		});
		btnNewButton_4_2_1_1.setIcon(new ImageIcon(Portfolio.class.getResource("/Img/Hello.png")));
		btnNewButton_4_2_1_1.setToolTipText("Hello World");
		btnNewButton_4_2_1_1.setBorder(null);
		btnNewButton_4_2_1_1.setBackground(Color.BLACK);
		btnNewButton_4_2_1_1.setBounds(30, 311, 70, 73);
		contentPane.add(btnNewButton_4_2_1_1);
	}// fim do construtor
	
	void hello() {
		
		JOptionPane.showMessageDialog(null, "Hello World, Eu Sou O Bruno Henrique Silva :)");
	}
}//fim

