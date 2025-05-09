package Control;

import View.PrincipalView;
import View.StartingView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl principalControl;
    private final StartingView startingView;
    private ControlPanel allRecipesControl;
    private ControlPanel myRecipesControl;
    private ControlPanel favRecipesControl;

    public ViewControl(PrincipalControl principalControl) {
        this.principalControl = principalControl;
        //Create StartingView
        startingView = new StartingView(this);
    }

    public PrincipalControl getPrincipalControl() {
        return principalControl;
    }

    public void createMYAccount(){
        //Create panel Controls
        allRecipesControl = new ControlPanel(principalControl.getRecipes(), this);
        myRecipesControl = new ControlPanel(principalControl.getUser().getRecipes(), this);
        favRecipesControl = new ControlPanel(principalControl.getUser().getFavs(), this);

        new PrincipalView(allRecipesControl, favRecipesControl, myRecipesControl);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LoginControl loginControl = new LoginControl(this);
        startingView.dispose();
        switch (e.getActionCommand()) {
            case "login":
                loginControl.createLoginView();
                break;
            case "register":
                loginControl.createNewUserView();
                break;
            default:
                startingView.alertBrokenSystem();
                break;
        }
    }

    public void updateRecipes() {
        allRecipesControl.setRecipes(principalControl.getRecipes());
        myRecipesControl.setRecipes(principalControl.getUser().getRecipes());
        favRecipesControl.setRecipes(principalControl.getUser().getFavs());

    }
}
