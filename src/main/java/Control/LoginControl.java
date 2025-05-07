package Control;

import Exceptions.ValidationError;
import View.LoginView;
import View.NewUserView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginControl implements ActionListener {
    private final ViewControl viewControl;
    private LoginView loginView;
    private NewUserView newUserView;
    private final PrincipalControl principalControl;

    public LoginControl(ViewControl viewControl) {
        this.viewControl = viewControl;
        principalControl = viewControl.getpControl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "login":
                try{
                    principalControl.setUser(principalControl.getUserControl().validateUser(loginView.getUserName(), loginView.getPassword()));
                    loginView.dispose();
                    viewControl.createMYAccount();
                }catch (ValidationError _){
                    loginView.alertValidationError();
                }
                break;
            case "register":
        }
    }

    public void createLoginView(){
        loginView = new LoginView(this);
    }

    public void createNewUserView(){
        newUserView = new NewUserView(this);
    }
}
