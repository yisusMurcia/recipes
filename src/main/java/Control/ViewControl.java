package Control;

import View.PrincipalView;
import View.StartingView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl principalControl;
    private final StartingView startingView;
    private static int contador = 0;

    public ViewControl(PrincipalControl principalControl) {
        this.principalControl = principalControl;
        //Create StartingView
        startingView = new StartingView(this);
    }

    public PrincipalControl getPrincipalControl() {
        return principalControl;
    }

    public void createMYAccount(){
        //Crear algunas recetas

        //ControlPanel allRecipesControl = new ControlPanel("A por más recetas", principalControl.getRecipes());
        new PrincipalView(this, principalControl.getUser(), new ControlPanel("A por más recetas", principalControl.getRecipes()), new ControlPanel("A por más recetas", principalControl.getRecipes()), new ControlPanel("A por más recetas", principalControl.getRecipes()));
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
}
