package com.APIDemo.MathDemo;


import java.util.Objects;
import java.util.StringJoiner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int [] score;


    public Student() {
    }

    public Student(String name, int age, String gender, int[] score) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * ��ȡ
     * @return score
     */
    public int[] getScore() {
        return score;
    }

    /**
     * ����
     * @param score
     */
    public void setScore(int[] score) {
        this.score = score;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", score = " + printString(score) + "}";
    }
    public String printString(int [] score){
        StringJoiner js = new StringJoiner(",","[","]");
        for (int i = 0; i < score.length; i++) {
            js.add(score[i]+"");
        }

        return js.toString();
    }
}
