
import java.util.Scanner;

public class WordRepeat {

    public static int countWordRepeat(String aText, String aWord) {
        int lResult = 0;//количество повторений заданного слова
        String lText = aText.toLowerCase();
        String lWord = aWord.toLowerCase();
        int i = 0;
        int lPos = -1;
        boolean lTest;
        while (i < lText.length()) {
            lPos = lText.indexOf(lWord, i);
            if (lPos != -1) {
                lTest = true;
                //перед и после должны быть пробелы или слово должно быть последним или первым в тексте
                //т.е. 1. надо проверить если слово первое, то проверяем дальше. 
                //2.Если слово не первое, то перед ним должен быть пробел
                if (lPos != 0) {
                    if (lText.charAt(lPos - 1) != ' ') {
                        lTest = false;
                    }
                }
                if (lTest && (lPos + lWord.length() != lText.length())) {
                    if (lText.charAt(lPos + lWord.length()) != ' ') {
                        lTest = false;
                    }
                }
                if (lTest) {
                    lResult++;
                }
                i = lPos + 1;
            } else {
                i = lText.length();
            }

            i++;
        }
        return lResult;
    }

    public static void main(String[] args) {
        String lErrorMessage = "Ошибка ввода.";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.print("Введите текст:");
            String inputValue1 = inputText.nextLine();
            System.out.print("Введите слово:");
            String inputValue2 = inputText.nextLine();
            /* 
            Ищем конкретное слово
            1. Слово в тексте без учета окончания
            2. Слово в тексте без учета приставки
            3. Разделителем считаем пробел
                       
             */
//            inputValue1 = "ата  дост ата точно фывро ,  фывафы, ввв атаы  фывафыватата аата ата   ата ";
//            inputValue2 = "ата";

            System.out.println("Слово " + inputValue2 + " в тексте повторяется "
                    + countWordRepeat(inputValue1, inputValue2) + " раз.");
        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }

}
