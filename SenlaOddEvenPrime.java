
import java.util.Scanner;

public class SenlaOddEvenPrime {

    public static String intEvenOddToText(int mValue) {
        if (mValue % 2 == 0) {
            return "������";
        } else {
            return "��������";
        }
    }

    public static String isPrime(int mValue) {
        /*  ������?� ����� � ����������� (����� �������������) �����, ������� ����� 
    ��� ��������� ����������� �������� � ������� � ������ ����.   
         */

        boolean lIsPrime = true;

        if (mValue < 2) { //���� �� ����������� �����, ������� 2
            lIsPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(mValue); i++) {
                if (mValue % i == 0) {
                    lIsPrime = false;
                    break;
                }
            }
        }
        if (lIsPrime) {
            return "�������";
        } else {
            return "���������";
        }
    }

    public static void main(String[] args) {
        System.out.print("������� ����� �����:");

        Scanner inputText = new Scanner(System.in);

        if (inputText.hasNextInt()) {
            int inputValue = inputText.nextInt();//������� ��� �������� ������
            System.out.println("����� " + inputValue + " " + intEvenOddToText(inputValue) + " � " + isPrime(inputValue));
        } else {
            System.out.println("������ �����. ���������� ���� ������ ����� �����");
        }
    }
}
