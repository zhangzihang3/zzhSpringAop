package com.zzh.aspect;

import com.zzh.service.ServiceImpl;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 张子行
 * @class
 */
//perthis只有代理对象的类型是IService，才会为其创建切面，aop才会生效
@Aspect("perthis(this(com.zzh.service.a))")
@Scope("prototype")
//@Aspect
@Component
public class aspect2 {
//    //代理对象为ServiceImpl类型aop才生效
//    @Pointcut("this(com.zzh.service.ServiceImpl)")
//    public void point() {
//    }
//    @Before("point()")
//    public void test() {
//        System.out.println("before");
//    }


//    //代理对象为IService类型aop才生效
//    @Pointcut("this(com.zzh.service.IService)")
//    public void point2() {
//    }
//
//    @Before("point2()")
//    public void test() {
//        System.out.println("before");
//    }


//    //目标对象为IService类型aop才生效
//    @Pointcut("target(com.zzh.service.IService)")
//    public void point2() {
//    }
//
//    @Before("point2()")
//    public void test() {
//        System.out.println("before");
//    }


//    //目标对象为ServiceImpl类型aop才生效
//    @Pointcut("target(com.zzh.service.ServiceImpl)")
//    public void point2() {
//    }
//
//    @Before("point2()")
//    public void test() {
//        System.out.println("before");
//    }


//    //被此注解标注aop会生效
//    @Pointcut("@annotation(com.zzh.annocation.BeforeCustom)")
//    public void point2() {
//    }
//
//    @Before("point2()")
//    public void test() {
//        System.out.println("注解生效了");
//    }


//    /**
//     * @param
//     * @method 带返回值的环绕通知
//     */
//    @Around(value = "execution(* com.zzh.service.*.*(..))&&args(args1,args2)")
//    public Object a(ProceedingJoinPoint proceedingJoinPoint, int args1, String args2) throws Throwable {
//        //修改执行参数
//        Object[] objects = {111, "222"};
//        Object proceed = proceedingJoinPoint.proceed(objects);
//        //Object proceed = proceedingJoinPoint.proceed();
//        for (int i = 0; i < proceedingJoinPoint.getArgs().length; i++) {
//            System.out.println("被代理的方法是：" + proceedingJoinPoint.getSignature().getName() + "的参数：" + proceedingJoinPoint.getArgs()[i] + "方法的返回值：" + proceed);
//
//        }
//        return "返回值被修改了，嘿嘿你气不气";
//    }


//    /**
//     * @param
//     * @method 带返回值的AfterReturning,MyReturn就是方法执行之后的结果
//     */
//    @AfterReturning(value = "execution(* com.zzh.service.*.*(..))&&args(args1,args2)", returning = "MyReturn")
//    public Object a(JoinPoint joinPoint, int args1, String args2, Object MyReturn) throws Throwable {
//        System.out.println(MyReturn);
//        return "返回值被修改了，嘿嘿你气不气";
//    }

//    @Before("within(com.zzh.service.*)")
//    public void a(JoinPoint joinPoint) throws Throwable {
//        System.out.println("前置通知");
//    }

//    @Before("within(com.zzh.service.*)")
//    public void a(JoinPoint joinPoint) throws Throwable {
//        System.out.println("aop生效");
//    }
//
//    public aspect2() {
//        System.out.println("切面创建成功："+this.hashCode());
//    }


    @DeclareParents(value = "com.zzh.service.ImplPerson", defaultImpl = ServiceImpl.class)
    com.zzh.service.IService Iservice;
}
