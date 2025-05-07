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

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUser;
	private JTextField tfPassword;
	public LoginView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
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
		
		JLabel lblIniciaSesinEn = new JLabel("Inicia sesión en tu cueta:");
		lblIniciaSesinEn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblIniciaSesinEn = new GridBagConstraints();
		gbc_lblIniciaSesinEn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIniciaSesinEn.gridx = 2;
		gbc_lblIniciaSesinEn.gridy = 2;
		contentPane.add(lblIniciaSesinEn, gbc_lblIniciaSesinEn);
		
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
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		GridBagConstraints gbc_tfPassword = new GridBagConstraints();
		gbc_tfPassword.insets = new Insets(0, 0, 5, 5);
		gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassword.gridx = 2;
		gbc_tfPassword.gridy = 7;
		contentPane.add(tfPassword, gbc_tfPassword);
		
		JButton btnInicioSesion = new JButton("Iniciar sesión");
		GridBagConstraints gbc_btnInicioSesion = new GridBagConstraints();
		gbc_btnInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioSesion.gridx = 2;
		gbc_btnInicioSesion.gridy = 9;
		contentPane.add(btnInicioSesion, gbc_btnInicioSesion);

		setVisible(true);
	}

}
