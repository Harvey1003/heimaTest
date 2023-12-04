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

```java
    public static void login(ArrayList<User> users) {
        //录入账号判断是否存在
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名：");
        String username = sc.next();
        int index = nameinof(users, username);
        if (index == -1) {
            System.out.println("账号不存在，请注册");
            return;
        }
        //录入密码,有三次输入机会
        //
        for (int i = 0; i < 3; i++) {
            System.out.print("输入密码：");
            String password = sc.next();
            //获取一个验证码，随机
            String code = getCode();
            System.out.println("验证码是：" + code);
            //录入验证码
            System.out.print("请输入验证码：");
            String yzm2 = sc.next();
            if (code.equalsIgnoreCase(yzm2)) {
                //验证成功则跳出循环
            } else {
                System.out.println("验证码错误,重新输入");
            }
            if (users.get(index).getPassword().equals(password)) {
                break;
            } else {
                if (i == 2) {
                    System.out.println("密码错误次数过多，稍等再试");
                    return;
                }
                System.out.println("请输入正确的密码，您还有" + (2 - i) + "次机会。");
            }
        }

        //登录成功
        System.out.println("登录成功！");
        //创建对象，启动方法。
        StudentDemo sd = new StudentDemo();
        sd.startSystem();

    }

```



#### 忘记密码

1.录入用户名，如果不存在提示未注册

2.验证身份证号和手机号，

3.输入密码

```java
    public static void setPassword(ArrayList<User> users) {
        //1.录入用户名，如果不存在提示未注册
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名：");
        String username = sc.next();
        int index = nameinof(users, username);
        if (index == -1) {
            System.out.println("账号不存在，请注册");
            return;
        }
        //2.验证身份证号和手机号，
        //
        System.out.print("Please input personid：");
        String personid1 = sc.next();
        System.out.print("Please input PhoneNumber：");
        String PhoneNumber1 = sc.next();
        String personid = users.get(index).getPersonid();
        String PhoneNumber = users.get(index).getPhoneNumber();
        if (!(personid.equalsIgnoreCase(personid1) && PhoneNumber.equals(PhoneNumber1))) {
            System.out.println("验证失败，请重试");
            return;
        }
        String password;
        while (true) {
            System.out.print("验证通过，请输入新密码:");
             password = sc.next();
            System.out.print("请再次输入密码：");
            String againpassword = sc.next();
            if (password.equals(againpassword)){
                break;
            }else {
                System.out.println("两次密码不一致，请重新输入；");
                continue;
            }
        }
        //3.输入密码
        users.get(index).setPassword(password);


    }

```

#### 其他方法

```java
//手机号格式判断
    public static boolean number(String phonenumber) {
        int length = phonenumber.length();
        //不能为空
        if (phonenumber == null) {
            return false;
        }
        //必须11位
        if (length != 11) {
            return false;
        }
        //首位不能为0
        if (phonenumber.charAt(0) == '0') {
            return false;
        }
        //必须全是数字
        for (int i = 0; i < length; i++) {
            char c = phonenumber.charAt(i);
            if (c >= '0' && c <= '9') {
            } else {
                return false;
            }
        }
        return true;
    }

    //判断字符串再集合中是否存在，存在返回索引，不存在返回-1
    public static int nameinof(ArrayList<User> users, String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name)) {
                return i;
            }
        }
        return -1;
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

    //获取验证码
    public static String getCode() {
        ArrayList<Character> chats = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chats.add((char) ('a' + i));
            chats.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(chats.size());
            sb.append(chats.get(i1));
        }

        //任意位置添加数字
        int i = random.nextInt(10);
        sb.append(i);
        char[] charArray = sb.toString().toCharArray();
        //随机索引
        int randomindex = random.nextInt(charArray.length);
        char c = charArray[randomindex];
        //char c1 = charArray[charArray.length];
        charArray[randomindex] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = c;

        return new String(charArray);
    }
```

# 面向对象

## 1.static静态

#### 1.静态变量

被static修饰的成员变量叫静态变量，被该类的虽有对象共享。不属于对象属于类

类名调用

哪些属性适合被静态修饰？

可以共享的成员变量。

#### 2.静态方法

被static修饰的成员方法叫静态方法

特点：多用在测试类和工具类中；

类名调用

##### 1.JavaBean类

JavaBean类用来描述一些事务的类。比如，student，dog，cat等；

##### 2.测试类

用来检查其他的类是否书写正确，带有main方法的类，是程序的入口。

##### 3.工具类

是帮我们做一些事情，但是不描述任何事物的类。

类名见名知意；私有化构造方法（为了让外界不能创建对象）；方法定义为静态。

#### static的注意事项

静态方法中只能访问静态变量和静态方法；

非静态方法可以访问所有；

静态方法中没有this关键字。

## 2.封装

## 3.继承

#### 1.什么时候用继承?

类跟类之间存在相同的内容，并满足子类是父类中的一种，就可以考虑继承。

#### 2.继承的特点

Java只支持单继承，不支持多继承，但支持多层继承（间接父类：父类的父类）。

Java中所有的类都直接或间接继承Object类。

子类只能继承父类中非私有的成员（public）。

#### 3.子类能继承父类中的哪些内容？

|          | 非私有 | private      |
| -------- | ------ | ------------ |
| 构造方法 | 不能   | 不能         |
| 成员变量 | 能     | 能（能继承） |
| 成员方法 | 能     | 不能         |

父类中的私有成员变量，不能直接调用。需要用get、set

#### 4.成员变量的访问特点

1.就近原则：先在局部位置找，本类成员位置找，父类成员位置找，逐级往上。

2.如果遇到重名的情况，this、super

```java
public class fu{
    String name="fu";
}
class zi extends fu{
    String name="zi";
    public void ziShow(){
        String name="ziShow";
        System.out.println(name);//打印的"ziShow"
        System.out.println(this.name);//打印的"zi"，this调用局部变量
        System.out.println(super.name);//打印的"fu"，super调用父类中的成员变量
    }
}

```

#### 5.方法的重写：

1.当父类的方法不能满足子类的需求时，需要进行方法重写。

2.重写的要求：

​	重写的方法与父类方法命名、形参列表必须一致；

​	子类访问权限必须大于等于父类；

​	子类返回值类型必须小于等于父类；

​	尽量保持一致；

​	只有被添加到虚方法表中的方法才能被重写（私有的方法不能）。

3.@Override重写注解

4.如果发生了重写，则会覆盖（虚方法表里的方法会被覆盖），影响本类和后面的子类，不影响父类。

5.继承中成员方法的的访问特点：this调用：就近原则；super调用：直接找父类。

#### 6.构造方法的访问特点

1.子类不能继承父类的构造方法，但是可以通过super调用；

2.子类构造方法第一行有个默认的super()，调用的是父类的空参构造；

3.默认先访问父类中无参的构造方法，再执行自己的；

4.如果想要访问父类有参构造，必须手动书写。

```java
public class test {
    String name;
    int age;
    public test() {
    }

    public test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ziclass extends test {
    public ziclass() {
        //默认访问父类空参，可不写
        super();
    }

    public ziclass(String name, int age) {
        super(name, age);
    }
}
```

#### this、super使用总结

this：理解为一个变量，表示当前方法调用者的地址值；

super：代表父类的存储空间。

| 关键字 | 访问成员变量                         | 访问成员方法                              | 访问构造方法                     |
| ------ | ------------------------------------ | ----------------------------------------- | -------------------------------- |
| this   | this.成员变量<br />访问本类成员变量  | this.成员方法(...)<br />访问本类成员方法  | this(...)<br />访问本类构造方法  |
| super  | super.成员变量<br />访问父类成员变量 | super.成员方法(...)<br />访问父类成员方法 | super(...)<br />访问父类构造方法 |

## 4.多态

什么是多态？同类型的对象，表现出的不同形态。

多态的前提：1，有继承关系；2，有父类引用指向子类对象；3，有方法重写。

多态的好处：使用父类型作为参数，可以接收所有子类对象。

#### 1.多态调用成员的特点

调用成员变量：编译看左边，运行看左边。

调用成员方法：编译看左边，运行看右边。

#### 2.多态的优势

在多态形势下，右边对象可实现解耦合，便于维护和拓展。

```java
Person p=new Student();

p.work;//业务逻辑发生改变的时候，无需改变后续代码直接改右边。


```

定义方法的时候，使用父类型作为参数，可以接收所有子类对象，体现多态的拓展性与便利。

#### 3.多态的弊端

不能访问子类特有的功能

强转类型转换能解决什么问题？访问子类特有功能

```java
public class test {
    public static void main(String[] args) {
        Animal dog = new dog();
        dog.eat();
        Animal cat = new cat();

        //多态弊端：不能访问子类特有的功能
        //dog.lookhome
        //cat.catchMouse();
        //解决方法：
        //先判断dog是否为dog类型，如果是，则强转dog,并赋值给a
        if (dog instanceof dog a) {
            a.lookhome();
        } else if (cat instanceof cat b) {
            b.catchMouse();
        } else {
            System.out.println("没有");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("animal eat");
    }

}

class dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃剩饭");
    }

    public void lookhome() {
        System.out.println("狗看家");
    }
}

class cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}
```

## 5.包

包名的规则：公司域名反写+包的作用，需要全部小写，见名知意。

使用其他类的规则:

​	使用同一个类时，使用java.lang包中的类时，不需要导包。

​	其他都需要导包。

​	如果同时使用两个包中的同名类，需要用全类名。

## 6.final 最终的

修饰的方法，不能被重写；

修饰的类，不能被继承；

修饰的变量，叫做常量，是能赋值一次。

​		修饰的基本数据类型，记录的值不能发生改变

​		修饰的引用数据类型，地址值不能改变，内部的属性可以改变。

## 7.权限修饰符

|      修饰符      | 同一个类中 | 同包其他类 | 不同包下的子类 | 不同包下的无关类 |
| :--------------: | :--------: | :--------: | :------------: | :--------------: |
|     private      |     √      |            |                |                  |
| 空着不写（默认） |     √      |     √      |                |                  |
|    protected     |     √      |     √      |       √        |                  |
|      public      |     √      |     √      |       √        |        √         |

