package com.zzh.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class MyPrototypea implements a {
    @Override
    public void say() {
        System.out.println("方法MyPrototypea执行");
    }
}
