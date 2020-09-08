package com.zzh.annocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//表明这个注解只会在运行时才会生效
@Retention(RetentionPolicy.RUNTIME)
//表明这个注解是作用在方法上的
@Target(value = ElementType.METHOD)
public @interface BeforeCustom {
}
