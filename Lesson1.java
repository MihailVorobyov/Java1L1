//������� ������ ������ � IntelliJ IDEA � ��������� ����� main().

public class Lesson1 {
    public static void main(String[] args) {

// ������� ���������� ���� ���������� ����� ������ � ���������������� �� ��������.

        byte by = 127;
        short sh = 1000;
        int in = 5;
        long lo = 400000L;

        float fl = 3.14f;
        double dbl = 0.00000001;

        boolean isEnabled = false;

        char ch = '*';

        String str = "Hello, Java!";

//            *************** ����� **************
//        System.out.println(mathMethod(2.0f, 0.5005f, 40.5f, 13.5f));
//        System.out.println(myComparator(5, 16));
//        negOrPos(0);
//        System.out.println(isNotPositive (-1));
//        hello("�������");
//        visokos(2021);
    }

/* �������� �����, ����������� ��������� a * (b + (c / d)) � ������������ ���������,
��� a, b, c, d � ��������� ����� ������, ������� ��� float. */

    public static float mathMethod (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

//�������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20 (������������), ���� �� � ������� true, � ��������� ������ � false.

    public static boolean myComparator (int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 20) {
            return false;
        } else {
            return true;
        }
    }

//�������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������, ������������� �� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������.

    public static void negOrPos (int a) {
        if (a >= 0) {
            System.out.println("����� " + a + " �������������.");
        } else {
            System.out.println("����� " + a + " �������������.");
        }
    }

//    �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.

    public static boolean isNotPositive (int k) {
        if (k < 0) {
            return true;
        } else {
            return false;
        }
    }

//    �������� �����, �������� � �������� ��������� ���������� ������, ������������ ���. ����� ������ ������� � ������� ��������� �������, ���������_���!�.

    public static void hello (String name) {
        System.out.println("������, " + name + "!");
    }

//     * �������� �����, ������� ����������, �������� �� ��� ����������, � ������� ��������� � �������. ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.

    public static void visokos (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year == 400 ) {
            System.out.println(year + " ��� ����������.");
        } else {
            System.out.println(year + " ��� ������������.");
        }
    }
}


