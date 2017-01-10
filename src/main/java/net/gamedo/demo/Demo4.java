package net.gamedo.demo;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/1/10 0010.
 * 通过反射调用方法
 */
public class Demo4 {
    public static void main(String args[]){
        try {
            Class cl=Class.forName("net.gamedo.demo.Demo2");
            Method method=cl.getDeclaredMethod("setAge",int.class);//通过反射找到 对应的方法。
            Object object=cl.newInstance();//通过反射获取class 的对象
            method.invoke(object,30);
            Demo2 demo2= (Demo2) object;
            System.out.println(demo2.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
