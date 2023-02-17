public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(100_000) + 100_000;
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int daySum : arr) total += daySum;
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int daySum : arr) {
            if (daySum < min) min = daySum;
            else if (daySum > max) max = daySum;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за " + "день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int[] arr = generateRandomArray();
        double total = 0;
        for (int daySum : arr) total += daySum;
        double avg = total / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила " + "%.2f", avg);
        System.out.println(" рублей");
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) System.out.print(reverseFullName[i]);
    }
}