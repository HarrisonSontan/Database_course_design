package com.gec.hrmsys.service.impl;

import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.domain.User;
import com.gec.hrmsys.dao.UserDao;
import com.gec.hrmsys.dao.impl.UserDaoImpl;
import com.gec.hrmsys.service.UserService;

import java.util.List;

/**
 * @author cr
 * @date 2023年12月11日 20:48
 * @description 用户业务层实现类
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> queryAll() {
        //当前没什么复杂业务  直接调用 dao 层方法来查询
        return userDao.queryAll();
    }

    @Override
    public List<User> querUserListBypage(User user,PageModel pageModel) {

        //查询当前数据库总条数
        int total= userDao.queryUserCount(user);
        pageModel.setTotalRecordSum(total);
        //查询当前页的 list集合
        List<User> list =  userDao.queryUserListByPage(pageModel,user);
        return list;
    }

    @Override
    public void saveUser(User user) {
        int i = userDao.saveUser(user);
        if(i>0){
            System.out.println("保存成功");
        }
    }

    @Override
    public User getUserById(int parseInt) {
        return userDao.getUserById(parseInt);
    }

    @Override
    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Override
    public void delbyid(Integer id) {
        userDao.delbyid(id);
    }

    @Override
    public void deleteAll(String[] userIds) {

        for (String userId : userIds) {
            userDao.delbyid(Integer.parseInt(userId));
        }
    }

    @Override
    public User findUserByLogin(String loginname, String password) {
        // TODO Auto-generated method stub
        boolean isLogin = false;
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        User outUser = userDao.findUserByLogin(user);
        return outUser;
    }
}
