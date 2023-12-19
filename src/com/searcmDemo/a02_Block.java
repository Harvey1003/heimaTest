package com.searcmDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class a02_Block {
    public static void main(String[] args) {
        int[] arr = {22, 27, 30, 40, 36,
                    13, 19, 16, 20,
                    7, 10,
                    43, 50, 45};
        Block b1= new Block(22,40,0,4);
        Block b2= new Block(13,20,5,8);
        Block b3= new Block(7,10,9,10);
        Block b4= new Block(43,50,11,13);
        ArrayList<Block> blocks = new ArrayList<>();
        blocks.add(b1);
        blocks.add(b2);
        blocks.add(b3);
        blocks.add(b4);
        //System.out.println(getBlockIndex(blocks, 7));
        System.out.println(getIndex(blocks, arr,7));
    }
    public static int getIndex(ArrayList<Block> blocks,int[] arr,int number){
        int blockIndex = getBlockIndex(blocks, number);
        if (blockIndex==-1){
            System.out.println("没有数据");
            return -1;
        }
        Block block = blocks.get(blockIndex);
        for (int i = block.startIndex; i <= block.endIndex; i++) {
            if(number==arr[i]){
                return i;
            }
        }

        return -1;
    }

    public static int getBlockIndex(ArrayList<Block> blocks, int number) {
        for (int i = 0; i < blocks.size(); i++) {
            int min = blocks.get(i).getMin();
            int max = blocks.get(i).getMax();
            if (number <=max && number >=min){
                return i;
            }
        }
        return -1;
    }
}

class Block {
    int min;
    int max;
    int startIndex;
    int endIndex;

    public Block() {
    }

    public Block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
