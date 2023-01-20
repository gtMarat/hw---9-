import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1 и 2");
        for (int i : arr) {
            System.out.println("Сумма трат за месяц составила " + i + " рублей");
        }
        int maxArr = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей");
        int minArr = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        double sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
            {
            }
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}

