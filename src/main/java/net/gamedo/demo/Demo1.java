package net.gamedo.demo;

/**
 * Created by Administrator on 2017/1/10 0010.
 */

/**
 * 1.什么是反射：对于Java程序，要使程序能够运行，那么就得让Java类要被Java虚拟机加载。Java类如果不被Java虚拟机加载，
 * 是不能正常运行的。现在我们运行的所有的程序都是在编译期的时候就已经知道了你所需要的那个类的已经被加载了。
 Java的反射机制是在编译并不确定是哪个类被加载了，而是在程序运行的时候才加载、探知、自审。使用在编译期并不知道的类。这样的特点就是反射。

 2.Java虚拟机动态获取类的信息以及动态调用对象的方法的功能就是java语言的反射

 3.反射机制主要提供了以下功能：
        在运行时获取任意一个对象所属的类；
        在运行时构造任意一个类的对象；
        在运行时获取任意一个类所具有的成员变量和方法；
        在运行时调用任意一个对象的方法；
        生成动态代理。
 */


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 1.通过类的实例，获取class 对象。进而获取类的包名+类名
 * 2. 获取注解的名称：获取注解的属性值
 */
public class Demo1 {
    @reflectdemo(age = 20)
    public static void main(String args[]){
        Demo1 demo1=new Demo1();
        Class c=demo1.getClass();
        System.out.println("包名: "+c.getPackage().getName());
        System.out.println("类名: "+c.getName());
        try {
            Method method=c.getDeclaredMethod("main",String[].class);
            Annotation[] annotation=method.getAnnotations();
            for (int i=0;i<annotation.length;i++){
                if (annotation[i].annotationType().equals(reflectdemo.class)){//判断当前的注解  和自己定义的注解是否相同
                    System.out.println("当前注解和自定义的注解一样，通过equals相等问题");
                    try {
                        reflectdemo r= (reflectdemo) annotation[i];//将annotation 对象直接 转换成  注解对象
                        System.out.println(r.age());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(annotation[i].annotationType().getName());// 获取注解的 包名+ 注解名称
            }
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
