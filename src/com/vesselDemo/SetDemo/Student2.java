package com.vesselDemo.SetDemo;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private Double ChineseScores;
    private Double MathScores;
    private Double EnglishScores;

    @Override
    public int compareTo(Student2 o) {
        double thisSum = this.getChineseScores() + this.getMathScores() + this.getEnglishScores();
        double osum = o.getChineseScores() + o.getMathScores() + o.getEnglishScores();
        //比较总分
        double i =  osum-thisSum ;
        //如果总成绩相同按照语文成绩
        i = i == 0 ? o.getChineseScores() - this.getChineseScores() : i;
        //按照数学
        i = i == 0 ? this.getMathScores() - o.getMathScores() : i;
        //按照英语，
        i = i == 0 ? this.getEnglishScores() - o.getEnglishScores() : i;
        //按照年龄
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //按照年龄首字母
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        if (i > 0) {
            return 1;
        } else if (i < 0) {
            return -1;
        } else {
            return 0;
        }

    }

    public Student2() {
    }

    public Student2(String name, int age, Double ChineseScores, Double MathScores, Double EnglishScores) {
        this.name = name;
        this.age = age;
        this.ChineseScores = ChineseScores;
        this.MathScores = MathScores;
        this.EnglishScores = EnglishScores;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return ChineseScores
     */
    public Double getChineseScores() {
        return ChineseScores;
    }

    /**
     * 设置
     *
     * @param ChineseScores
     */
    public void setChineseScores(Double ChineseScores) {
        this.ChineseScores = ChineseScores;
    }

    /**
     * 获取
     *
     * @return MathScores
     */
    public Double getMathScores() {
        return MathScores;
    }

    /**
     * 设置
     *
     * @param MathScores
     */
    public void setMathScores(Double MathScores) {
        this.MathScores = MathScores;
    }

    /**
     * 获取
     *
     * @return EnglishScores
     */
    public Double getEnglishScores() {
        return EnglishScores;
    }

    /**
     * 设置
     *
     * @param EnglishScores
     */
    public void setEnglishScores(Double EnglishScores) {
        this.EnglishScores = EnglishScores;
    }

    public String toString() {
        double sum = ChineseScores + MathScores + EnglishScores;
        return "Student2{name = " + name + ", age = " + age + ", ChineseScores = " + ChineseScores + ", MathScores = " + MathScores + ", EnglishScores = " + EnglishScores +", Sum = " + sum + "}";
    }


}
