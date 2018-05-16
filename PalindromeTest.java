
import java.util.Scanner;

public class PalindromeTest {

    public static String isPalindrome(String lValue) {
        String aLowerCaseValue = lValue.toLowerCase(); // нам же надо проверять 
        boolean aResult = true;
        // Есть смысл проверять только непустое слово
        if (aLowerCaseValue.length() > 0) {
            for (int i = 0; i < aLowerCaseValue.length() / 2; i++) {
                if (aLowerCaseValue.charAt(i) != aLowerCaseValue.charAt(aLowerCaseValue.length() - 1 - i)) {
                    aResult = false;
                    break;
                }
            }
        } else {
            aResult = false;
        }

        if (aResult) {
            return (lValue + " палиндромное слово"); // кодировка консоли должна быть chcp 1251
        } else {
            return (lValue + " непалиндромное слово");
        }
    }

    public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);
        /*Палиндро?м, пе?ревертень — число, буквосочетание, слово или текст, 
            одинаково читающееся в обоих направлениях.
         */

        System.out.print("Введите слово для проверки на палиндромность:");
        if (inputText.hasNext()) {
            System.out.println(isPalindrome(inputText.next()));
        } else {
            System.out.println("Ошибка ввода. Необходимо ввести слово.");
        }
    }
}
