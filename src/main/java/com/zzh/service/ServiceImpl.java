package com.zzh.service;

import com.zzh.annocation.BeforeCustom;
import com.zzh.service.IService;
import org.springframework.stereotype.Repository;


@Repository
public class ServiceImpl implements IService {

    public void eat(String food) {
        System.out.println("吃: " + food);
    }
    public Object args1(int args) {
        System.out.println("args1方法的参数为： " + args);
        return "args1执行了";
    }

    @Override
    public Object args2(int args1, String args2) {
        System.out.println("args2方法的参数为： " + args1+"|"+args2);
        return "args2执行了";
    }

    /**
     * @param
     * @method 自定义注解
     */
    @BeforeCustom
    public void methodA(String food) {
        System.out.println("吃: " + food);
    }
}
