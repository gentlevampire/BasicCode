package HeiMa;

public class private1 {
    String name;
    private int age;

    public void setAge(int a) {
        if(a<0 || a>120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }
//    ^^^^上面的方法，不可以赋值操作，如int a =me.setAge(18);
//    public int setAge(int num){
//        age = num;
//        return age;
//    }
//    ^^^^^int age = me.setAge(18);上面操作可以进行此操作
    public int  getAge(){
        return age;
    }
    public void about(){
        System.out.println("您永远年轻！");
    }
}
