package HeiMa;

public class student {
    private String name;
    private int age;
    //构造方法
    public student() {
        System.out.println("无参构造");
    }
    public void show() {
        System.out.println(name + age);
    }
    public student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("我是Student类的构造方法");
    }
}
