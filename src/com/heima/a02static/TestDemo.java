package com.heima.a02static;

public class TestDemo {
    public static void main(String[] args) {
        int [] arr={2,412,123,2141,21312};
        double [] arr2={2,412,123,2141,21312};
        System.out.println(ArrayUtil.printArr(arr));
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
