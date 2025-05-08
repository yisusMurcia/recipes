package Control;

import Model.*;

import java.util.ArrayList;

public class PrincipalControl {
    private final ArrayList<Recipe> recipes;
    private User user;
    private final UserControl userControl;

    public PrincipalControl() {
        new ViewControl(this);//Initialize view
        userControl = new UserControl();
        recipes = new ArrayList<>();

        //Crear algunas recetas
        Recipe recipe1 = new Recipe("receta 1", "no se", "ingrediente1,ingrediente2".split(","), new FoodType[]{FoodType.VEGAN}, new FoodIntention[]{FoodIntention.LUNCH}, new User("q", "q"));
        Recipe recipe2 = new Recipe("receta 2", "no se", "ingrediente1,ingrediente2".split(","), new FoodType[]{FoodType.VEGAN}, new FoodIntention[]{FoodIntention.LUNCH}, new User("q", "q"));

        recipes.add(recipe1);
        recipes.add(recipe2);
    }
    
    public User getUser() {
    	return user;
    }

    public UserControl getUserControl() {
        return userControl;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
