package com.heima.stringDemo.stringBuider;

public class stringBuiderDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

    }
    public static String arrtostring(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ,");
            }
            sb.append("]");
            }
        return sb.toString();
    }
}
