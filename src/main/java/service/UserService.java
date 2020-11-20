package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
private  static List<User> list;
static {
    list= new ArrayList<>();
    User user= new User();
    user.setAge(10);
    user.setName("John");
    user.setAccount("john");
    user.setEmail("john@gmail.com");
    user.setPassword("123");
    list.add(user);

    User user1= new User();
    user1.setAge(15);
    user1.setName("Bill");
    user1.setAccount("bill");
    user1.setEmail("bill@gmail.com");
    user1.setPassword("123");
    list.add(user1);

    User user2= new User();
    user2.setAge(16);
    user2.setName("Mike");
    user2.setAccount("mike");
    user2.setEmail("mike@gmail.com");
    user2.setPassword("123");
    list.add(user2);
}
public static User checkLogin(Login login){
    for(User user:list){
        if (user.getAccount().equals(login.getAccount())&& user.getPassword().equals(login.getPassword())){
            return user;
        }
    }
    return null;
}
}
