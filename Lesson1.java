//—оздать пустой проект в IntelliJ IDEA и прописать метод main().

public class Lesson1 {
    public static void main(String[] args) {

// —оздать переменные всех пройденных типов данных и инициализировать их значени€.

        byte by = 127;
        short sh = 1000;
        int in = 5;
        long lo = 400000L;

        float fl = 3.14f;
        double dbl = 0.00000001;

        boolean isEnabled = false;

        char ch = '*';

        String str = "Hello, Java!";

//            *************** “есты **************
//        System.out.println(mathMethod(2.0f, 0.5005f, 40.5f, 13.5f));
//        System.out.println(myComparator(5, 16));
//        negOrPos(0);
//        System.out.println(isNotPositive (-1));
//        hello("¬асилий");
//        visokos(2021);
    }

/* Ќаписать метод, вычисл€ющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d Ц аргументы этого метода, имеющие тип float. */

    public static float mathMethod (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

//Ќаписать метод, принимающий на вход два целых числа и провер€ющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да Ц вернуть true, в противном случае Ц false.

    public static boolean myComparator (int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 20) {
            return false;
        } else {
            return true;
        }
    }

//Ќаписать метод, которому в качестве параметра передаетс€ целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. «амечание: ноль считаем положительным числом.

    public static void negOrPos (int a) {
        if (a >= 0) {
            System.out.println("„исло " + a + " положительное.");
        } else {
            System.out.println("„исло " + a + " отрицательное.");
        }
    }

//    Ќаписать метод, которому в качестве параметра передаетс€ целое число. ћетод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isNotPositive (int k) {
        if (k < 0) {
            return true;
        } else {
            return false;
        }
    }

//    Ќаписать метод, которому в качестве параметра передаетс€ строка, обозначающа€ им€. ћетод должен вывести в консоль сообщение Ђѕривет, указанное_им€!ї.

    public static void hello (String name) {
        System.out.println("ѕривет, " + name + "!");
    }

//     * Ќаписать метод, который определ€ет, €вл€етс€ ли год високосным, и выводит сообщение в консоль.  аждый 4-й год €вл€етс€ високосным, кроме каждого 100-го, при этом каждый 400-й Ц високосный.

    public static void visokos (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year == 400 ) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год невисокосный.");
        }
    }
}


