public class Main {
    public static void main(String[] args) {
        task();
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    /**
     * Задача 1
     * Бухгалтеры попросили посчитать сумму всех выплат за месяц.
     * <p>
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
     */
    public static void task() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int monthlyExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            monthlyExpenses += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей \n", monthlyExpenses);
    }

    /**
     * Задача 2
     * Также бухгалтерия попросила найти минимальную и максимальную трату за день.
     * <p>
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
     */
    public static void task1() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxWaste = arr[0];
        int minWaste = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxWaste) {
                maxWaste = arr[i];
            }
            if (arr[i] < minWaste) {
                minWaste = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", minWaste, maxWaste);
    }

    /**
     * Задача 3
     * Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
     * <p>
     * Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
     * <p>
     * Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
     */
    public static void task2() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double monthlyExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            monthlyExpenses += arr[i];
        }
        System.out.printf("«Средняя сумма трат за месяц составила %2f рублей\n",monthlyExpenses / arr.length );
    }

    /**
     * Задача 4
     * В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
     *
     * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
     *
     * char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
     *
     * В результате в консоль должно быть выведено: Ivanov Ivan.
     *
     * Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
     */
    public static void task3() {
        System.out.println("Задание 4m");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}