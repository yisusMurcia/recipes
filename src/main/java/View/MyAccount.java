package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.User;

import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MyAccount extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// Manejar con el control
	private User user;
	private int contador;

	public MyAccount(User user) {
		this.user = user;
		this.contador = 0;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		
		JLabel lblInstrucciones = new JLabel("Instrucciones:");
		lblInstrucciones.setBounds(10, 111, 83, 14);
		panelRecipe.add(lblInstrucciones);
		
		JLabel lblIngredientes = new JLabel("Ingredientes:");
		lblIngredientes.setBounds(10, 36, 83, 14);
		panelRecipe.add(lblIngredientes);
		
		JTextPane tpIngredientes = new JTextPane();
		tpIngredientes.setBounds(10, 57, 195, 46);
		panelRecipe.add(tpIngredientes);
		
		JButton btnNext = new JButton("-->");
		btnNext.addActionListener(new ActionListener() {
			// Trabajar con el control
			public void actionPerformed(ActionEvent e) {
				contador += 1;
				lblInstrucciones.setText("");
				tpIngredientes.setText("");
				lblInstrucciones.setText("Instrucciones: " + user.getRecipes().get(contador).getInstructions());
				String ingredientes = tpIngredientes.getText();
				tpIngredientes.setText(ingredientes + user.getRecipes().get(contador).getIngredients().get(0) + "\n");
				for (int i=1; i<=2; i++) {
					ingredientes = tpIngredientes.getText();
					tpIngredientes.setText(ingredientes + "\n" + user.getRecipes().get(contador).getIngredients().get(i) + "\n");
				}
			}
		});
		btnNext.setBounds(259, 41, 52, 23);
		panel.add(btnNext);
		
		JButton btnPrevious = new JButton("<--");
		btnPrevious.addActionListener(new ActionListener() {
			// Trabajar con el constructor
			public void actionPerformed(ActionEvent e) {
				contador -= 1;
				lblInstrucciones.setText("");
				tpIngredientes.setText("");
				lblInstrucciones.setText("Instrucciones: " + user.getRecipes().get(contador).getInstructions());
				String ingredientes = tpIngredientes.getText();
				tpIngredientes.setText(ingredientes + user.getRecipes().get(contador).getIngredients().get(0) + "\n");
				for (int i=1; i<=2; i++) {
					ingredientes = tpIngredientes.getText();
					tpIngredientes.setText(ingredientes + "\n" + user.getRecipes().get(contador).getIngredients().get(i) + "\n");
				}
			}
		});
		btnPrevious.setBounds(259, 86, 52, 23);
		panel.add(btnPrevious);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Mis favoritos", null, panel_1, null);
	}
}
