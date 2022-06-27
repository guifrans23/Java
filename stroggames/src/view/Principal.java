package view;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JLabel lbldata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		addWindowListener(new WindowAdapter() {
			// evento do ativar o java
			@Override
			public void windowActivated(WindowEvent e) {
				  Date data = new Date();
				  DateFormat formatador = DateFormat.getDateInstance  (DateFormat.FULL);
				  lbldata.setText(formatador.format(data));
			}
		});
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/logo.png")));
		setTitle("stronggames");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 423);
		contentPane = new JPanel();
		contentPane.setToolTipText("Relatorio");
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/img/user.png")));
		btnNewButton_3.setToolTipText("Usuarios");
		btnNewButton_3.setBounds(10, 11, 128, 128);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setIcon(new ImageIcon(Principal.class.getResource("/img/pagamento.png")));
		btnNewButton_4.setToolTipText("Pagamento");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(10, 167, 128, 128);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setIcon(new ImageIcon(Principal.class.getResource("/img/Relatorio.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setToolTipText("Relatorio");
		btnNewButton_5.setBounds(164, 167, 128, 128);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setIcon(new ImageIcon(Principal.class.getResource("/img/produtos.png")));
		btnNewButton_6.setToolTipText("Produtos");
		btnNewButton_6.setBounds(326, 11, 128, 128);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setIcon(new ImageIcon(Principal.class.getResource("/img/fornecedores.png")));
		btnNewButton_7.setToolTipText("Fornecedores");
		btnNewButton_7.setBounds(164, 11, 128, 128);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/img/clientes.png")));
		btnNewButton.setToolTipText("Clientes");
		btnNewButton.setBounds(477, 11, 128, 128);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/img/configuracoes.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setToolTipText("ferramentas");
		btnNewButton_1.setBounds(326, 167, 128, 128);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/img/sobre (2).png")));
		btnNewButton_2.setToolTipText("sobre");
		btnNewButton_2.setBounds(477, 167, 128, 128);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 325, 621, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setBounds(10, 0, 64, 64);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/img/lojalogo.png")));
		lblNewLabel.setToolTipText("img");
		
		lbldata = new JLabel("New label");
		lbldata.setBounds(182, 22, 46, 14);
		panel.add(lbldata);
	}
}
