
import java.util.Scanner;

public class NumberOfWords {

    static char[] separ = {' ', ','};

    public static int wordsCount(String aValue) {
        int aResult = 0;

        int i = 0;
        int[] separInt = {0, 0};
        int nextNum = 0;
        /*
        1. ������ �������� ����� ���� ������
        2. ������� ���������� ����� ���� ���� �� ������ - ��� �� �� ����� ������
        3. ���� ����������� ������� �� ������ �����, �� �� �������� �� ������ �������-�����������.
        4. ��������� �������� ����� ���� ������

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
        System.out.print("������� �����������:");
        if (inputText.hasNext()) {
            System.out.println("� ����������� " + wordsCount(inputText.nextLine()) + " ����.");
        } else {
            System.out.println("������ �����. ���������� ������ �����.");
        }
    }

}
