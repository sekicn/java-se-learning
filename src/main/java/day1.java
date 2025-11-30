public class Day1 {
    public static void main(String[] args) {
        sum1To100();
        printStudentInfo();
    }

    public static void sum1To100() {
        int count = 100;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        System.out.println("合計 = " + sum);
    }

    public static void printStudentInfo() {
        String name = "田中太郎";
        String gender = "男性";
        int age = 20;
        String address = "東京渋谷";
        double balance = 1280.50;

        System.out.println("私の名前は：" + name);
        System.out.println("性別：" + gender);
        System.out.println("年齢：" + age);
        System.out.println("住所：" + address);
        System.out.println("残高：" + balance + " 円");
    }
}
