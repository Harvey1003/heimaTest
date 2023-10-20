# String（API）

### 1.string.substring()截取，包头不包尾

案例身份证号码截取出生日期，性别等

```java
		String id = "412723200010033826";
		String year=id.substring(6,10);
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
