package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Recipe implements Serializable {
    private String instructions;
    private int numOfFavs;
    private String title;
    private ArrayList<String> ingredients;
    private ArrayList<FoodType> foodType;
    private ArrayList<FoodIntention> foodIntentions;
    private final User owner;

    public Recipe(String title, String instructions, ArrayList<String> ingredients, ArrayList<FoodType> foodType, ArrayList<FoodIntention> foodIntentions, User owner) {
        this.title = title;
        this.instructions = instructions;
        this.ingredients = ingredients;
        this.foodType = foodType;
        this.foodIntentions = foodIntentions;
        this.numOfFavs = 0;
        this.owner = owner;
    }

    public String getInstructions(){
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getNumOfFavs() {
        return numOfFavs;
    }

    public void setNumOfFavs(int numOfFavs) {
        this.numOfFavs = numOfFavs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<FoodType> getFoodType() {
        return foodType;
    }

    public void setFoodType(ArrayList<FoodType> foodType) {
        this.foodType = foodType;
    }

    public ArrayList<FoodIntention> getFoodIntentions() {
        return foodIntentions;
    }

    public void setFoodIntentions(ArrayList<FoodIntention> foodIntentions) {
        this.foodIntentions = foodIntentions;
    }

    public User getOwner() {
        return owner;
    }
}
