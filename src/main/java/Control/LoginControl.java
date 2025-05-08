package Control;

import Exceptions.NameException;
import Exceptions.NullPassError;
import Exceptions.ValidationError;
import Model.User;
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
        principalControl = viewControl.getPrincipalControl();
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
            case "signup":
                try{
                    User user;
                    //Validate if the user is admin (option and password)
                    boolean isAdmin = newUserView.getRol().equals("Admin");
                    if(isAdmin && !newUserView.getPasswordAdmin().equals("iAmAdmin")){
                        newUserView.alertInvalidAdminPassword();
                        break;
                    }
                    user = principalControl.getUserControl().CreateUser(newUserView.getName(), newUserView.getPassword(), isAdmin);
                    principalControl.setUser(user);
                    newUserView.dispose();
                    viewControl.createMYAccount();
                } catch (NameException ex) {
                    newUserView.alertNameError();
                } catch (NullPassError ex) {
                    newUserView.alertNullPassError();
                }
            case "Rol selection":
                String selectedRol = (String) newUserView.getRolSelection();
                System.out.println(selectedRol);
                newUserView.getAdminPasswordField().setEnabled(selectedRol.equals("Admin"));
                newUserView.getAdminPasswordLbl().setEnabled(selectedRol.equals("Admin"));
                newUserView.repaint();
        }
    }
    public void createLoginView(){
        loginView = new LoginView(this);
    }

    public void createNewUserView(){
        newUserView = new NewUserView(this);
    }
}
