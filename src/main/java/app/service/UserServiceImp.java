package app.service;

import app.dao.UserDao;
import app.dao.UserDaoImp;
import app.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;
    public UserServiceImp(UserDaoImp userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }
}
