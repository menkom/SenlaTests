
import java.util.Scanner;

public class MinMaxInRandArray {

    public static int[] getIntArray(int aArraySize) {
        int[] lResult = new int[aArraySize];
        int lStartNum = 10; // ����������� ����� ���������� � 10
        int lFinishNum = 99; // ����������� ����� ������������� 99
        System.out.println("������ �� " + aArraySize + " :");
        for (int i = 0; i < aArraySize; i++) {
            lResult[i] = lStartNum + (int) (Math.random() * (lFinishNum - lStartNum + 1));
            System.out.print(lResult[i] + "; ");
        }
        System.out.print("\n");

        return lResult;
    }

    public static int getArrayMin(int[] aArray) {
        int lResult = aArray[0];
        for (int i = 1; i < aArray.length; i++) {
            lResult = Math.min(lResult, aArray[i]);
        }
        return lResult;
    }

    public static int getArrayMax(int[] aArray) {
        int lResult = aArray[0];
        for (int i = 1; i < aArray.length; i++) {
            lResult = Math.max(lResult, aArray[i]);
        }
        return lResult;
    }

    public static void main(String[] args) {
        String lErrorMessage = "������ �����.";

        Scanner inputText = new Scanner(System.in);

        int[] arrayOfRandomNumber;
        try {
            System.out.print("������� ����� �������:");
            arrayOfRandomNumber = getIntArray(inputText.nextInt());

            System.out.println("������������ �������� � ������� : " + getArrayMax(arrayOfRandomNumber));
            System.out.println("����������� �������� � ������� : " + getArrayMin(arrayOfRandomNumber));

        } catch (Exception e) {
            System.out.println(lErrorMessage);

        }
    }

}
