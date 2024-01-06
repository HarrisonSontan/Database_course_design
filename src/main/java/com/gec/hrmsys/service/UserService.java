package com.gec.hrmsys.service;

import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.domain.User;

import java.util.List;

//用户业务接口
public interface UserService {

    List<User> queryAll();

    List<User> querUserListBypage(User user,PageModel pageModel);

    void saveUser(User user);

    User getUserById(int parseInt);

    void editUser(User user);

    void delbyid(Integer id);

    void deleteAll(String[] userIds);

    User findUserByLogin(String loginname, String password);
}
