
import java.util.Scanner;

public class SenlaOddEvenPrime {

    public static String intEvenOddToText(int mValue) {
        if (mValue % 2 == 0) {
            return "чётное";
        } else {
            return "нечётное";
        }
    }

    public static String isPrime(int mValue) {
        /*  Просто?е число — натуральное (целое положительное) число, имеющее ровно 
    два различных натуральных делителя — единицу и самого себя.   
         */

        boolean lIsPrime = true;

        if (mValue < 2) { //Цикл не затрагивает числа, меньшие 2
            lIsPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(mValue); i++) {
                if (mValue % i == 0) {
                    lIsPrime = false;
                    break;
                }
            }
        }
        if (lIsPrime) {
            return "простое";
        } else {
            return "составное";
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите целое число:");

        Scanner inputText = new Scanner(System.in);

        if (inputText.hasNextInt()) {
            int inputValue = inputText.nextInt();//Создано для удобства записи
            System.out.println("Число " + inputValue + " " + intEvenOddToText(inputValue) + " и " + isPrime(inputValue));
        } else {
            System.out.println("Ошибка ввода. Необходимо было ввести целое число");
        }
    }
}
