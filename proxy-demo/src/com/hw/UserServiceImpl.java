package com.hw;


public class UserServiceImpl implements UserService{
    private String name;

    public UserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void addUser() {
        System.out.println("增加用户: " + name);
    }
    @Override
    public void editUser() {
        System.out.println("编辑用户: " + name);
    }
}
