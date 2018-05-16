
import java.util.Scanner;

public class PalindromeTest {

    public static String isPalindrome(String lValue) {
        String aLowerCaseValue = lValue.toLowerCase(); // ��� �� ���� ��������� 
        boolean aResult = true;
        // ���� ����� ��������� ������ �������� �����
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
            return (lValue + " ������������ �����"); // ��������� ������� ������ ���� chcp 1251
        } else {
            return (lValue + " �������������� �����");
        }
    }

    public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);
        /*��������?�, ��?��������� � �����, ��������������, ����� ��� �����, 
            ��������� ���������� � ����� ������������.
         */

        System.out.print("������� ����� ��� �������� �� ��������������:");
        if (inputText.hasNext()) {
            System.out.println(isPalindrome(inputText.next()));
        } else {
            System.out.println("������ �����. ���������� ������ �����.");
        }
    }
}
