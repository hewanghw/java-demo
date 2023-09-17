package com.hw;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemoB {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl("张三");
        UserService userService1 = new UserServiceImpl("李四");

//       InvocationHandler userServiceInvocationHandler = new UserServiceInvocationHandler(userService);

//        UserService enhancedUserService = (UserService)Proxy.newProxyInstance(
//                ProxyDemoB.class.getClassLoader(),
//                new Class[]{UserService.class},
//                userServiceInvocationHandler
//        );



        UserService enhancedUserService = (UserService)Proxy.newProxyInstance(
                ProxyDemoB.class.getClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行方法: " + method.getName());
                        Object invoke = method.invoke(userService);
                        return invoke;
                    }
                }
        );
        enhancedUserService.addUser();

    }
}
