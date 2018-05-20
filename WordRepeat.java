
import java.util.Scanner;

public class WordRepeat {

    public static int countWordRepeat(String aText, String aWord) {
        int lResult = 0;//���������� ���������� ��������� �����
        String lText = aText.toLowerCase();
        String lWord = aWord.toLowerCase();
        int i = 0;
        int lPos = -1;
        boolean lTest;
        while (i < lText.length()) {
            lPos = lText.indexOf(lWord, i);
            if (lPos != -1) {
                lTest = true;
                //����� � ����� ������ ���� ������� ��� ����� ������ ���� ��������� ��� ������ � ������
                //�.�. 1. ���� ��������� ���� ����� ������, �� ��������� ������. 
                //2.���� ����� �� ������, �� ����� ��� ������ ���� ������
                if (lPos != 0) {
                    if (lText.charAt(lPos - 1) != ' ') {
                        lTest = false;
                    }
                }
                if (lTest && (lPos + lWord.length() != lText.length())) {
                    if (lText.charAt(lPos + lWord.length()) != ' ') {
                        lTest = false;
                    }
                }
                if (lTest) {
                    lResult++;
                }
                i = lPos + 1;
            } else {
                i = lText.length();
            }

            i++;
        }
        return lResult;
    }

    public static void main(String[] args) {
        String lErrorMessage = "������ �����.";

        Scanner inputText = new Scanner(System.in);
        try {
            System.out.print("������� �����:");
            String inputValue1 = inputText.nextLine();
            System.out.print("������� �����:");
            String inputValue2 = inputText.nextLine();
            /* 
            ���� ���������� �����
            1. ����� � ������ ��� ����� ���������
            2. ����� � ������ ��� ����� ���������
            3. ������������ ������� ������
                       
             */
//            inputValue1 = "���  ���� ��� ����� ����� ,  ������, ��� ����  ������������ ���� ���   ��� ";
//            inputValue2 = "���";

            System.out.println("����� " + inputValue2 + " � ������ ����������� "
                    + countWordRepeat(inputValue1, inputValue2) + " ���.");
        } catch (Exception e) {
            System.out.println(lErrorMessage);
        }
    }

}
