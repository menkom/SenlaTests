
import java.util.Scanner;

public class TriangleTest {

    public static boolean isTriangle(float aSideA, float aSideB, float aSideC) {
        /*Требуется сравнить длину каждого отрезка-стороны с суммой двух других. 
        Если хотя бы в одном случае отрезок окажется больше суммы двух других, 
        то треугольника с такими сторонами не существует.
         */
        return (aSideA < aSideB + aSideC) && (aSideB < aSideA + aSideC) && (aSideC < aSideA + aSideB);
    }

    public static void main(String[] args) {
        String lErrorMessage = "Ошибка ввода.";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.println("Разделитель дробной части - запятая \",\" .");
            System.out.print("Введите длину стороны A:");
            float side1 = inputText.nextFloat();
            System.out.print("Введите длину стороны B:");
            float side2 = inputText.nextFloat();
            System.out.print("Введите длину стороны C:");
            float side3 = inputText.nextFloat();

            //side1 = 10;
            //side2 = 5;
            //side3 = 6;
            System.out.printf("Из указанных длин сторон %s составить треугольник.", ((isTriangle(side1, side2, side3)) ? "можно" : "нельзя"));

        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }
}
