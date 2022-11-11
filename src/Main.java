import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] expenses = generateRandomArray();
        int sumInMonth = 0;
        for (int g = 0; g < expenses.length; g++) {
            sumInMonth += expenses[g];
            if (g == 29) {
                System.out.println("Сумма трат за месяц составила " + sumInMonth + " рублей.");
            }
        }
        System.out.println("Задание 2");
        Arrays.sort(expenses);
            System.out.println("Минимальная сумма трат за день составила " + expenses[0] + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + expenses[expenses.length - 1] + " рублей.");

        System.out.println("Задание 3");
        double averageDaySpendings = sumInMonth / 30;
            System.out.println("Средняя сумма трат за месяц составила " + averageDaySpendings + " рублей.");

        System.out.println("Задание 4");
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int k = reverseFullName.length - 1; k  >=0; k--)
            if (k >= 0) {
                System.out.print(reverseFullName[k]);
            }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses [i] = random.nextInt(100_000) + 100_000;
            //System.out.println(arr[i]);
        }
        return expenses;
    }
}


