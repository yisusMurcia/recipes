package Control;

import Model.FoodIntention;
import Model.FoodType;
import Model.Recipe;
import View.RecipeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RecipeControl implements ActionListener {
    private Recipe recipe;
    private final ControlPanel controlPanel;
    private final RecipeView recipeView;

    public RecipeControl(Recipe recipe, ControlPanel controlPanel){//Constructor de editar receta
        this.recipe = recipe;
        this.controlPanel = controlPanel;
        recipeView = new RecipeView(this);
        recipeView.loadRecipeData(recipe);
    }

    public RecipeControl(ControlPanel controlPanel) {
        recipeView = new RecipeView(this);
        this.controlPanel = controlPanel;
        recipe = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "finish":
                Recipe recipeUpdated = recipeView.getRecipeUpdated();
                //Update the recipe if it is not null
                if(recipe != null){
                    recipe.setTitle(recipeUpdated.getTitle());
                    recipe.setInstructions(recipeUpdated.getInstructions());
                    recipe.setIngredients(recipeUpdated.getIngredients());
                    recipe.setFoodType(recipeUpdated.getFoodType());
                    recipe.setFoodIntentions(recipeUpdated.getFoodIntentions());
                } else {
                    //Create a new recipe
                    recipe = recipeUpdated;
                    controlPanel.getViewControl().getPrincipalControl().getUser().addRecipe(recipe);
                    controlPanel.getViewControl().getPrincipalControl().getRecipes().add(recipe);
                }
                //Update the recipe in the control panel
                controlPanel.getViewControl().updateRecipes();

                //Get the recipe data
                recipeView.dispose();
                break;
            case "delete":
                if(recipe != null){
                    controlPanel.getViewControl().getPrincipalControl().getUser().deleteRecipe(recipe);
                    controlPanel.getViewControl().getPrincipalControl().getRecipes().remove(recipe);
                    controlPanel.getViewControl().getPrincipalControl().getUser().getFavs().remove(recipe);
                    controlPanel.getViewControl().updateRecipes();
                }
                    recipeView.dispose();
                break;
        }
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }
}
