package Model;

import java.io.Serializable;

public class Recipe{
    private String instructions;
    private String title;
    private String[] ingredients;
    private FoodType[] foodType;
    private FoodIntention[] foodIntentions;
    private final User owner;

    public Recipe(String title, String instructions, String[] ingredients, FoodType[] foodType, FoodIntention[] foodIntentions, User owner) {
        this.title = title;
        this.instructions = instructions;
        this.ingredients = ingredients;
        this.foodType = foodType;
        this.foodIntentions = foodIntentions;
        this.owner = owner;
    }

    public String getInstructions(){
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public FoodType[] getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType[] foodType) {
        this.foodType = foodType;
    }

    public FoodIntention[] getFoodIntentions() {
        return foodIntentions;
    }

    public void setFoodIntentions(FoodIntention[] foodIntentions) {
        this.foodIntentions = foodIntentions;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User user) {
    }
}
