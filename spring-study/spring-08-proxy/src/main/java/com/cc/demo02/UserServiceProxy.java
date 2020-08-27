package com.cc.demo02;

public class UserServiceProxy implements UserService{

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public UserServiceProxy() {
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("使用了"+msg+"方法");
    }
}
