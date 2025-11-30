public class Day1 {
    public static void main(String[] args) {
        sum1To100();
        printStudentInfo();
        demonstrateTypeCastingIssues();
        demonstrateStringConcatenation();
        demonstrateSmsMessage();
        demonstrateCharAndInt();
        demonstrateIncrementDecrement(); // 新增：自增自减案例
    }

    public static void sum1To100() {
        int count = 100;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        System.out.println("总和 = " + sum);
    }

    public static void printStudentInfo() {
        String name = "田中太郎";
        String gender = "男性";
        int age = 20;
        String address = "东京涩谷";
        double balance = 1280.50;

        System.out.println("我的名字是：" + name);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);
        System.out.println("住址：" + address);
        System.out.println("余额：" + balance + " 元");
    }

    public static void demonstrateTypeCastingIssues() {
        System.out.println("\n--- 强制类型转换的负面影响 ---");

        // 1. double 转 int：小数部丢失
        double price = 99.99;
        int priceAsInt = (int) price;
        System.out.println("原始价格（double）: " + price);
        System.out.println("转换后（int）: " + priceAsInt);
        System.out.println("数据丢失: " + (price - priceAsInt) + " 元");

        // 2. long 转 int：数值溢出
        long largeNumber = 3000000000L;
        int smallInt = (int) largeNumber;
        System.out.println("\n原始值（long）: " + largeNumber);
        System.out.println("转换后（int）: " + smallInt);
        System.out.println("※发生了溢出，得到了意外的值");

        // 3. float 转 int：精度丧失
        float temperature = 36.8f;
        int tempAsInt = (int) temperature;
        System.out.println("\n原始体温（float）: " + temperature);
        System.out.println("转换后（int）: " + tempAsInt);
        System.out.println("精度丧失导致信息丢失");

        int a1 = 2;
        int b1 = 3;
        int sum = a1 + b1;
        System.out.println("a1 + b1 = " + sum);
        // 除法
        int a2 = 5;
        int b2 = 2;
        int quotient = a2 / b2;
        System.out.println("a2 / b2 = " + quotient);

        // 9除以10 得到0
        int a3 = 9;
        int b3 = 10;
        int quotient2 = a3 / b3;
        System.out.println("a3 / b3 = " + quotient2);

    }

    public static void demonstrateStringConcatenation() {
        System.out.println("\n--- '+' 符号的用法 ---");

        int a = 5;

        System.out.println("abc" + 'a'); // abca
        System.out.println("abc" + a); // abc5
        System.out.println(5 + a); // 10
        System.out.println("abc" + 5 + 'a');
        System.out.println(15 + "abc" + 15);
        System.out.println(a + 'a');
        System.out.println(a + "" + 'a');
        System.out.println(a + 'a' + " geekaca ");
        System.out.println("geekaca" + a + 'a');
        System.out.println("geekaca" + (a + 'a'));
    }

    public static void demonstrateSmsMessage() {
        System.out.println("\n--- 短信示例 ---");

        System.out.println("【支付宝】支付宝251*@qq.*花呗05月日账单13839.17元。还款日05月20日，你还有1个花呗金可用于还款。");
        System.out.println("\n详细信息：");
        System.out.println("账户：251*@qq.*");
        System.out.println("账单金额：13839.17元");
        System.out.println("还款日期：05月20日");
        System.out.println("可用花呗金：1个");
        System.out.println("用途：用于还款");
    }

    //// 字符类型 底层对应的ASCII码，char遇到int时候，会被当作int来运算
    public static void demonstrateCharAndInt() {
        System.out.println("\n--- 字符和整数的运算 ---");
        char ch = 'A'; // ASCII码65
        int num = 5;
        int result = ch + num; // 'A'被当作65来运算
        System.out.println("字符 'A' 的ASCII码是: " + (int) ch);
        System.out.println("字符 'A' 加上整数 5 的结果是: " + result);
        System.out.println("字符 'A' 加上整数 5 的结果对应的字符是: " + (char) result);
        // 拼接用stringvalueof
        String combined = String.valueOf(ch) + num;
        System.out.println("字符 'A' 和整数 5 拼接的结果是: " + combined);
    }

    // 自增自减 学习
    // ++a 先加1再用 a++先用再加1
    // --同理
    public static void demonstrateIncrementDecrement() {
        System.out.println("\n=== 自增自减运算符 ===");

        // 1.基础用法
        System.out.println("\n--- 1. 基础用法 ---");
        int a = 5;
        System.out.println("初始值 a = " + a);

        a++; // 就是 a = a+1
        System.out.println("执行 a++ 后，a = " + a); // 6

        ++a;
        System.out.println("执行 ++a 后，a = " + a); // 7

        a--;
        System.out.println("执行 a-- 后，a = " + a); // 6

        --a;
        System.out.println("执行 --a 后，a = " + a); // 5

        // ====== 2. 前置vs后置 区别 重点！！ ======
        System.out.println("\n--- 2. 前置 vs 后置 的区别（核心重点）---");

        int b = 10;
        int result1 = b++; // 先把b的值10赋给result1,然后b再+1
        System.out.println("int result1 = b++");
        System.out.println("result1 = " + result1 + ", b = " + b); // result1=10, b=11

        int c = 10;
        int result2 = ++c; // 先让c+1 然后把c的值11赋给result2
        System.out.println("\nint result2 = ++c");
        System.out.println("result2 = " + result2 + ", c = " + c); // result2=11 c=11

        // 3. 表达式里用
        System.out.println("\n--- 3. 在表达式中使用 ---");

        int x = 5;
        int y = x++ + ++x;
        // 这个有点绕 分析一下:
        // x++ 先取x的值5参与运算 然后x变6
        // ++x x先变7 然后取7运算
        // y = 5 + 7 = 12
        System.out.println("x=5, y = x++ + ++x");
        System.out.println("y = " + y + ", x = " + x); // y=12 x=7

        // ===== 4. 打印语句里的区别 =====
        System.out.println("\n--- 4. 在打印语句中的区别 ---");

        int m = 1;
        System.out.println("m初始值 = " + m);
        System.out.println("打印 m++ = " + m++); // 打印1 然后m变2
        System.out.println("此时 m = " + m); // 2
        System.out.println("打印 ++m = " + ++m); // m先变3 打印3
        System.out.println("此时 m = " + m);

        // 5.实际应用
        System.out.println("\n--- 5. 实际应用场景 ---");

        // 循环里常用
        System.out.println("循环中常用 i++:");
        for (int i = 0; i < 3; i++) {
            System.out.println("  循环第 " + (i + 1) + " 次");
        }

        // 计数器
        int counter = 0;
        counter++; // 有人访问
        counter++; // 又有人来了
        System.out.println("访问次数: " + counter);

        // 6. 面试题
        System.out.println("\n--- 6. 经典面试题 ---");

        int n = 1;
        n = n++; // 陷阱！
        // 过程:
        // 1.先保存n的原值1到临时变量
        // 2.n自增变2
        // 3.把临时变量的值1赋给n
        // 所以n还是1 有点坑
        System.out.println("n=1, 执行 n=n++ 后, n = " + n); // 1

        System.out.println("\n=== 总结 ===");
        System.out.println("口诀:");
        System.out.println("  ++在前 先加后用");
        System.out.println("  ++在后 先用后加");
        System.out.println("  单独用的话 前置后置效果一样");
        System.out.println("  参与运算要注意取值时机");
    }

}
