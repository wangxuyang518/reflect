package net.gamedo.demo;

/**
 * Created by Administrator on 2017/1/10 0010.
 * .获得对象实例
 */
public class Demo3 {
    public static void main(String args[]){
        try {
            Class cl=Class.forName("net.gamedo.demo.Demo2");
            Demo2 demo2= (Demo2) cl.newInstance();//生成该class的实例
            demo2.setAge(20);
            System.out.println(demo2.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
