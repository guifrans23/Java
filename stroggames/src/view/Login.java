package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtlogin;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/logo.png")));
		setResizable(false);
		setTitle("strongames - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(10, 49, 33, 14);
		contentPane.add(lblNewLabel);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(74, 46, 288, 20);
		contentPane.add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(10, 88, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(74, 85, 288, 20);
		contentPane.add(txtsenha);
		
		JButton btnacessar = new JButton("acessar");
		btnacessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnacessar.setBounds(275, 116, 89, 23);
		contentPane.add(btnacessar);
		
		JLabel lblstatus = new JLabel("");
		lblstatus.setIcon(new ImageIcon(Login.class.getResource("/img/dboff.png")));
		lblstatus.setBounds(10, 135, 48, 48);
		contentPane.add(lblstatus);
	}// fim do construtor
}
