package academy.kata.SpringBoot.dao;


import academy.kata.SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    void save(User user);
    User getUserById(long id);
    void delete(long id);
    void update(User user);
}
