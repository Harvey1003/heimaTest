package com.algorithmDemo.LambdaDemo;

public class Girl {
    private String name;
    private int age;
    private double height;

    public Girl() {
    }

    public Girl(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * ��ȡ
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * ����
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Girl{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
