package HeiMa;

public class shuzu2 {
    public static void main(String[] args) {
//===============数组反转==============
//        int[] a ={10,20,30,40,50};
//        int start = 0;
//        int end = a.length-1;
//        for (;start<end;start++,end--){
//            int c = a[start];
//            a[start]= a[end];
//            a[end] = c;
//
//        }
//        for (int j : a) {
//            System.out.println(j);
////            for (int i = 0; i < a.length; i++) {
////                System.out.println(a[i]);
////            一样的
//        }
//================================二维数组遍历
//        int[][] a = {{10,20,30},{40,50,60}};
//        for (int[] ints : a) {
//            for (int anInt : ints) {
//                System.out.println(anInt);
////                for (int i =0;i<a.length;i++){
////                    for(int j =0;j<a[i].length;j++){
////                        System.out.println(a[i][j]);
////                一样的
//            }
//
//        }
    int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum+arr[i][j];
            }
            System.out.println("第"+(i+1)+"季度："+sum);
        }
    }


}
