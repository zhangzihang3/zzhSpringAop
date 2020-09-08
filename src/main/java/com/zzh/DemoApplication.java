package com.zzh;

import com.zzh.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
@ComponentScan({"com.zzh"})
public class DemoApplication {

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(DemoApplication.class);
//        IService bean = (IService)c.getBean("serviceImpl");
//        //ServiceImpl bean = (ServiceImpl)c.getBean("serviceImpl");
//        //bean.eat("肉");
//        //bean.methodA("肉");
//        System.out.println(bean.args2(666,"888"));
//
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoApplication.class);
////        b a1 = (b) ac.getBean("myPrototypeb");
////        a1.say();
////
////        b a2 = (b) ac.getBean("myPrototypeb");
////        a2.say();
//
//        a a1 = (a) ac.getBean("myPrototypea");
//        a1.say();
//
//        a a2 = (a) ac.getBean("myPrototypea");
//        a2.say();
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoApplication.class);
        IService bean = (IService)ac.getBean("implPerson");
        bean.args1(666);
    }
}
