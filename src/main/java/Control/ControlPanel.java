package Control;

import Model.Admin;
import Model.Recipe;
import View.RecipePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControlPanel implements ActionListener {
    private ArrayList<Recipe> recipes;
    private int currentRecipeIndex;
    private RecipePanel recipePanel;
    private final ViewControl viewControl;
    public ControlPanel(ArrayList<Recipe> recipes, ViewControl viewControl) {
        this.recipes = recipes;
        this.viewControl = viewControl;

        recipePanel = new RecipePanel(recipes, this);
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
        if(recipePanel != null) {//Update the panel
            recipePanel.setRecipes(recipes);
        }
    }

    public RecipePanel getPanel(){

        return recipePanel;
    }

    public ViewControl getViewControl() {
        return viewControl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        currentRecipeIndex = recipePanel.getRecipeIndex();
        //Break if recipe not found
        if(currentRecipeIndex == -1) {
            return;
        }

        Recipe recipe = recipes.get(currentRecipeIndex);
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
            case "edit":
                //Verify if the user is admin or is the creator
                if(viewControl.getPrincipalControl().getUser().getClass() == Admin.class ||recipe.getOwner().equals(viewControl.getPrincipalControl().getUser()) ){
                    //Crear vista
                }else{
                    recipePanel.alertPermisionInvalid();
                }
                break;
            case "giveFav":
                ArrayList<Recipe> favRecipes= viewControl.getPrincipalControl().getUser().getFavs();
                if(favRecipes.contains(recipe)){
                    favRecipes.remove(recipe);
                }else{
                    favRecipes.add(recipe);
                }
                viewControl.updateRecipes();
                recipePanel.updateRecipe();
        }

    }

}
