package View;

import Control.LoginControl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

public class LoginView extends JFrame {
    private final JTextField tfUser;
	private final JPasswordField tfPassword;
	
	public LoginView(LoginControl loginControl) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{114, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 11;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("Que grato volvernos a ver");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel loginLbl = new JLabel("Inicia sesión en tu cuenta:");
		loginLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_singInLbl = new GridBagConstraints();
		gbc_singInLbl.insets = new Insets(0, 0, 5, 5);
		gbc_singInLbl.gridx = 2;
		gbc_singInLbl.gridy = 2;
		contentPane.add(loginLbl, gbc_singInLbl);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 4;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		tfUser = new JTextField();
		GridBagConstraints gbc_tfUser = new GridBagConstraints();
		gbc_tfUser.insets = new Insets(0, 0, 5, 5);
		gbc_tfUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfUser.gridx = 2;
		gbc_tfUser.gridy = 5;
		contentPane.add(tfUser, gbc_tfUser);
		tfUser.setColumns(10);
		
		JLabel labelPassword = new JLabel("Contraseña:");
		labelPassword.setHorizontalAlignment(SwingConstants.LEFT);
		labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.gridx = 2;
		gbc_lblPassword.gridy = 6;
		contentPane.add(labelPassword, gbc_lblPassword);
		
		tfPassword = new JPasswordField();
		tfPassword.setColumns(10);
		GridBagConstraints gbc_tfPassword = new GridBagConstraints();
		gbc_tfPassword.insets = new Insets(0, 0, 5, 5);
		gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassword.gridx = 2;
		gbc_tfPassword.gridy = 7;
		contentPane.add(tfPassword, gbc_tfPassword);
		
		JButton btnLogin = new JButton("Iniciar sesión");
		btnLogin.setActionCommand("login");
		btnLogin.addActionListener(loginControl);

		GridBagConstraints signIn = new GridBagConstraints();
		signIn.insets = new Insets(0, 0, 5, 5);
		signIn.gridx = 2;
		signIn.gridy = 9;
		contentPane.add(btnLogin, signIn);
		
		setVisible(true);
	}
	public String getUserName(){
		return tfUser.getText();
	}

	public String getPassword(){
		return new String(tfPassword.getPassword());
	}

	public void alertValidationError(){
		JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta","Error", JOptionPane.ERROR_MESSAGE);
	}
}
