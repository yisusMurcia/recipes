package View;

import Control.ViewControl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StartingView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ViewControl viewControl;
	private Image image;
	private final JPanel imagePanel;

	public StartingView(ViewControl viewControl) {
		
		this.viewControl = viewControl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 29, 24));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 110, 26, 150, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		imagePanel = new JPanel(){
			@Override
			public void paintComponent(Graphics g) {
				int width = this.getSize().width;
				int height = this.getSize().height;

				if (image != null) {
					g.drawImage(image, 0, 0, width, height, null);
				}

				super.paintComponent(g);
			}
		};
		setImage("src/main/java/Images/image_1.png",imagePanel);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 7;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 0;
		contentPane.add(imagePanel, gbc_panel);
		
		JLabel lblSlogan = new JLabel("Recetas de cocina para todos los gustos");
		lblSlogan.setForeground(new Color(240, 245, 238));
		lblSlogan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSlogan = new GridBagConstraints();
		gbc_lblSlogan.gridwidth = 2;
		gbc_lblSlogan.insets = new Insets(0, 0, 5, 5);
		gbc_lblSlogan.gridx = 1;
		gbc_lblSlogan.gridy = 1;
		contentPane.add(lblSlogan, gbc_lblSlogan);
		
		JLabel lblBienvenida = new JLabel("¡Bienvenid@!");
		lblBienvenida.setForeground(new Color(240, 245, 238));
		lblBienvenida.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblBienvenida = new GridBagConstraints();
		gbc_lblBienvenida.gridwidth = 2;
		gbc_lblBienvenida.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenida.gridx = 1;
		gbc_lblBienvenida.gridy = 3;
		contentPane.add(lblBienvenida, gbc_lblBienvenida);

		JButton logginBtn = new JButton("Iniciar sesión");
		logginBtn.setBackground(new Color(199, 171, 125));
		logginBtn.setActionCommand("login");
		logginBtn.addActionListener(viewControl);
		GridBagConstraints gbc_btnInicioSesion = new GridBagConstraints();
		gbc_btnInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnInicioSesion.gridx = 1;
		gbc_btnInicioSesion.gridy = 5;
		contentPane.add(logginBtn, gbc_btnInicioSesion);
		
		JButton registerBtn = new JButton("Registrarme");
		registerBtn.setBackground(new Color(199, 171, 125));
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

    public void setImage(String imageRoute, JPanel panel) {
		panel.setOpaque(false);
		image = new ImageIcon(imageRoute).getImage();
		panel.repaint();
	}

}
