package View;

import Control.ControlPanel;
import Model.Recipe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RecipePanel extends JPanel {

    private final JLabel recipeNameLbl;
    private final JLabel instructionsLbl;
    private final JLabel ingredientsLbl;
    private final JTextPane ingredientsTp;
    private Recipe recipe;
    private ArrayList<Recipe> recipes;
    private final JButton giveFavBtn;
    private final ControlPanel controlPanel;

    public RecipePanel(ArrayList<Recipe> recipes, ControlPanel controlPanel) {
        if(!recipes.isEmpty()){
            recipe = recipes.getFirst();
        }
        setLayout(new BorderLayout(10, 10)); // Espaciado entre componentes
        this.recipes= recipes;
        this.controlPanel = controlPanel;

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
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Espaciado entre botones

        JButton editRecipeBtn = new JButton("Editar");
        editRecipeBtn.setActionCommand("edit");
        editRecipeBtn.addActionListener(controlPanel);

        JButton nextBtn = new JButton("-->");
        nextBtn.setActionCommand("next");
        nextBtn.addActionListener(controlPanel);

        giveFavBtn = new JButton();
        giveFavBtn.setActionCommand("giveFav");
        giveFavBtn.addActionListener(controlPanel);

        JButton previousBtn = new JButton("<--");
        previousBtn.setActionCommand("previous");
        previousBtn.addActionListener(controlPanel);

        JButton newRecipeBtn = new JButton("Subir receta");
        newRecipeBtn.setActionCommand("new");
        newRecipeBtn.addActionListener(controlPanel);

        buttonPanel.add(newRecipeBtn);
        buttonPanel.add(previousBtn);
        buttonPanel.add(giveFavBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(editRecipeBtn);
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


    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
        if(!recipes.isEmpty()) {
            recipe = recipes.getFirst();
        }else{
            recipe = null;
        }
        updateRecipe();
    }

    public void updateRecipe() {
        if(recipe != null){
            recipeNameLbl.setText(recipe.getTitle());
            instructionsLbl.setText("<html><b>Instrucciones:</b><br>" + recipe.getInstructions() + "</html>");
            addIngredientsString();

            //change fav button text if user have already liked the function
            for(Recipe favRecipe : controlPanel.getViewControl().getPrincipalControl().getUser().getFavs()) {
                if(favRecipe == recipe){
                    giveFavBtn.setText("No me gusta");
                    return ;
                }
            }
        }else{
            recipeNameLbl.setText("");
            instructionsLbl.setText("");
            ingredientsTp.setText("");
            ingredientsLbl.setText("");

        }
        giveFavBtn.setText("Me gusta");
    }

    public int getRecipeIndex() {
        return recipes.indexOf(recipe);//Return will never be -1
    }

    public void setRecipe(int recipeIndex) {
        recipe = recipes.get(recipeIndex);
        updateRecipe();
    }

    public void alertPermisionInvalid(){
        JOptionPane.showMessageDialog(null, "No puedes editar esta receta", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
