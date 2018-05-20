
import java.util.Scanner;

public class TriangleTest {

    public static boolean isTriangle(float aSideA, float aSideB, float aSideC) {
        /*��������� �������� ����� ������� �������-������� � ������ ���� ������. 
        ���� ���� �� � ����� ������ ������� �������� ������ ����� ���� ������, 
        �� ������������ � ������ ��������� �� ����������.
         */
        return (aSideA < aSideB + aSideC) && (aSideB < aSideA + aSideC) && (aSideC < aSideA + aSideB);
    }

    public static void main(String[] args) {
        String lErrorMessage = "������ �����.";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.println("����������� ������� ����� - ������� \",\" .");
            System.out.print("������� ����� ������� A:");
            float side1 = inputText.nextFloat();
            System.out.print("������� ����� ������� B:");
            float side2 = inputText.nextFloat();
            System.out.print("������� ����� ������� C:");
            float side3 = inputText.nextFloat();

            //side1 = 10;
            //side2 = 5;
            //side3 = 6;
            System.out.printf("�� ��������� ���� ������ %s ��������� �����������.", ((isTriangle(side1, side2, side3)) ? "�����" : "������"));

        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }
}
