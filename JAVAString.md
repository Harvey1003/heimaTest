# String（API）

### 1.string.substring()截取，包头不包尾

案例身份证号码截取出生日期，性别等

```java
		String id = "412723200010033826";
		String year=id.substring(6,10);
 public static boolean idNum(String id) {
        if (id == null) {
            return false;
        }
        if (id.length() != 18) {
            return false;
        }
        //判断第一位是否为零
        if (id.startsWith("0")) {
            return false;
        }

        for (int i = 1; i < id.length(); i++) {
            //string.charAt此方法返回的是char类型
            char c = id.charAt(i);
            //判断最后一位是否是除了X和数字
            if (i == id.length() - 1) {
                if (c < '0' || c > '9' && c != 'X') {
                    return false;
                }
            } else {
                //其他位数字判断
                if (c < '0' || c > '9') {
                    return false;
                }
            }
        }
        return true;
    }
```

ascii码的灵活运用

### 2.string.replace()代替

案例敏感字屏蔽

```java
		String talk="what the fuck,cnm";
		String[] arr={"fuck","cnm"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);//
```

## 一.String Buider（用于字符串拼接，反转）

容器，内容可变，为了提升效率。打印对象不是地址值，而是属性值

四个常用方法

```java
        StringBuilder sb = new StringBuilder();//构造方法
        sb.append(1); //添加元素
        sb.append(23231);
        sb.append("app");
        System.out.println(sb);//123231app
        sb.reverse();//反转
        System.out.println(sb);//ppa132321
        int length = sb.length();//长度
        sb.toString();//变回string
```

案例比价对称字符串(字符串的反转)

```java
Scanner sc = new Scanner(System.in);
        System.out.print("输入字符串：");
        String s1 = sc.next();
		//链式编程
        String s = new StringBuilder().append(s1).reverse().toString();
        if (s1.equals(s) ) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
```

## 二.StringJoiner



```java
StringJoiner sj = new StringJoiner(",", "[", "]");//有参构造方法，分别是分割符，开始符，结束符
        sj.add("1").add("2").add("3");//添加元素方法
        int length = sj.length();//长度
        sj.toString();//变回string
        System.out.println(sj);
```

## 三.字符串原理

1.直接赋值回复用字符串常量池中的。new出来不回复用，而是开辟一个新空间。

2.==号比较：基本数据类型比较数据值，引用数据类型比较地址值。

## 四.综合练习

### 1.替换string中的数字为罗马数字

string.replace()方法，或者sb.append().

```java
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("input number:");
            str = scanner.next();
            if (checkStr(str)) {
                break;
            } else {
                System.out.println("输入错误重新输入");
                continue;
            }
        }
        //string.replace()方法
        String str2 = getString(str);
        //sb.append()方法
        String str1=getLuoMaStr(str);
        System.out.println(str1);
        System.out.println(str2);
    }
    private static String getLuomaNumber(int number){
        String[] luoma = {"Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return luoma[number];
    }
    private static String getLuoMaStr(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number=c-49;
            sb.append(getLuomaNumber(number));
        }

        return sb.toString();
    }
    private static String getString(String str) {
        String[] luma = {"Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < str.length(); i++) {
                str = str.replace(number[i], luma[i]);
        }
        return str;
    }

    public static boolean checkStr(String str) {
        if (str.length() >= 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
```

### 2.字符串旋转

```java
public class test2 {
    public static void main(String[] args) {
        //把a最左边的字符移到最右边，移若干次使得与b相同
        String a = "abcdef";
        String b = "cdefa";
        boolean cheak1 = cheak1(a, b);
        boolean cheak2 = cheak(a, b);
        System.out.println(cheak1);
        System.out.println(cheak2);

    }
    private static boolean cheak1(String a, String b) {
        for (int i = 0; i < a.length() - 1; i++) {
            a = extracted(a);
            if (a.equals(b)) {
                return true;
            }
        }
        return false;
    }
    private static boolean cheak(String a, String b) {
        for (int i = 0; i < a.length() - 1; i++) {
            a = extracted2(a);
            if (a.equals(b)) {
                return true;
            }
        }
        return false;
    }

    //case2:把字符串变成字符数组，
    private static String extracted2(String a) {
        char[] arr = a.toCharArray();
        char first = arr[0];
        for (int i = 1; i < a.length(); i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        return new String(arr);
    }

    //case1,sb拼接
    private static String extracted(String a) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < a.length(); i++) {
            sb.append(a.charAt(i));
        }
        sb.append(a.charAt(0));
        return sb.toString();
    }
}

```

### 3.打乱字符串

1、先用tochararray,

# ArrayList<>集合

## 1.基本使用

```java
        ArrayList<String> list = new ArrayList<>();
        //添加元素 返回值是布尔型
        list.add("aaa");
        list.add("aa");
        list.add("ab");
        //可以直接传数据，返回布尔
        list.remove("aa");
        //可以传索引,返回被删除的数据
        list.remove(2);
        //修改
        list.set(1,"bbb");//返回被覆盖的值
        //查询
        list.get(0);
        //获取长度,size()。list.fori自动遍历
        for (int i = 0; i < list.size(); i++) {
            list.get(i)
        }
```

## 2.基本数据类型的包装类

char—Character，int—Integer

## 3.添加学生对象，遍历

添加student类 JavaBean，定义集合。

```java
ArrayList<Student> student = new ArrayList<>();
        Student s1 = new Student("zhangshan",232);
        Student s2 = new Student("lisi",23);
        student.add(s1);
        student.add(s2);
        student.add(new Student("wangwu",21));
Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("输入姓名，年龄：");
            student.add(new Student(sc.next(), sc.nextInt()));
        }
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).getName()+","+student.get(i).getSex());
        }
```

用userid查找用户信息，如果存在返回索引，如不存在返回-1

```java
public static int contains(ArrayList<User> users, String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                //如果相同返回true，结束循环
                return i;
            }
        }
        //如果循环结束 没有找到返回false
        return -1;
    }
```

手机集合练习

```java
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("xiaomi", 1999.00));
        phones.add(new Phone("iphone", 5999.00));
        phones.add(new Phone("huawei", 6999.00));
        ArrayList<Phone> phoneinfo = getPhone(phones);
        for (int i = 0; i < phoneinfo.size(); i++) {
            System.out.println(phoneinfo.get(i).getBrand());
        }
    }

    //返回多个结果，用集合
    private static ArrayList<Phone> getPhone(ArrayList<Phone> phones) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            //手机价格大于2000的返回
            if (phones.get(i).getPrice() >= 2000.00) {
                resultList.add(phones.get(i));
            }
        }
        return resultList;
    }

```

## 4.学生管理系统

```java
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        //给循环命名 指定跳出
        loop:
        while (true) {
            System.out.println("-----STUDENT SYSTEM-----");
            System.out.println("1,添加学生");
            System.out.println("2,删除学生");
            System.out.println("3,修改学生");
            System.out.println("4,查询学生");
            System.out.println("5,退出");
            System.out.print("请输入选择：");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> addStudent(students);
                case 2 -> deletStudent(students);
                case 3 -> updateStudent(students);
                case 4 -> queryStudent(students);
                case 5 -> {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);//停止虚拟机运行

                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    private static void addStudent(ArrayList<Student> students) {
        System.out.println("添加学生:");
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入id：");
            id = sc.next();
            if (idinof(students, id) < 0) {
                break;
            } else {
                System.out.println("请重新输入id");
            }
        }
        System.out.print("请输入名字：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.print("请输入地址：");
        String add = sc.next();
        Student student = new Student(id, name, age, add);
        students.add(student);
    }

    //删除学生
    public static void deletStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的学生学号：");
        String id = sc.next();
        int index = idinof(students, id);
        if (index >= 0) {
            Student remove = students.remove(index);
            System.out.println(remove.getName() + "的信息已被删除");
        } else {
            System.out.println("该生不存在,请重新选择。");
            return;
        }

        //
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的学生学号：");
        String id = sc.next();
        int index = idinof(students, id);
        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        //获取需要修改的学生对象
        Student student = students.get(index);
        System.out.println("输入需要修改的学生姓名");
        student.setName(sc.next());
        System.out.println("输入需要修改的学生年龄");
        student.setAge(sc.nextInt());
        System.out.println("输入需要修改的学生家庭住址");
        student.setAdd(sc.next());
        System.out.println("信息修改成功！");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询。");
            return;
        }
        System.out.println("id\t姓名\t年龄\t地址");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAdd());
        }
    }

    //判断id是否与集合中重复,如果重复返回重复id的索引，不重复则返回-1
    public static int idinof(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
```

## 5.学生管理系统升级版

#### 用户注册：

1.用户名：

scanner录入username，

先到list集合中判读是否存在（idinof）

长度必须再3-15之间，用length（）

循环获得username的每个字符（charAt），如有比在a-z A-Z 0-9,则不符合条件返回重输，统计username中的英文字母大于等于0才满足要求；

2.确认密码，eq。两次一致符合要求

3.身份号要求：

4.手机号要求：11位纯数字，首个不能为0；

```java
public static void addname(ArrayList<User> users) {
        //用户名校验
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String username = sc.next();
        int length = username.length();
    	//判断用户名长度
        if (length < 3 || length > 15) {
            System.out.println("请输入3-15位字符,请重新输入");
            return;
        }
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    count++;
                }
            } else {
                System.out.println("请输入大小学英文字母和数字组成的用户名");
                return;
            }
        }
        if (count == 0) {
            System.out.println("不能使用纯数字");
            return;
        }
    	//确认密码
        System.out.println("输入密码：");
        String password1 = sc.next();
        System.out.println("确认密码：");
        String password2 = sc.next();
        if (password1.equals(password2)) {
        } else {
            System.out.println("密码错误重新输入");
            return;
        }
        System.out.println("输入身份证号：");
        String personid = sc.next();
    	//调用判断身份证号码格式方法
        if (idNum(personid)) {
        } else {
            System.out.println("身份证号码错误重新输入");
            return;
        }
        System.out.println("输入手机号：");
        String phonenumber = sc.next();
    	//	调用判断手机号格式方法
        if(number(phonenumber)){
        }else {
            System.out.println("手机号码错误重新输入");
            return;
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
    }
//手机号格式判断
public static boolean number(String phonenumber) {
        int length = phonenumber.length();
        //不能为空
        if(phonenumber==null){
            return false;
        }
        //必须11位
        if (length != 11) {
            return false;
        }
        //首位不能为0
        if (phonenumber.charAt(0)=='0'){
            return false;
        }
        //必须全是数字
        for (int i = 0; i < length; i++) {
            char c = phonenumber.charAt(i);
            if (c>='0'&&c<='9'){
            }else {
                return false;
            }
        }
        return true;
    }

    //身份证号格式判断
public static boolean idNum(String id) {
        if (id == null) {
            return false;
        }
        if (id.length() != 18) {
            return false;
        }
        //判断第一位是否为零
        if (id.startsWith("0")) {
            return false;
        }

        for (int i = 1; i < id.length(); i++) {
            //string.charAt此方法返回的是char类型
            char c = id.charAt(i);
            //判断最后一位是否是除了X和数字
            if (i == id.length() - 1) {
                if (c < '0' || c > '9' && c != 'X') {
                    return false;
                }
            } else {
                //其他位数字判断
                if (c < '0' || c > '9') {
                    return false;
                }
            }
        }
        return true;
    }
```



#### 登录

输入账号密码手机号，密码错误有三次机会

录入用户名，如果不存在提示未注册

录入密码

获取一个验证码

录入验证码

登录成功



#### 忘记密码

1.录入用户名，如果不存在提示未注册

2.验证身份证号和手机号，

3.输入密码
