package com.cc.demo01;

public class Client {

    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介添加一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
