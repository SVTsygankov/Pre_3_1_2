package web.Pre_3_1_2.dao;

import web.Pre_3_1_2.model.User;
import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

}
