package View;

import Control.LoginControl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class NewUserView extends JFrame {
    private final JTextField tfUser;
	private final JPasswordField passwordField;
	private final JPasswordField adminPasswordField;
    private final JComboBox rolSelection;
	private final JLabel adminPasswordLbl;

	public NewUserView(LoginControl loginControl) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(48, 29, 24));
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
		lblNewLabel.setForeground(new Color(240, 245, 238));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel enterLbl = new JLabel("Únete y acompaña esta divertida búsqueda para descubrir tu próxima receta favorita");
		enterLbl.setForeground(new Color(240, 245, 238));
		enterLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 2;
		gbc_lblLogin.gridy = 2;
		contentPane.add(enterLbl, gbc_lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(240, 245, 238));
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
		
		JLabel passwordLabel = new JLabel("Contraseña:");
		passwordLabel.setForeground(new Color(240, 245, 238));
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
		gbc_passwordLabel.insets = new Insets(0, 0, 5, 5);
		gbc_passwordLabel.anchor = GridBagConstraints.WEST;
		gbc_passwordLabel.gridx = 2;
		gbc_passwordLabel.gridy = 6;
		contentPane.add(passwordLabel, gbc_passwordLabel);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 7;
		contentPane.add(passwordField, gbc_passwordField);
		
		JLabel lblRol = new JLabel("Rol:");
		lblRol.setForeground(new Color(240, 245, 238));
		lblRol.setHorizontalAlignment(SwingConstants.LEFT);
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblRol = new GridBagConstraints();
		gbc_lblRol.anchor = GridBagConstraints.WEST;
		gbc_lblRol.insets = new Insets(0, 0, 5, 5);
		gbc_lblRol.gridx = 2;
		gbc_lblRol.gridy = 8;
		contentPane.add(lblRol, gbc_lblRol);
		
		rolSelection = new JComboBox(new String []{"User", "Admin"});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 9;
		contentPane.add(rolSelection, gbc_comboBox);
		rolSelection.setActionCommand("Rol selection");
		rolSelection.addActionListener(loginControl);

		adminPasswordLbl = new JLabel("Contraseña de administrador: (opcional)");
		adminPasswordLbl.setForeground(new Color(240, 245, 238));
		adminPasswordLbl.setHorizontalAlignment(SwingConstants.LEFT);
		adminPasswordLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_adminPasswordLbl = new GridBagConstraints();
		gbc_adminPasswordLbl.anchor = GridBagConstraints.WEST;
		gbc_adminPasswordLbl.insets = new Insets(0, 0, 5, 5);
		gbc_adminPasswordLbl.gridx = 2;
		gbc_adminPasswordLbl.gridy = 10;
		contentPane.add(adminPasswordLbl, gbc_adminPasswordLbl);
		adminPasswordLbl.setEnabled(false);
		
		adminPasswordField = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 2;
		gbc_passwordField_1.gridy = 11;
		contentPane.add(adminPasswordField, gbc_passwordField_1);
		adminPasswordField.setEnabled(false);
		
		JButton signUpBtn = new JButton("Registrarme");
		signUpBtn.setBackground(new Color(199, 171, 125));
        signUpBtn.setActionCommand("signup");
        signUpBtn.addActionListener(loginControl);
		GridBagConstraints gbc_signupBtn = new GridBagConstraints();
		gbc_signupBtn.insets = new Insets(0, 0, 5, 5);
		gbc_signupBtn.gridx = 2;
		gbc_signupBtn.gridy = 13;
		contentPane.add(signUpBtn, gbc_signupBtn);

		setVisible(true);
		
	}

    public String getName() {
        return tfUser.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public String getPasswordAdmin() {
        return new String(adminPasswordField.getPassword());
    }

    public String getRol() {
        return rolSelection.getSelectedItem().toString();
    }

	public JPasswordField getAdminPasswordField() { return passwordField; }

	public JLabel getAdminPasswordLbl() { return adminPasswordLbl; }

	public String getRolSelection() {
		return rolSelection.getSelectedItem().toString();
	}

    public void alertNameError() {
        JOptionPane.showMessageDialog(this, "El nombre de usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void alertNullPassError() {
        JOptionPane.showMessageDialog(this, "La contraseña o el nombre no pueden ser nula", "Error", JOptionPane.ERROR_MESSAGE);
    }

	public void alertInvalidAdminPassword(){
		JOptionPane.showMessageDialog(this, "Contraseña de administrador incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
	}
}
