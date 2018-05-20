
import java.util.Scanner;

public class SumNodNok {

    /*
� ����� ������� ������ �������� ������� ����������� � ���� ������������� 
����� ����� � ��������� ����� ����, ������� ������� �� �������� ����� � 
������� ����� ������� � ������� ������. ������� �����������, ���� ����� �� 
������ �������. ��������� ����� � ���� ���������� ����� �������� �������� ����. 
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
        String lErrorMessage = "������ �����. ���������� ���� ������ ����� �����";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.print("������� ������ ����� �����:");
            int inputValue1 = inputText.nextInt();
            System.out.print("������� ������ ����� �����:");
            int inputValue2 = inputText.nextInt();

            System.out.println("����� " + inputValue1 + " � " + inputValue2 + " ����� " + (inputValue1 + inputValue2));
            System.out.println("�������� " + inputValue1 + " � " + inputValue2 + " ����� " + (inputValue1 - inputValue2));
            System.out.println("��� " + inputValue1 + " � " + inputValue2 + " ����� " + nod(inputValue1, inputValue2));
            System.out.println("��� " + inputValue1 + " � " + inputValue2 + " ����� " + nok(inputValue1, inputValue2));

        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }
}
