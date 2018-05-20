
import java.util.Scanner;

public class SumNodNok {

    /*
В самом простом случае алгоритм Евклида применяется к паре положительных 
целых чисел и формирует новую пару, которая состоит из меньшего числа и 
разницы между большим и меньшим числом. Процесс повторяется, пока числа не 
станут равными. Найденное число и есть наибольший общий делитель исходной пары. 
     */
//GCD greatest common divisor
    public static long nod(long lValue1, long lValue2) {
        if (lValue2 == 0) {
            return lValue1;
        }
        return nod(lValue2, lValue1 % lValue2);
    }

//LCM least common multiple
    public static long nok(long lValue1, long lValue2) {
        return lValue1 / nod(lValue1, lValue2) * lValue2;
    }

    public static void main(String[] args) {
        String lErrorMessage = "Ошибка ввода. Необходимо было ввести целое число";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.print("Введите первое целое число:");
            int inputValue1 = inputText.nextInt();
            System.out.print("Введите второе целое число:");
            int inputValue2 = inputText.nextInt();

            System.out.println("Сумма " + inputValue1 + " и " + inputValue2 + " равна " + (inputValue1 + inputValue2));
            System.out.println("Разность " + inputValue1 + " и " + inputValue2 + " равна " + (inputValue1 - inputValue2));
            System.out.println("НОД " + inputValue1 + " и " + inputValue2 + " равна " + nod(inputValue1, inputValue2));
            System.out.println("НОК " + inputValue1 + " и " + inputValue2 + " равна " + nok(inputValue1, inputValue2));

        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }
}
