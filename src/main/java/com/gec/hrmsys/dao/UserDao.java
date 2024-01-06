package com.gec.hrmsys.dao;

import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.domain.User;

import java.util.List;

public interface UserDao {
    List<User> queryAll();

    int queryUserCount(User user);

    List<User> queryUserListByPage(PageModel pageModel,User user);

    int saveUser(User user);

    User getUserById(int parseInt);

    void editUser(User user);

    void delbyid(Integer id);

    User findUserByLogin(User user);
}
