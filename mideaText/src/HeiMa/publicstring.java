package HeiMa;

public class publicstring {
    public static void main(String[] args) {
        // public String() : 创建一个空白字符串对象，不含有任何内容
        //上面这个是类，不用进行导包
        String s1 = new String();
        System.out.println(s1);
        // public String(char[] chs) : 根据字符数组的内容，来创建字符串对象
        //这些都是已经创建好的类，不要进行导包。
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);
        // public String(String original) : 根据传入的字符串内容，来创建字符串对象
        //这个也是同理。
        String s3 = new String("123");
        System.out.println(s3);
    }
}
