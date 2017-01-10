package net.gamedo.demo;

/**
 * Created by Administrator on 2017/1/10 0010.
 *
 * 博客：http://blog.csdn.net/a396901990/article/details/24992283   代码实现
 */
public class Demo2 {
    /**
     * 如何获取Class对象的3中方法
     * @param args
     */
    public static void main(String args[]){
        try {
            Class cl1=Class.forName("net.gamedo.demo.Demo1");
            Class cl2=Demo1.class;
            Class cl3=new Demo1().getClass();
            System.out.println(cl1.getName());
            System.out.println(cl2.getName());
            System.out.println(cl3.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
