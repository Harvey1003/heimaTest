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
        //�Ƚ��ܷ�
        double i =  osum-thisSum ;
        //����ܳɼ���ͬ�������ĳɼ�
        i = i == 0 ? o.getChineseScores() - this.getChineseScores() : i;
        //������ѧ
        i = i == 0 ? this.getMathScores() - o.getMathScores() : i;
        //����Ӣ�
        i = i == 0 ? this.getEnglishScores() - o.getEnglishScores() : i;
        //��������
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //������������ĸ
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
     * ��ȡ
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     *
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
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * ��ȡ
     *
     * @return ChineseScores
     */
    public Double getChineseScores() {
        return ChineseScores;
    }

    /**
     * ����
     *
     * @param ChineseScores
     */
    public void setChineseScores(Double ChineseScores) {
        this.ChineseScores = ChineseScores;
    }

    /**
     * ��ȡ
     *
     * @return MathScores
     */
    public Double getMathScores() {
        return MathScores;
    }

    /**
     * ����
     *
     * @param MathScores
     */
    public void setMathScores(Double MathScores) {
        this.MathScores = MathScores;
    }

    /**
     * ��ȡ
     *
     * @return EnglishScores
     */
    public Double getEnglishScores() {
        return EnglishScores;
    }

    /**
     * ����
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
