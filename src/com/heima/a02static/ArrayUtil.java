package com.heima.a02static;

public class ArrayUtil {
    //私有化
    private ArrayUtil(){}
    //返回整数数组内容
    public static String printArr(int arr[]){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //返回平均值
    public static double getAverage(double arr[]){
        double he=0;
        for (int i = 0; i < arr.length; i++) {
            he+=arr[i];
        }
        return he/ arr.length;
    }

    //
}
