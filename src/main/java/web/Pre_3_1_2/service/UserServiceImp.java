package web.Pre_3_1_2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.Pre_3_1_2.dao.UserDao;
import web.Pre_3_1_2.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) { this.userDao = userDao; }

    @Override
    @Transactional
    public void addUser(User user) { userDao.addUser(user); }

    @Override
    @Transactional
    public void deleteUser(long id) { userDao.deleteUser(id); }

    @Override
    @Transactional
    public void updateUser(User user) { userDao.updateUser(user); }

    @Override
    public  User getUser(long id) { return userDao.getUser(id); }

    @Override
    public List<User> getAllUsers() {return userDao.getAllUsers(); }

}
