package Control;

import View.MainView;
import View.PrincipalView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl pControl;
    private final MainView mainView;
    private static int contador = 0;

    public ViewControl(PrincipalControl pControl) {
        this.pControl = pControl;
        //Create MainView
        mainView = new MainView(this);
    }

    public PrincipalControl getpControl() {
        return pControl;
    }

    public void createMYAccount(){
        new PrincipalView(this, pControl.getUser());
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
