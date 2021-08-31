package HeiMa;

public class jinzhi {
    public static void main(String[] args) {
//        System.out.println(6 & 2);//2
//        System.out.println(~6);//-7
//        ~ 取反 : 全部取反, 0变1, 1变0  (也包括符号位)
//
//        00000000 00000000 00000000 00000110         // 6的二进制补码
//        ~ 11111111 11111111 11111111 11111001
//
//                -                                   1         // -1求反码
//                ------------------------------------
//        11111111 11111111 11111111 11111000         // 反码推原码
//
//        10000000 00000000 00000000 00000111         // -7
//====================数据交换1111111==================
//        int a = 10;
//        int b = 20;
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println(a);
//        System.out.println(b);
//====================数据交换22222222=====================
//        int a= 10;
//        int b = 20;
//        a = a^b;//10^20
//        b = a^b;//b=10    10^20^20
//        a = a^b;//10^20^10
//        System.out.println(a);
//        System.out.println(b);
//            System.out.println(6 & 2);
            System.out.println(~31);
    }
}
