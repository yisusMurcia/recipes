package Control;

import Model.*;

import java.util.ArrayList;

public class PrincipalControl {
    private ArrayList<Recipe> recipes;
    private User user;
    private final ViewControl viewControl;
    private final UserControl userControl;

    public PrincipalControl() {
        viewControl = new ViewControl(this);
        userControl = new UserControl(this);
    }
    
    public User getUser() {
    	return user;
    }

    public UserControl getUserControl() {
        return userControl;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
