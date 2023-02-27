package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User getUserById(Long id);
    List<User> getUsers();

    void update(Long id, User user);

    void delete(Long id);
}
