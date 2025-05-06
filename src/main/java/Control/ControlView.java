package Control;

import View.MainView;

public class ControlView {

    private final PrincipalControl pControl;

    public ControlView(PrincipalControl pControl) {
        this.pControl = pControl;
        //Create MainView
        MainView view = new MainView();
        view.setVisible(true);
    }
}
