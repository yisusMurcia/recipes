package Control;

import View.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl pControl;
    private final MainView view;

    public ViewControl(PrincipalControl pControl) {
        this.pControl = pControl;
        //Create MainView
        view = new MainView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "loggin":
                new LoginControl(this);
                break;
            case "register":
                new RegisterControl(this);
                break;
            default:
                view.alertBrokenSystem();
                break;
        }
    }
}
