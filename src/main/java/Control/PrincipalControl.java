package Control;

import Model.*;

import java.util.ArrayList;

public class PrincipalControl {
    private ArrayList<Recipe> recipes;
    private User user;
    private final ViewControl viewControl;

    public PrincipalControl() {
        viewControl = new ViewControl(this);
    }
    
    public User getUser() {
    	return user;
    }
}
