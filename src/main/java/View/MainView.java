package View;

import Control.ViewControl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ViewControl viewControl;

	public MainView(ViewControl viewControl) {
		this.viewControl = viewControl;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 110, 26, 150, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 7;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblSlogan = new JLabel("Recetas de cocina para todos los gustos");
		lblSlogan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSlogan = new GridBagConstraints();
		gbc_lblSlogan.gridwidth = 2;
		gbc_lblSlogan.insets = new Insets(0, 0, 5, 5);
		gbc_lblSlogan.gridx = 1;
		gbc_lblSlogan.gridy = 1;
		contentPane.add(lblSlogan, gbc_lblSlogan);
		
		JLabel lblBienvenida = new JLabel("¡Bienvenid@!");
		lblBienvenida.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblBienvenida = new GridBagConstraints();
		gbc_lblBienvenida.gridwidth = 2;
		gbc_lblBienvenida.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenida.gridx = 1;
		gbc_lblBienvenida.gridy = 3;
		contentPane.add(lblBienvenida, gbc_lblBienvenida);

		JButton logginBtn = new JButton("Iniciar sesión");
		logginBtn.setActionCommand("loggin");
		logginBtn.addActionListener(viewControl);
		GridBagConstraints gbc_btnInicioSesion = new GridBagConstraints();
		gbc_btnInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioSesion.gridx = 1;
		gbc_btnInicioSesion.gridy = 5;
		contentPane.add(logginBtn, gbc_btnInicioSesion);
		
		JButton registerBtn = new JButton("Registrarme");
		registerBtn.setActionCommand("register");
		registerBtn.addActionListener(viewControl);

		GridBagConstraints gbc_btnRegistrarme = new GridBagConstraints();
		gbc_btnRegistrarme.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrarme.gridx = 2;
		gbc_btnRegistrarme.gridy = 5;
		contentPane.add(registerBtn, gbc_btnRegistrarme);

		setVisible(true);
	}

	public void alertBrokenSystem(){
		JOptionPane.showMessageDialog(this, "Felicitaciones, has roto el programa");
	}

}
