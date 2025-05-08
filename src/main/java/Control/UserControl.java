package Control;

import Exceptions.NameException;
import Exceptions.NullPassError;
import Exceptions.ValidationError;
import Model.Admin;
import Model.User;

import java.util.ArrayList;

public class UserControl {
    private final ArrayList<User> users;

    public UserControl() {
        users = new ArrayList<>();

        //Create some users
        users.add(new User("u", "u"));
        users.add(new User("user2", "password2"));
    }

    public User validateUser(String name, String password) throws ValidationError {
     for(User user: users){
         if(user.getName().equals(name) && user.verifyPassWord(password)){
             return user;
         }
     }
     throw new ValidationError();
    }

    public User CreateUser(String name, String password, boolean isAdmin) throws NameException, NullPassError {
        if(name.isEmpty() || password.isEmpty()){
            throw new NullPassError();
        }
        User userCreated;
        for(User user: users){
            if(user.getName().equals(name)){
                throw new NameException();//Cambiar error
            }
        }
        if(isAdmin){
            userCreated = new Admin(name, password);
        }else{
            userCreated = new User(name, password);
        }
        users.add(userCreated);
        return userCreated;
    }

}
