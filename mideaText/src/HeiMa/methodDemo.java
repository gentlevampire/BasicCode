package HeiMa;

//import java.util.Scanner;

//public class methodDemo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//    method(number);
//    }
//    public static void method (int num){
//        if (num%2 == 0 ){
//            System.out.println("偶数");
//        } else{
//            System.out.println("奇数");
//        }
//    }
//}
//==================================================================
//public class methodDemo{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int first = sc.nextInt();
//        Scanner sc2 = new Scanner(System.in);
//        int second = sc2.nextInt();
//        maxmin(first,second);
//    }
//    public static void maxmin(int a,int b){
//        if (a>b){
//            System.out.println("max:"+a);
//        }else{
//            System.out.println("max:"+b);
//        }
//    }
//}
//=========带返回值方法定义和调用（掌握）============================================================
public class methodDemo{
    public static void main(String[] args) {
        int a=method(11);
        System.out.println(a);
    }
    public static int method(int num){
        if (num%2 == 0 ){
            System.out.println("偶数");
            return 0;
        } else{
            System.out.println("奇数");
            return 1;
        }
    }
}










