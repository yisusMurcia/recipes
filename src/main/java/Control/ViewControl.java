package Control;

import View.MainView;
import View.PrincipalView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl principalControl;
    private final MainView mainView;
    private static int contador = 0;

    public ViewControl(PrincipalControl principalControl) {
        this.principalControl = principalControl;
        //Create MainView
        mainView = new MainView(this);
    }

    public PrincipalControl getPrincipalControl() {
        return principalControl;
    }

    public void createMYAccount(){
        new PrincipalView(this, principalControl.getUser());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LoginControl loginControl = new LoginControl(this);
        mainView.dispose();
        switch (e.getActionCommand()) {
            case "login":
                loginControl.createLoginView();
                break;
            case "register":
                loginControl.createNewUserView();
                break;
            default:
                mainView.alertBrokenSystem();
                break;
        }
    }
}
