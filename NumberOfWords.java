
import java.util.Scanner;

public class NumberOfWords {

    static char[] separ = {' ', ','};

    public static int wordsCount(String aValue) {
        int aResult = 0;

        int i = 0;
        int[] separInt = {0, 0};
        int nextNum = 0;
        /*
        1. Первым символом может быть пробел
        2. Символы разделения могут идти один за другим - это же не будет словом
        3. Если предложение состоит из одного слова, то не найдется ни одного символа-разделителя.
        4. Последним символом может быть пробел

         */

        while (i < aValue.length()) {

            separInt[0] = aValue.indexOf(separ[0], i);
            separInt[1] = aValue.indexOf(separ[1], i);

            nextNum = Math.min(separInt[0], separInt[1]);

            if (nextNum == -1) {
                nextNum = Math.max(separInt[0], separInt[1]);
                if (nextNum == -1) {
                    nextNum = aValue.length();
                }
            }
            if (i == nextNum) {
                i++;
            } else {
                i = nextNum + 1;
                aResult++;
            }
        }
        return aResult;
    }

    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        System.out.print("Введите предложение:");
        if (inputText.hasNext()) {
            System.out.println("В предложении " + wordsCount(inputText.nextLine()) + " слов.");
        } else {
            System.out.println("Ошибка ввода. Необходимо ввести текст.");
        }
    }

}
