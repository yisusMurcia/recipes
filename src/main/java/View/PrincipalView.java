package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.ViewControl;
import Model.User;

import java.awt.*;
import javax.swing.JTabbedPane;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.JTextPane;

public class PrincipalView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ViewControl viewControl;
	private JButton btnNext;
	private JButton btnPrevious;
	private JLabel lblInstrucciones;
	private JTextPane tpIngredientes;

	private User user;

	public PrincipalView(ViewControl viewControl, User user) {
		this.viewControl = viewControl;
		this.user = user;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
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
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Mis recetas", null, panel, null);
		panel.setLayout(null);
		
		JPanel panelRecipe = new JPanel();
		panelRecipe.setBounds(10, 11, 216, 136);
		panel.add(panelRecipe);
		panelRecipe.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom receta");
		lblNewLabel.setBounds(88, 11, 55, 14);
		panelRecipe.add(lblNewLabel);
		
		lblInstrucciones = new JLabel("Instrucciones:");
		lblInstrucciones.setBounds(10, 111, 83, 14);
		panelRecipe.add(lblInstrucciones);
		
		JLabel lblIngredientes = new JLabel("Ingredientes:");
		lblIngredientes.setBounds(10, 36, 83, 14);
		panelRecipe.add(lblIngredientes);
		
		tpIngredientes = new JTextPane();
		tpIngredientes.setBounds(10, 57, 195, 46);
		panelRecipe.add(tpIngredientes);
		
		btnNext = new JButton("-->");
		btnNext.setBounds(259, 41, 52, 23);
		panel.add(btnNext);
		
		btnPrevious = new JButton("<--");
		btnPrevious.setBounds(259, 86, 52, 23);
		panel.add(btnPrevious);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Mis favoritos", null, panel_1, null);
		
		setVisible(true);
	}
	
	public JButton getBtnNext() {
		return btnNext;
	}
	
	public JButton getBtnPrevious() {
		return btnPrevious;
	}
	
	public JLabel getLblInstrucciones() {
		return lblInstrucciones;
	}
	
	public JTextPane getTpIngredientes() {
		return tpIngredientes;
	}

	public void setIngredientsText(ArrayList<String> ingredients){
		StringBuilder ingredientsText = new StringBuilder();
		for (String ingredient : ingredients) {
			ingredientsText.append(ingredient).append("\n");
		}
		tpIngredientes.setText(ingredientsText.toString());
	}

	public void setInstructions(String instructions){
		lblInstrucciones.setText("Instrucciones:" + instructions);
	}
	
}
