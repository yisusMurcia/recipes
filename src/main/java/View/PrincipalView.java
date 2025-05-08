package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.ControlPanel;
import Control.ViewControl;

import java.awt.*;
import javax.swing.JTabbedPane;


public class PrincipalView extends JFrame {
    public PrincipalView(ControlPanel controlAllRecipes, ControlPanel controlFavRecipes, ControlPanel controlMyRecipes) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(48, 29, 24));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 1;
		contentPane.add(tabbedPane, gbc_tabbedPane);

		tabbedPane.addTab("A por más recetas", null, controlAllRecipes.getPanel(), null);

		tabbedPane.addTab("Mis recetas", null, controlMyRecipes.getPanel(), null);

		tabbedPane.addTab("Mis favoritos", null, controlFavRecipes.getPanel(), null);
		
		setVisible(true);
	}
	
}
