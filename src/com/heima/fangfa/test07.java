package com.heima.fangfa;
public class test07 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 11, 66, 9786, 96};
        System.out.println(getMax(arr));
        System.out.println(get(arr, 66));
        int[] ints = copyOfRange(arr, 2, 5);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    //返回数组最大值方法
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean get(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    //从from到to复制到新数组
    public static int[] copyOfRange(int[] arr ,int from ,int to){
        //需要用静态初始化
        int[] arr2=new int[to-from];
int index=from;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr[index];
            index++;
        }
        return arr2;

    }
}