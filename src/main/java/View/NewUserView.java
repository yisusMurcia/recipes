package View;

import Control.ViewControl;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class NewUserView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUser;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	public NewUserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{114, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 15;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("Crea tu cuenta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblIniciaSesinEn = new JLabel("Unete y acompaña esta divertida búsqueda para descubrir tu próxima receta favorita");
		lblIniciaSesinEn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 2;
		gbc_lblLogin.gridy = 2;
		contentPane.add(lblIniciaSesinEn, gbc_lblLogin);
		
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
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setHorizontalAlignment(SwingConstants.LEFT);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 6;
		contentPane.add(lblContrasea, gbc_lblContrasea);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 7;
		contentPane.add(passwordField, gbc_passwordField);
		
		JLabel lblRol = new JLabel("Rol:");
		lblRol.setHorizontalAlignment(SwingConstants.LEFT);
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblRol = new GridBagConstraints();
		gbc_lblRol.anchor = GridBagConstraints.WEST;
		gbc_lblRol.insets = new Insets(0, 0, 5, 5);
		gbc_lblRol.gridx = 2;
		gbc_lblRol.gridy = 8;
		contentPane.add(lblRol, gbc_lblRol);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 9;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblContraseaDeAdministrador = new JLabel("Contraseña de administrador:");
		lblContraseaDeAdministrador.setHorizontalAlignment(SwingConstants.LEFT);
		lblContraseaDeAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblContraseaDeAdministrador = new GridBagConstraints();
		gbc_lblContraseaDeAdministrador.anchor = GridBagConstraints.WEST;
		gbc_lblContraseaDeAdministrador.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseaDeAdministrador.gridx = 2;
		gbc_lblContraseaDeAdministrador.gridy = 10;
		contentPane.add(lblContraseaDeAdministrador, gbc_lblContraseaDeAdministrador);
		
		passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 2;
		gbc_passwordField_1.gridy = 11;
		contentPane.add(passwordField_1, gbc_passwordField_1);
		
		JButton btnInicioSesion = new JButton("Registrarme");
		GridBagConstraints gbc_btnInicioSesion = new GridBagConstraints();
		gbc_btnInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioSesion.gridx = 2;
		gbc_btnInicioSesion.gridy = 13;
		contentPane.add(btnInicioSesion, gbc_btnInicioSesion);

		setVisible(true);
	}

}
