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

## 8.代码块

构造代码块：

​	写在成员变量位置的代码块。

​	可以把多个构造方法中重复的代码抽取出来。

静态代码块：static{}

​	随着类的加载而加载的，并且自动触发，只触发一次。

## 9. 抽象类、抽象方法

#### 1.定义格式：

抽象类的作用：抽取共性时，无法确认方法体，就把方法定义为抽象的。

抽象类的定义：

public abstract 返回值类型 方法名(参数列表);

抽象类的定义格式：

public abstract class 类名{}

#### 2.注意事项

抽象类不能实例化，不能创建对象；

有抽象方法的类一定是抽象类，抽象类中不一定有抽象方法。

可以有构造方法；

抽象类的子类要么重写抽象类中的所有抽象方法，要么是抽象类。

#### 3.抽象类和抽象方法的意义

统一



## 10.接口

#### 1.接口的应用

public interface 接口名(){}

接口不能实例化；

接口合类之间是实现关系，可以单实现，也可以多实现：

​		public class 类名 implements 接口名{}；

​		public class 类名 implements 接口名1，接口名2{}；

接口的子类： 要么重写接口中的所有类，要么是抽象类；

#### 2. 接口中成员变量的特点

1. 成员变量

   只能是常量；

   默认修饰符：public static final

2. 构造方法

   没有

3. 成员方法

   只能是抽象方法；

   默认修饰符：public abstract

#### 3.接口和类之间的关系

1. 类与类

   继承关系，只能单继承，但可以多层继承。

2. 接口

   实现关系，可以单实现，也可以多实现，还可以继承一个类的同时实现多个接口。

3. 接口与接口

   继承关系，可以单继承也可以多继承。

#### 4.JDK8后接口新增默认方法

1. 接口可以定义有方法体的方法，需要使用关键字default修饰。

2. 作用：解决接口升级问题。

3. 格式：public default返回值类型 方法名（参数列表）{ }

4. 注意事项：默认方法不是抽象方法，所以不强制被重写。但是如果被重写时候去掉default关键字。

   public可以省略，default不能。

   如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法重写。

#### 5.JDK8后接口新增静态方法

1. 允许再接口中定义静态方法，需要用static修饰
2. 注意事项：静态方法只能用接口名调用；static不能省略。

#### 6.JDK9以后的私有方法

接口中私有方法的定义格式：

1. 普通的私有方法，给默认方法服务的

    private 返回值类型 方法名（参数列表）{}

2. 静态的私有方法，给静态方法服务的

     private static 返回值类型 方法名（参数列表）{}

#### 总结：

1. 接口代表规则，是行为的抽象。想要让哪个类拥有一个行为，就让这个类实现对应的接口就可以了。
2. 当一个方法的参数是接口时，可以传递接口所有实现类的对象，这种方式称之为接口多态。

#### 7.适配器设计模式

当接口抽象方法过多时，只使用一部分时，可以用到设备器。

书写格式：编写一个中间抽象类（abstract）XXXXAdapter，实现对应接口，需要那个方法重写哪个。

## 11.内部类innerclass

#### 1.什么是内部类？

内部类表示外部类的一部分，单独出现没意义。

内部类可直接访问外部类的成员，包括私有。

外部类访问内部类成员必须创建对象。

#### 2.成员内部类

写在成员位置的，属于外部类的成员。

获取内部类对象的方式

1.外部类编写方法，对外提供内部类对象，一般用于private修饰的内部类。



2.直接创建

```java
//创建内部类对象
Outer.Inner inner = new Outer.Inner();
```

外部成员变量和内部成员变量重名时，要想调用外部成员变量要用 外部类名.this.变量名 调用

```java

```



#### 3.静态内部类

用static修饰的成员内部类。也是成员内部类的一种

```java
//创建静态内部类对象
Outer.staticInner staticInner = new Outer.staticInner();
```

静态内部类中只能访问外部类中的静态变量和静态方法，如访问非静态需创建外部类的对象。

调用静态方法的格式：外部类名.内部类名.方法名()

```java
//创建静态内部类对象
Outer.staticInner staticInner = new Outer.staticInner();
//调用非静态方法
staticInner.show1();
//调用静态方法
Outer.staticInner.show2();
```



#### 4.局部内部类

1. 将内部类定义在方法里面的
2. 外界无法直接使用，需要在方法内部创建对象并使用。
3. 该类可直接访问外部类的成员，也可访问方法内的局部变量。

```jav
 public void show() {
     int a = 10;
     //局部内部类
     class jubuinner {
         String name;

         public void method1() {
             System.out.println("局部内部类中的method1方法");
         }

         public static void method2() {
             System.out.println("局部内部类中的method2静态方法");
         }
     }
     //局部内部类的对象
     jubuinner inner3 = new jubuinner();
     System.out.println(inner3.name);
     inner3.method1();
     jubuinner.method2();

 }
```



#### 5.匿名内部类

1. 匿名内部就是隐藏了名字的内部类,可以写在成员位置，也可以写在局部位置

2. 格式： 

   ```java
   new 类名或接口名(){
       //重写方法；
   };
   ```

3. 格式的细节

   包含了继承或实现，方法重写，创建对象。

   整体就是一个类的子类对象或者接口的实现类对象。

   ```java
   new Swim() {
       @Override
       public void swim() {
           System.out.println("重写的游泳接口");
       }
   };
   //可以赋值，可以直接调用
   Swim s= new Swim() {
               @Override
               public void swim() {
                   System.out.println("重写的游泳接口");
               }
           };
          s.swim();
   //
    new Swim() {
               @Override
               public void swim() {
                   System.out.println("重写的游泳接口");
               }
           }.swim();
   ```

4. 使用场景

   当方法的参数是接口或者是类的时候，以接口为例，可以传递这个接口的实现类对象，

   如果实现类只要使用一次，就可以用匿名内部类简化代码。

   

# 常用API

## Math

1. 水仙花数，四个

   ```java
       public static void main(String[] args) {
           int count = 0;
           for (int i = 100; i < 999; i++) {
               int ge = i % 10;
               int shi = i / 10 % 10;
               int bai = i / 100 % 10;
               double num = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
               if (i == num) {
                   count++;
                   System.out.println(num);
               }
           }
           System.out.println(count);
       }
   ```

2. 四叶玫瑰数，三个

   ```java
       public static void main(String[] args) {
           int count = 0;
           for (int i = 1000; i < 9999; i++) {
               int ge = i % 10;
               int shi = i / 10 % 10;
               int bai = i / 100 % 10;
               int qian = i / 1000 % 10;
               double num = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4)+Math.pow(qian,4);
               if (i == num) {
                   count++;
                   System.out.println(num);
               }
           }
           System.out.println(count);
       }
   ```

   

## System

工具类，提供与系统相关的方法。

```java
System.exit();//
System.currentTimeMillis();//获取当期时间的毫秒差
System.arraycopy(1,2,3,4,5);
//1,数据源数组；2，从数据源数组中的第几个索引开始拷贝；3，目的地数组；4，目的地数组开始的索引；5，拷贝的个数

```

## Runtime

```java
//如果打印一个对象，想要看到属性值的话，那么就重写toString方法。在重写方法中把对象的属性值进行拼接。

```

## Object

### 1.toString()

如果想要打印对象内部的属性自，可以在javabean中重写toString方法

```java
@override
public String toString() {
    return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", score = " + printString(score) + "}";
}
```

### 2.equals()

1. 
2. 如果没有重写equals方法，默认使用父类Object中的方法比较，比较的是地址值。
3. Alt+Insert一键生成重写equals方法。
4. String中的equals方法是先判断是否为字符串，如果是再比较内部属性，如果不是直接返回false。
5. 调用equals方法：以调用者中的equals方法为准。

### 3.clone()

默认是浅克隆，如果需要深克隆需要重写方法或者使用第三方工具类。

```java
Student s1 = new Student("ydd",22,"man",score);
System.out.println(s1);

//浅拷贝：拷贝地址值，不管内部的基本数据类型、引用数据类型都会拷贝地址值，引用数据类型（new的）中改变被拷贝的改变会影响原对象。
//浅拷贝：基本数据类型拷贝，字符串复用，引用数据类型全部重新创建新的。

//第三方工具，深拷贝方法，Object中的Clone方法是浅拷贝
Gson gson = new Gson();
//把对象变成字符串
String s = gson.toJson(s1);
//再把字符串变成一个对象，传给新的对象
Student s2 = gson.fromJson(s, Student.class);
System.out.println(s2);
```

## Objects

### 1.equals()

### 2.isNull()

### 3.nonNull()

## BigInteger

Biglnteger表示一个大整数。

1. 如何获取Biglnteger的对象?

   Biglnteger b1 = Biglnteger.valueof(0.1);

   Biglnteger b1 = new Biglnteger("整数");

2. 常见操作方法:

   加:add

   乘: multiply

   减: subtract

   除: divide、divideAndRemainder

   比较: equals、max、min

   次幂: pow

   转成整数: intValue、longValue

## BigDecima

1. Biglnteger表示一个大整数。

2. 如何获取Biglnteger的对象?

   ```java
   Biglnteger b1 = Biglnteger.valueof(0.1);
   
   Biglnteger b1 = new Biglnteger("整数");
   ```

   

3. 常见操作

   加:add

   乘: multiply

   减: subtract

   除: divide、divideAndRemainder

   比较: equals、max、min

   次幂: pow

   转成整数: intValue、longValue

## 正则表达式（Regex）

校验字符串。

#### 1.作用

1.校验字符串（AnyRule插件，API文档）

| 预定义字符类 |                                                   |
| ------------ | ------------------------------------------------- |
| `.`          | 任何字符（与[行结束符](#lt)可能匹配也可能不匹配） |
| `\d`         | 数字：`[0-9]`                                     |
| `\D`         | 非数字： `[^0-9]`                                 |
| `\s`         | 空白字符：`[ \t\n\x0B\f\r]`                       |
| `\S`         | 非空白字符：`[^\s]`                               |
| `\w`         | 单词字符：`[a-zA-Z_0-9]`                          |
| `\W`         | 非单词字符：`[^\w]`                               |

2.在一段文本中查找满足要求的内容（爬虫）

```java
String str = "java自Java11？？？？java8";
//获取正则表达式的对象
Pattern p = Pattern.compile("(?i)java\\d{0,2}");
//获取文本匹配器的对象
//拿着m读取str中符合p规则的字符串
Matcher m = p.matcher(str);
while (m.find()){//能找到返回ture
    System.out.println(m.group());//返回的符合规则的字符串
}
```

```java
		//需求:把下面文本中的电话，邮箱，手机号，热线都爬取出来,来黑马程序员学习java,
        //电话:18512516758，18512508907
        //或者联系邮箱:boniu@itcast.cn
        //座机电话:01036517895,010-98951256
        //邮箱:bozai@itcast.cn,
        //热线电话:400-618-9090，400-618-4000，4006184000，4006189090
       String str="电话:18512516758，18512508907或者联系邮箱:boniu@itcast.cn邮箱:bozai@itcast.cn,座机电话:01036517895,010-98951256,热线电话:400-618-9090，400-618-4000，4006184000，4006189090";
        String gex="(1[^2]\\d{9})|(\\w{1,}@[\\w^_]{3,}\\.[cn]{2,})|(400-?\\d{3}-?\\d{4})|(010-?\\d{8})";
        Matcher m = Pattern.compile(gex).matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }
```

#### 2.贪婪和非贪婪爬取

java默认贪婪爬取（尽可能多获取），如果再数量词+*的后面加？，就是非贪婪爬取（尽可能少获取）。

#### 3.正则表达式在字符串方法中的使用

1. matches()

2. replaceAll()

   ```java
   //按照正则表达式的规则进行替换
   String s="小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
   String vs = s.replaceAll("[a-zA-Z0-9]+", "vs");
   System.out.println(vs);
   ```

3. split()

   ```java
   //按照正则表达式的规则切割字符串
   String[] split = s.split("[a-zA-Z0-9]+");
   for (int i = 0; i < split.length; i++) {
       System.out.println(split[i]);
   }
   ```

#### 4.捕获组号

组号: 表示把第X组的内容再出来用一次;

1. 正则内部使用组号：\\x把第x组的内容再用一次。

   ```java
   //需求1: 判断一个字符串的开始字符和结束字符是否一致? 只考虑一个字符
   //举例:&abc& ,a123b,, a123a, b456b,17891
   String regex1="(.).+\\1";
   System.out.println("&abc&".matches(regex1));
   System.out.println("a123a".matches(regex1));
   System.out.println("b456b".matches(regex1));
   
   //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
   //举例:abc123abc b456b 123789123
   String regex2="(.+).+\\1";
   System.out.println("abc123abc".matches(regex2));
   System.out.println("b456b".matches(regex2));
   System.out.println("123789123".matches(regex2));
   
   //需求3:判断一个字符串的开始部分和结束部分是否一致? 开始部分内部每个字符也需要一致
   //举例:&&abc&&,aaa123aaa,bbb456bbb,111789111
   String regex3="((.){3}).+\\1";//((.)\2*).+\1
   System.out.println("aaaa123aaa".matches(regex3));
   System.out.println("bbb456bba".matches(regex3));
   System.out.println("111789111".matches(regex3));
   ```

2. 正则外部使用组号：$x

   ```java
   //去重复
   String str="我要学学学学编编编编编编编编编编编编编程程程程程程程程程程程";
   System.out.println(str.replaceAll("(.)\\1+", "$1"));//
   ```
   

#### 5.非捕获分组

分组之后不需要再用本组数据，仅仅是把数据括起来。

非捕获组

| `(?:`*X*`)`  | *X*，作为非捕获                |
| :----------- | ------------------------------ |
| `(?=`*X*`)`  | *X*，通过零宽度的正 lookahead  |
| `(?!`*X*`)`  | *X*，通过零宽度的负 lookahead  |
| `(?<=`*X*`)` | *X*，通过零宽度的正 lookbehind |

```java
/*需求1: 爬取版本号为8,11,17的Java文本，但是只要Java不显示版本号
  需求2: 爬取版本号为8,11,17的Java文本。正确爬取结果:Java8 Java1 Java17 Java17
  需求3: 爬取除了版本号为8,11,17的Java文本，
*/
String s = "java自从95年问世以来，经历了很多版本 目前企业中用的最多的是Java8和JAva11因为这两个是长期支持版本下一个长期支持 版本是JAVa17相信在未来不久JAVA17也会逐渐登上历史舞台";
//1.定义正则表达式
//?理解为前面的数据Java
//=表示在Java后面要跟随的数据
//但是在获取的时候，只获取前半部分
String gex1 = "(?i)java(?=8|11|17)";
String gex2 = "(?i)java(8|11|17)";//((?i)java)(?:8|11|17)
String gex3 = "(?i)java(?!8|11|17)";//(?i)java(?:8|11|17)
Matcher m1 = Pattern.compile(gex1).matcher(s);
Matcher m2 = Pattern.compile(gex2).matcher(s);
Matcher m3 = Pattern.compile(gex3).matcher(s);
while (m1.find()) {
    System.out.println(m1.group());
}
System.out.println("======================");
while (m2.find()) {
    System.out.println(m2.group());
}
System.out.println("======================");
while (m3.find()) {
    System.out.println(m3.group());

}
System.out.println("======================");
```

## 时间类

#### Date

1、如何创建日期对象?

```java
Date date = new Date();
Date date = new Date(指定毫秒值);
```

2、如何修改时间对象中的毫秒值

```java
setTime(毫秒值);
```

3、如何获取时间对象中的毫秒值

```java
getTime();
```

#### SimpleDateFormat

解析，格式化

```java
//
    String str="2000年10月03日 00:00:00";
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date d = null;
    try {
        d = sdf2.parse(str);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
    System.out.println(d.getTime());
}
```

#### calender

表示一个时间的日历对象

```java
Calendar c = Calendar.getInstance();
 Date d = new Date(0l);
 c.setTime(d);
 System.out.println(c);
 //public int get(int field)取日期中的某个字段信息
 //0-16个索引，  
 int year = c.get(Calendar.YEAR);
 int month = c.get(Calendar.MON
 //public void set(int field,int value)修改日历的某个字段信息
 c.set(Calendar.YEAR,2000);//
 c.set(Calendar.MONTH,9);//10月
 c.set(Calendar.DAY_OF_MON
 //public void add(int field,int amount)为某个字段增加/减少指定的值
 c.add(Calendar.MONTH,-1);//减一个月
 System.out.println(year);
 System.out.println(month);
    }
```

## JDK8的新增时间类

now现在的时间，of添加指定时间，with修改，min减少，plus增加

#### Date类：

1. zoneId：时区，获取Java中支持的时区；获取系统默认时区；获取制定时区。

2. Instant：时间戳，

   ```java
   //static Instant now()获取当前时间的Instant对象 (标准时间)
   Instant now = Instant.now();
   System.out.println(now);
   //static Instant ofXxxx(long epochMilli)根据(秒/毫秒/纳秒) 获取Instant对象
   Instant instant1 = Instant.ofEpochMilli(1L);
   System.out.println(instant1);
   //ZonedDateTime atZone(ZoneId zone)指定时区
   ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
   System.out.println(time);
   //boolean isXxx(Instant otherInstant)判断系列的方法
   Instant instant2 = Instant.ofEpochMilli(1000L);
   //判断调用者的时间是否在参数的前面
   System.out.println(instant1.isBefore(instant2));
   //判断调用者的时间是否在参数的后面
   System.out.println(instant1.isAfter(instant2));
   
   //Instant minusXxx(long millisToSubtract)减少时间系列的方法
   //减100秒
   instant2.minusMillis(100L);
   
   //Instant plusXxx(long millisToSubtract)增加时间系列的方法
   ```

3. ZonedDateTime：带时区的时间

   with修改，min减少，plus增加

#### 时间格式化类

DateTimeFormatter：时间格式化，解析，类似SimpleDateFormat。

#### 日历类

LocaDate（年月）、LocalTime（时分秒）、LocalDateTime（年月日时分秒）日历对象

#### 工具类

1. Duration：时间间隔（秒，纳秒）
2. Period：时间间隔（年月日）
3. ChronoUnit.单位（年月日时分秒）.between(时间1，时间2)；

```java
LocalDateTime today = LocalDateTime.now();
LocalDateTime birthday = LocalDateTime.of(2000, 10, 3, 0, 0, 0);
System.out.println("相差的年份"+ChronoUnit.YEARS.between(birthday, today));
```

## 包装类

#### 1.什么是包装类?

 基本数据类型对应的对象

#### 2.JDK5以后对包装类新增了什么特性?

 自动装箱、自动拆箱

#### 3.我们以后如何获取包装类对象?

 不需要new，不需要调用方法，直接赋值即可

#### 4.常用方法

```java
/*public static string toBinaryString(int i)得到二进制
public static string tooctalstring(int i)得到八进制
public static string toHexString(int i)得到十六进制
public static int parseInt(string s)将字符串类型的整数转成int类型的整数
 1.在基本类型转换时，参数只能是数字。
 2.8种包种类中，除了Character都有对应的parseXX的方法，进行类型转换。
*/
//键盘录入改进
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int i = Integer.parseInt(s);
System.out.println(i);
```

## 综合练习

## 算法和Lambda

#### 查找

1. 基本查找

   ```java
   //1,基本查找，不考虑重复
   public static int basic1(int[] arr, int num) {
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == num) {
               return i;
           }
       }
       return -1;
   }
   //2基本查找，考虑重复
   public static ArrayList<Integer> basic2(int[] arr, int num) {
       ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == num) {
               list.add(i);
           }
       }
       return list;
   }
   ```

2. 二分查找

   - 优势：可以提高超找效率

   - 前提条件：必须是有序的

   - 过程：

     min和max表示当前要查找的范围。mid是在min和max中间。

     如果要查找的元素在mid的左边，缩小范围时min不变，max等于mid减1。

     如果要查找的元素在mid的右边，缩小范围时max不变，min等于mid加1。

   ```java
       //二分查找、
       public static int basic3(int[] arr,int number){
           int min=0;
           int max=arr.length-1;
           while (true){
               if (min>max){
                   return -1;
               }
               int mid=(min+max)/2;
               if (arr[mid]>number){
                   max=mid-1;
               } else if (arr[mid]<number) {
                   min=mid+1;
               }else {
                   return mid;
               }
           }
       }
   ```

   

3. 分块查找

   ```java
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
   ```

   

#### 排序

1. 冒泡排序
   核心思想:
   1，相邻的元素两两比较，大的放右边，小的放左边。
   2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推
   3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。

   ```java
   int[] arr = {1, 32, 412, 213, 2, 3};
           for (int j = 0; j < arr.length - 1; j++) {
               for (int i = 0; i < arr.length - 1 - j; i++) {
                   if (arr[i] > arr[i + 1]) {
                       int temp = arr[i];
                       arr[i] = arr[i + 1];
                       arr[i + 1] = temp;
                   }
               }
           }
   ```

   

2. 选择排序

   核心思想:
   1，从0索引开始比较，大的放右边，小的放左边。

   ```java
   int[] arr = {2, 5, 4, 1, 3};
           for (int j = 0; j < arr.length - 1; j++) {
               for (int i = 1 + j; i < arr.length; i++) {
                   if (arr[j] > arr[i]) {
                       int temp = arr[j];
                       arr[j] = arr[i];
                       arr[i] = temp;
                   }
               }
           }
   ```

   

3. 插入排序

   ```java
   int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2};
           int startIndex = -1;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] > arr[i + 1]) {
                   startIndex = i + 1;
                   break;
               }
           }
   
           //从start开始遍历
           for (int i = startIndex; i < arr.length; i++) {
               int j = i;
   
               //把从start遍历到的从左往右更前面的比较，大了不动，小了交换位置，比较到0索引为止。
               while (j > 0 && arr[j] < arr[j - 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j - 1];
                   arr[j - 1] = temp;
                   //交换完位置后继续往前比较
                   j--;
               }
           }
   ```

   

4. 快速排序

   递归算法：方法自己调用自己

   ```java
   public static void main(String[] args) {
           System.out.println(getSum(100));
       System.out.println(getJC(5));
       }
       //递归算法：
       public static int getSum(int number){
           //出口
           if (number==1){
               return 1;
           }
           return number+getSum(number-1);
       }
   //递归求阶乘
       public static int getJC(int number){
           if (number==1){
               return 1;
           }
           return number*getJC(number-1);
   
       }
   ```

   
