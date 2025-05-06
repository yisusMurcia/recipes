package Control;

import Model.*;

import java.util.ArrayList;

public class PrincipalControl {
    private ArrayList<Recipe> recipes;
    private User user;
    private final ControlView viewControl;

    public PrincipalControl() {
        viewControl = new ControlView(this);
    }
}
