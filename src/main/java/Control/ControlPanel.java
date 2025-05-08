package Control;

import Model.Recipe;
import View.RecipePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControlPanel implements ActionListener {
    private final String title;
    private ArrayList<Recipe> recipes;
    private int currentRecipeIndex;
    private RecipePanel recipePanel;
    public ControlPanel(String title, ArrayList<Recipe> recipes) {
        this.title = title;
        this.recipes = recipes;
        currentRecipeIndex = 0;
    }

    public RecipePanel createPanel(){
        recipePanel = new RecipePanel(title, recipes, this);
        return recipePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //When an action is performed, the recipePanel isn´t null
        currentRecipeIndex = recipePanel.getRecipeIndex();
        System.out.println(currentRecipeIndex);
        switch (e.getActionCommand()){
            case "next":
                if(currentRecipeIndex < recipes.size() - 1){
                    recipePanel.setRecipe(currentRecipeIndex + 1);
                } else {
                    recipePanel.setRecipe(0);
                }
                break;
            case "previous":
                if(currentRecipeIndex > 0){
                    recipePanel.setRecipe(currentRecipeIndex - 1);
                } else {
                    recipePanel.setRecipe(recipes.size() - 1);
                }
                break;
        }

    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
}
