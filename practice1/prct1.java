import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prct1{

    public static int getFactorial(int factorialBase){
        int factorialResult = 1;
        for (int i = 1; i <= factorialBase; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }

    public static void main (String args[]) {

        {
            System.out.println("numbers for sum1");
            Scanner input = new Scanner(System.in);
            String[] numbers = input.nextLine().split(" ");
            int sum = 0;
            for(int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            System.out.println("sum1: " + sum);

            System.out.println("numbers for sum2");
            Scanner input2 = new Scanner(System.in);
            String[] numbers2 = input2.nextLine().split(" ");
            int sum2 = 0;
            int i = 0;
            while(numbers2.length != i) {
                sum2 += Integer.parseInt(numbers2[i]);
                i++;
            }
            System.out.println("sum2: " + sum2);

            System.out.println("numbers for sum3");
            Scanner input3 = new Scanner(System.in);
            String[] numbers3 = input3.nextLine().split(" ");
            int sum3 = 0;
            int i3 = 0;
            do {
                sum3 += Integer.parseInt(numbers3[i3]);
                i3++;
            } while(numbers3.length != i3);
            System.out.println("sum3: " + sum3);
        }

        System.out.println("Arguments = " + Arrays.toString(args));

        int num = 7; // amount of numbers
        double result = 0.0;
        System.out.print("Garmonic row: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);// formatted output
        }

        int[] array = new int[(int) (Math.random() * 40)];
        for (int i =0; i < array.length; i++){
            array[i] = (int) (Math.random() * 1000);
        }

        Random random = new Random();
        int[] arrayR = new int[(int) (random.nextInt(40))];
        for (int i =0; i < arrayR.length; i++){
            arrayR[i] = (random.nextInt(1000));
        }

        System.out.println("\nRandomized with Random: " + Arrays.toString(arrayR));
        Arrays.sort(arrayR);
        System.out.println("Sorted Random: " + Arrays.toString(arrayR));

        System.out.println("Randomized with Math.random: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Math.random: " + Arrays.toString(array));

        Scanner in = new Scanner(System.in);
        System.out.print("Type a number for factorial: ");
        int factorialBase = in.nextInt();

        System.out.println("Factorial result: " + getFactorial(factorialBase));
    }
}