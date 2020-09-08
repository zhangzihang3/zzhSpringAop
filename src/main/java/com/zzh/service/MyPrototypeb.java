package com.zzh.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class MyPrototypeb implements b {
    @Override
    public void say() {
        System.out.println("方法MyPrototypeb执行");
    }
}
