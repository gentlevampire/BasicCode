package HeiMa;

import java.util.Scanner;

public class shuzu {
//    public static void main(String[] args){
//    int[] arr = new int[3];//没有数据时会有黄色警告
//    arr[0] = 100;
//    System.out.println(arr[0]);
//    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<6;i++){
            System.out.println("请输入第"+(i+1)+"位评委的评分：");
            int score = sc.nextInt();
//            for (i=0;i<arr.length;i++){
                if(score>=0&&score<=100){
                    arr[i] = score;
                }else{
                    System.out.println("抱歉您输入的数据有误，请重新输入~");
                    i= i-1;
                }
//            }
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        sum = sum -max-min;
        System.out.println(sum/4);
    }
}
