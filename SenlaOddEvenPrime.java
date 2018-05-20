
import java.util.Scanner;

public class SenlaOddEvenPrime {

    public static boolean isEven(int mValue) {
        return (mValue % 2 == 0);
    }

    public static boolean isPrime(int mValue) {
        /*  ������?� ����� � ����������� (����� �������������) �����, ������� ����� 
    ��� ��������� ����������� �������� � ������� � ������ ����.   
         */

        boolean lIsPrime = true;

        //���� �� ����������� �����, ������� 2
        if (mValue < 2) {
            lIsPrime = false;
        } else {
            //���������� ��������� ��� ����� �� �������� ����� �� ��������
            for (int i = 2; i < Math.sqrt(mValue); i++) {
                if (mValue % i == 0) {
                    lIsPrime = false;
                    break;
                }
            }
        }
        return lIsPrime;
    }

    public static void main(String[] args) {
        System.out.print("������� ����� �����:");

        Scanner inputText = new Scanner(System.in);

        if (inputText.hasNextInt()) {
            int inputValue = inputText.nextInt();//������� ��� �������� ������
            System.out.println("����� " + inputValue + " "
                    + (isEven(inputValue) ? "������" : "��������")
                    + " � " + (isPrime(inputValue) ? "�������" : "���������"));
        } else {
            System.out.println("������ �����. ���������� ���� ������ ����� �����");
        }
    }
}
