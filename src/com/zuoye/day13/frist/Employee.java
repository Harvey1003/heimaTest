package com.zuoye.day13.frist;

public  class Employee {
/* �ں������Ա���кܶ�Ա��(Employee)��
���չ������ݲ�ͬ�ֽ��в�Ա��(Teacher)��������Ա��(AdminStaff)
1. ���в����ݽ�ѧ�ķ�ʽ��ͬ�ַ�Ϊ��ʦ(Lecturer)������(Tutor)
2. ���������ݸ������ͬ,�ַ�Ϊά��רԱ(Maintainer),�ɹ�רԱ(Buyer)
3. ��˾��ÿһ��Ա�������,�������为��Ĺ���
4. ÿ��Ա�����й����Ĺ��ܣ����Ǿ���Ĺ��������ֲ�һ����*/
    private String name;
    private String id;
    public  void work(){
        System.out.println("work");
    }

    public Employee() {
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
