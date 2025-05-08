package Control;

import Model.*;

import java.util.ArrayList;

public class PrincipalControl {
    private ArrayList<Recipe> recipes;
    private User user;
    private final UserControl userControl;

    public PrincipalControl() {
        ViewControl viewControl = new ViewControl(this);
        userControl = new UserControl();
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
