package Control;

import Exceptions.ValidationError;
import Model.User;

import java.util.ArrayList;

public class UserControl {
    private final PrincipalControl principal;
    private final ArrayList<User> users;

    public UserControl(PrincipalControl principal) {
        this.principal = principal;
        users = new ArrayList<>();

        //Create some users
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User validateUser(String name, String password) throws ValidationError {
     for(User user: users){
         if(user.getName().equals(name) && user.verifyPassWord(password)){
             return user;
         }
     }
     throw new ValidationError();
    }
}
