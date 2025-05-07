package Control;

import View.LoginView;

public class LoginControl {
    private final ViewControl viewControl;

    public LoginControl(ViewControl viewControl) {
        this.viewControl = viewControl;
        // Create LoginView
        new LoginView();
    }
}
