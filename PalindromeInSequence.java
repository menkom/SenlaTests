
import java.util.Scanner;

public class PalindromeInSequence {

    /*„исло можно рассматривать как набор символов. 
    ‘ункци€ дл€ такой проверки была написана ранее.
     */
    public static boolean isPalindrom(int aNumber) {
        boolean lResult = true;
// учитыва€ условие задачи (N<=100), то построим алгоритм основыва€сь на этом знании и не распыл€€сь.
        if (aNumber >= 10) {
            lResult = ((aNumber / 10) == (aNumber % 10));
            if (lResult) {
                System.out.print(aNumber + "; ");
            }
        }
        return lResult;
    }

    public static void main(String[] args) {

        String lErrorMessage = "ќшибка ввода.";

        Scanner inputText = new Scanner(System.in);

        try {
            System.out.print("¬ведите длину последовательности (не более 100):");
            int sequenceLength = inputText.nextInt();
            if ((sequenceLength > 100) || (sequenceLength < 0)) {
                System.out.println(lErrorMessage + "ƒлина не должна быть больше 100 или меньше 0.");
            } else {
                for (int i = 0; i <= sequenceLength; i++) {
                    isPalindrom(i);
                }
            }
        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }

}
