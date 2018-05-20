
import java.util.Scanner;

public class PalindromeInSequence {

    /*����� ����� ������������� ��� ����� ��������. 
    ������� ��� ����� �������� ���� �������� �����.
     */
    public static boolean isPalindrom(int aNumber) {
        boolean lResult = true;
// �������� ������� ������ (N<=100), �� �������� �������� ����������� �� ���� ������ � �� ����������.
        if (aNumber >= 10) {
            lResult = ((aNumber / 10) == (aNumber % 10));
            if (lResult) {
                System.out.print(aNumber + "; ");
            }
        }
        return lResult;
    }

    public static void main(String[] args) {

        String lErrorMessage = "������ �����.";

        Scanner inputText = new Scanner(System.in);

        try {
            System.out.print("������� ����� ������������������ (�� ����� 100):");
            int sequenceLength = inputText.nextInt();
            if ((sequenceLength > 100) || (sequenceLength < 0)) {
                System.out.println(lErrorMessage + "����� �� ������ ���� ������ 100 ��� ������ 0.");
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
