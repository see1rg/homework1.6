import java.util.Random;


public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

    }

    public static void task3() {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        float average = (float) ((sum * 1.0) / 30);
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}