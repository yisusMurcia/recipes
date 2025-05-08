package View;

import Control.ControlPanel;
import Model.Recipe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RecipePanel extends JPanel {

    private JLabel recipeNameLbl;
    private JLabel instructionsLbl;
    private JLabel ingredientsLbl;
    private JTextPane ingredientsTp;
    private JButton nextBtn;
    private JButton previousBtn;
    private Recipe recipe;
    private ArrayList<Recipe> recipes;

    public RecipePanel(String title, ArrayList<Recipe> recipes, ControlPanel controlPanel) {
        setLayout(new BorderLayout(10, 10)); // Espaciado entre componentes
        recipe = recipes.getFirst();
        this.recipes= recipes;

        // Panel superior para el título
        JPanel titlePanel = new JPanel();
        recipeNameLbl = new JLabel();
        recipeNameLbl.setFont(new Font("Arial", Font.BOLD, 16));
        titlePanel.add(recipeNameLbl);
        add(titlePanel, BorderLayout.NORTH);

        // Panel central para ingredientes e instrucciones
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1, 10, 10)); // 2 filas, 1 columna, con espaciado
        ingredientsLbl = new JLabel("Ingredientes:");
        ingredientsTp = new JTextPane();
        ingredientsTp.setEditable(false);
        JScrollPane ingredientsScroll = new JScrollPane(ingredientsTp);

        JPanel ingredientsPanel = new JPanel(new BorderLayout());
        ingredientsPanel.add(ingredientsLbl, BorderLayout.NORTH);
        ingredientsPanel.add(ingredientsScroll, BorderLayout.CENTER);

        instructionsLbl = new JLabel();
        instructionsLbl.setVerticalAlignment(SwingConstants.TOP);

        centerPanel.add(ingredientsPanel);
        centerPanel.add(instructionsLbl);
        add(centerPanel, BorderLayout.CENTER);

        // Panel inferior para los botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Espaciado entre botones
        nextBtn = new JButton("-->");
        nextBtn.setActionCommand("next");
        nextBtn.addActionListener(controlPanel);

        previousBtn = new JButton("<--");
        previousBtn.setActionCommand("previous");
        previousBtn.addActionListener(controlPanel);

        buttonPanel.add(previousBtn);
        buttonPanel.add(nextBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        updateRecipe();
    }

    private void addIngredientsString() {
        StringBuilder ingredientsString = new StringBuilder();
        for (String ingredient : recipe.getIngredients()) {
            ingredientsString.append(ingredient).append("\n");
        }
        ingredientsTp.setText(ingredientsString.toString());
    }

    private void updateRecipe() {
        recipeNameLbl.setText(recipe.getTitle());
        instructionsLbl.setText("<html><b>Instrucciones:</b><br>" + recipe.getInstructions() + "</html>");
        addIngredientsString();
    }

    public int getRecipeIndex() {
        return recipes.indexOf(recipe);//Return will never be -1
    }

    public void setRecipe(int recipeIndex) {
        recipe = recipes.get(recipeIndex);
        updateRecipe();
    }
}
