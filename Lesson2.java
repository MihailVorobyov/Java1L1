public class Lesson2 {
    public static void main(String[] args) {

//        1. «адать целочисленный массив, состо€щий из элементов 0 и 1. Ќапример: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. — помощью цикла и услови€ заменить 0 на 1, 1 на 0;
        int[] arr1 = {0, 1, 0, 0, 1, 1};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }

//        2. «адать пустой целочисленный массив размером 8. — помощью цикла заполнить его значени€ми 0 3 6 9 12 15 18 21;
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }


//        3. «адать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }

//        4. —оздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int arrLength = 12;
        int[][] sqrArr = new int[arrLength][arrLength];
        for (int i = 0; i < sqrArr.length; i++) {
            for (int j = 0; j < sqrArr[i].length; j++) {
                if (i == j || i + j == sqrArr.length - 1) {
                    sqrArr[i][j] = 1;
                }
            }
        }

//        5. «адать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] monoArray = {5, 18899, 33, 0, -66, 12330};
        int max = monoArray[0];
        int min = monoArray[0];
        for (int i = 1; i < monoArray.length; i++) {
            if (max < monoArray[i]) {
                max = monoArray[i];
            }
            if (min > monoArray[i]) {
                min = monoArray[i];
            }
        }
    }

    //        6. ** Ќаписать метод, в который передаетс€ не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. ѕримеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) ? true, checkBalance([1, 1, 1, || 2, 1]) ? true, граница показана символами ||, эти символы в массив не вход€т.
    static boolean checkArray (int a[]) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < a.length - 1; i++) {
            left += a[i];
            for (int j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if (left == right) {
                return true;
            }
            right = 0;
        }
        return false;
    }

//        7. **** Ќаписать метод, которому на вход подаетс€ одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Ёлементы смещаютс€ циклично. ƒл€ усложнени€ задачи нельз€ пользоватьс€ вспомогательными массивами. ѕримеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. ѕри каком n в какую сторону сдвиг можете выбирать сами.
    static void shiftArray (int array[], int shift) {
        int temp;
        for (int i = 0; i < Math.abs(shift); i++) {
            if (shift < 0) {
                temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length-1] = temp;
            } else if (shift > 0) {
                temp = array[array.length-1];
                for (int j = array.length-1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
        }
    }
}
