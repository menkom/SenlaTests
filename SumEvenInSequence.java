
import java.util.Scanner;

public class SumEvenInSequence {

    public static int SumOfEven(int aFinish) {
        int lResult = 0;

        int lLastEven = (aFinish % 2 == 0 ? aFinish : aFinish - 1);
        if (lLastEven > 1) {
            // (первое четное + последнее четное)*(количество четных)/2
            lResult = ((2 + lLastEven) * (lLastEven / 2)) / 2;
        }
        return lResult;
    }

    public static void main(String[] args) {
        String lErrorMessage = "Ошибка ввода.";

        Scanner inputText = new Scanner(System.in);
        int lSumOfEven = 0;
        try {
            System.out.print("Введите длину последовательности :");
            int sequenceLength = inputText.nextInt();
            if (sequenceLength < 0) {
                System.out.println(lErrorMessage + "Длина не должна быть  меньше 0.");
            } else {
                int i = 0;
                while (i <= sequenceLength) {
                    lSumOfEven += i;
                    System.out.print(i + "; ");
                    i += 2;
                }
                System.out.print("\n");
                System.out.println("Сумма чётных чисел до " + sequenceLength + " равна " + lSumOfEven);

                System.out.println("Сумма чётных чисел до " + sequenceLength + " равна " + SumOfEven(sequenceLength));
            }
        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }

}
