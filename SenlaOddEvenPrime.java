
import java.util.Scanner;

public class SenlaOddEvenPrime {

    public static boolean isEven(int mValue) {
        return (mValue % 2 == 0);
    }

    public static boolean isPrime(int mValue) {
        /*  Просто?е число — натуральное (целое положительное) число, имеющее ровно 
    два различных натуральных делителя — единицу и самого себя.   
         */

        boolean lIsPrime = true;

        //Цикл не затрагивает числа, меньшие 2
        if (mValue < 2) {
            lIsPrime = false;
        } else {
            //достаточно проверить все числа до квадрата числа на простоту
            for (int i = 2; i < Math.sqrt(mValue); i++) {
                if (mValue % i == 0) {
                    lIsPrime = false;
                    break;
                }
            }
        }
        return lIsPrime;
    }

    public static void main(String[] args) {
        System.out.print("Введите целое число:");

        Scanner inputText = new Scanner(System.in);

        if (inputText.hasNextInt()) {
            int inputValue = inputText.nextInt();//Создано для удобства записи
            System.out.println("Число " + inputValue + " "
                    + (isEven(inputValue) ? "чётное" : "нечётное")
                    + " и " + (isPrime(inputValue) ? "простое" : "составное"));
        } else {
            System.out.println("Ошибка ввода. Необходимо было ввести целое число");
        }
    }
}
