package com.gec.hrmsys.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cr
 * @date 2023年12月11日 20:43
 * @description 用户实体类
 */
public class User implements Serializable {
    private Integer id;
    private String loginname;
    private String password;
    private Integer status;
    private Date createDate;
    private String username;

    public User() {
    }

    public User(Integer id, String loginname, String password, Integer status, Date createDate, String username) {
        this.id = id;
        this.loginname = loginname;
        this.password = password;
        this.status = status;
        this.createDate = createDate;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                ", username='" + username + '\'' +
                '}';
    }
}
//getter setter  toString略