package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    protected final String name;
    protected final ArrayList<Recipe> recipes;
    protected final ArrayList<Recipe> favs;
    protected String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.recipes = new ArrayList<>();
        this.favs = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public ArrayList<Recipe> getFavs() {
        return favs;
    }

    public boolean verifyPassWord(String passwordInserted) {
        return password.equals(passwordInserted);
    }

    public boolean deleteRecipe(Recipe recipe){
        if(recipes.contains(recipe)){
            recipes.remove(recipe);
            return true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }
}
