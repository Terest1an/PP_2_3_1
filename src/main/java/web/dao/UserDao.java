package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> getUsers();
   User getUser(int id);
   void update(User user);
   void removeUserById(int id);
   void createUser(String name, String surname, int age);
   public void createUserTable();


}
