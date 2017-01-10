package net.gamedo.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/1/10 0010.
 * 自定义注解
 */
@Target(ElementType.METHOD)  //注解修饰的范围ElementType.METHOD  方法
@Retention(RetentionPolicy.RUNTIME)//注解保存的时间。目前设置的是运行状态
public @interface reflectdemo {
    int size() default 10;
    int age() default 10;
}
