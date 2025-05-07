package Control;

import View.NewUserView;

public class RegisterControl {
    private final ViewControl viewControl;
    private final NewUserView registerView;

    public RegisterControl(ViewControl viewControl) {
        this.viewControl = viewControl;
        // Create RegisterView
        registerView = new NewUserView();
    }
}
