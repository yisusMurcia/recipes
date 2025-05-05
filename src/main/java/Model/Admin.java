package Model;

public class Admin extends User {

    public Admin(String name, String password) {
        super(name, password);
    }

    public boolean deleteRecipe(Recipe recipe, User user){
        return user.deleteRecipe(recipe);
    }

    public boolean deleteUser(User user){//Still in development
        return false;
    }

}
