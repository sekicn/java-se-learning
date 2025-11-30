public class Day2 {
    public static void main(String[] args) {
        sum1To100();
    }

    public static void sum1To100() {
        System.out.println("作业");
        int count = 100;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }
}
