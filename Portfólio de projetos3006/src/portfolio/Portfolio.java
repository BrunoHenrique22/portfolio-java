package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				//evento "ativar Janela"
				Date data = new Date();
		        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		        lblStatus.setText(formatador.format(data));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo fazem o link com o formulário IMC
				IMC imc = new IMC();
				imc.setVisible(true);
			}
		});
		btnNewButton.setBounds(135, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sobre");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento clicar no botão
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(400, 237, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Calculadora da m\u00E9dia");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(38, 37, 64, 64);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Temperatura");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversao = new ConversaoTemperatura();
				conversao.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(255, 59, 116, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Hello");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento clicar no botão
				Hello hello = new Hello();
				hello.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(24, 237, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Porcentagem");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPorcentagem porcentagem = new CalculoPorcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(400, 59, 116, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("App Servi\u00E7o");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppServico servico = new AppServico();
				servico.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(38, 140, 116, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Etanol x Gasolina");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(182, 140, 133, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Eleitor");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(346, 140, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 341, 584, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblStatus = new JLabel("New label");
		lblStatus.setForeground(SystemColor.text);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStatus.setBounds(238, 11, 336, 27);
		panel.add(lblStatus);
		
		JButton btnNewButton_4_1 = new JButton("Sorteio de Uma Carta");
		btnNewButton_4_1.setBounds(182, 237, 89, 23);
		contentPane.add(btnNewButton_4_1);
	}// fim do construtor
}
