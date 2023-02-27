package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> getUsers();
    User getUserById(Long id);
    void update(Long id, User user);

    void delete(Long id);
}
