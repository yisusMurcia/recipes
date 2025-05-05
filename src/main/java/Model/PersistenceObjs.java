package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersistenceObjs {
    private FileInputStream userFileIn;
    private FileInputStream recipeFileIn;
    private FileOutputStream userFileOut;
    private FileOutputStream recipeFileOut;
    private ObjectInputStream userObjIn;
    private ObjectInputStream recipeObjIn;
    private ObjectOutputStream userObjOut;
    private ObjectOutputStream recipeObjOut;

    public PersistenceObjs() {
        try {
            userFileIn = new FileInputStream("userData.txt");
            recipeFileIn = new FileInputStream("recipeData.txt");
            userFileOut = new FileOutputStream("userData.txt");
            recipeFileOut = new FileOutputStream("recipeData.txt");
            userObjIn = new ObjectInputStream(userFileIn);
            recipeObjIn = new ObjectInputStream(recipeFileIn);
            userObjOut = new ObjectOutputStream(userFileOut);
            recipeObjOut = new ObjectOutputStream(recipeFileOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean saveUsers(ArrayList<User> users){
        try {
            userObjOut.writeObject(users);
            userObjOut.flush();
            userObjOut.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveRecipes(ArrayList<Recipe> recipes){
        try {
            recipeObjOut.writeObject(recipes);
            recipeObjOut.flush();
            recipeObjOut.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<User> loadUsers(){
        try {
            ArrayList<User> users = (ArrayList<User>) userObjIn.readObject();
            userObjIn.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Recipe> loadRecipes(){
        try {
            ArrayList<Recipe> recipes = (ArrayList<Recipe>) recipeObjIn.readObject();
            recipeObjIn.close();
            return recipes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
