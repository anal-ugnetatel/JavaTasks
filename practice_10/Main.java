import java.util.Scanner;
public class Main {

    static void task1(int amount) {
        int k = 0;
        int j = 1;
        int result = 0;
        for (int i = 1; i <= amount; i++) {
            result += i;
        }
        for (int i = 0; i < result; i++) {
            System.out.print(j + " ");
            k++;
            if (j == k) {
                k = 0;
                j++;
            }
        }
    }
    static int task5(int number) {
        return (number == 0) ? 0 : (number % 10) + task5(number / 10);
    }
    static String task8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return task8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    static int task17() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, task17());
        }
    }

    public static void main(String[] args) {
        // 1)
        Scanner scanner = new Scanner(System.in);
        System.out.print("1) Треугольная последовательность: ");
        int a = scanner.nextInt();
        task1(a);
        System.out.println();
        // 3)
        System.out.println("\n3) Выведите все числа от A до B включительно, в порядке возрастания, если A < B," +
                " или в порядке убывания в противном случае.");
        System.out.print("  Введите число А: ");
        int A = scanner.nextInt();
        System.out.print("  Введите число B: ");
        int B = scanner.nextInt();
        System.out.print("  Вcе числа: ");
        if (A > B)
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        else
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        // 5)
        System.out.println("\n5) Сумма цифр числа. Дано натуральное число N. Вычислите сумму его цифр.");
        System.out.print("  Введите число N: ");
        int N = scanner.nextInt();
        System.out.println("  Сумма цифр числа N: " + task5(N));
        // 8)
        System.out.println("\n8) Палиндром. Дано слово, состоящее только из строчных латинских букв. Проверьте," +
                " является ли это слово палиндромом.");
        System.out.print("  Введите слово: ");
        String line = scanner.next();
        System.out.println("  Результат: " + task8(line));
        // 17)
        System.out.println("\n17) Максимум последовательности. Дана последовательность натуральных чисел (одно число в" +
                " строке), завершающаяся числом 0. Определите наибольшее значение числа в этой последовательности.");
        System.out.println("  Введите числа построчно: ");
        a =  task17();
        System.out.print("  Результат: " + a);
        scanner.close();
    }
}