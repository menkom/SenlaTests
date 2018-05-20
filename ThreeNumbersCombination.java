
import java.util.Scanner;

public class ThreeNumbersCombination {

    /*
     как поступать, если две цифры равны? Т.е. нам нужны комбинации без повторений?
     Как поступать , если одна из цифр 0? Т.е. 063 это уже будет не трехзначное?
     Рассматриваем, что числа от 0 до 9
     */
//формируем массив из всех подстановок
    public static int[] getCombinations(int aNumber1, int aNumber2, int aNumber3) {
        int[] lTemporary = {aNumber1, aNumber2, aNumber3};
        int[] lResult = new int[6];
        int m = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        lResult[m] = lTemporary[i] * 100 + lTemporary[j] * 10 + lTemporary[k];
                        m++;
                    }

                }
            }
        }
        return lResult;
    }

//обнуляем не трехзначные элементы
    public static int[] getThreeDigit(int[] aArray) {
        int[] lTemp = aArray;
        for (int i = 0; i < aArray.length; i++) {
            if (lTemp[i] < 100) {
                lTemp[i] = 0;
            }
        }
        return lTemp;
    }

    //обнуляем дубликаты
    public static int[] delDuplicates(int[] aArray) {
        int[] lTemp = aArray;
        for (int i = 0; i < aArray.length; i++) {
            for (int j = i + 1; j < aArray.length; j++) {
                if (lTemp[i] == lTemp[j]) {
                    lTemp[j] = 0;
                }
            }
        }
        return lTemp;
    }

    public static void main(String[] args) {
        String lErrorMessage = "Ошибка ввода.";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.print("Введите первое число (от 0 до 9) :");
            int lNumber1 = inputText.nextInt();
            System.out.print("Введите второе число (от 0 до 9) :");
            int lNumber2 = inputText.nextInt();
            System.out.print("Введите третье число (от 0 до 9) :");
            int lNumber3 = inputText.nextInt();

            int[] lTemp = getThreeDigit(delDuplicates(getCombinations(lNumber1, lNumber2, lNumber3)));

            for (int i = 0; i < lTemp.length; i++) {
                if (lTemp[i] != 0) {
                    System.out.print(lTemp[i] + "; ");
                }
            }
        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }
}
