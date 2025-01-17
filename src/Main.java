public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println("Сумма в диапозоне: " + isSumInRange(5, 10));
        System.out.println("Сумма в диапозоне: " + isSumInRange(15, 10));

        printPositiveOrNegative(5);
        printPositiveOrNegative(-4);

        System.out.println("Число отрицательное: " + isNegative(-3));
        System.out.println("Число положительное: " + isNegative(3));

        repeatString("Hello Everyone!", 3);

        System.out.println("Год високосный: " + isLeapYear(2024));
        System.out.println("Год високосный: " + isLeapYear(1800));

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0};
        invertBinaryArray(binaryArray);
        printArray(binaryArray);

        int[] sequenceArray = createSequenceArray(100);
        printArray(sequenceArray);

        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArray(numbers);
        printArray(numbers);

        int size = 5;
        int[][] diagonalMatrix = createDiagonalMatrix(size);
        print2DArray(diagonalMatrix);

        int len = 10;
        int initialValue = 7;
        int[] array = createArray(len, initialValue);
        printArray(array);
    }


    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");

    }

    public static void checkSumSign() {
        int a = -3;
        int b = 8;
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 9;
        System.out.println(value <= 0 ? "Красный" : (value <= 100 ? "Жёлтый" : "Зелёный"));
    }

    public static void compareNumbers() {
        int a = 2;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;

    }

    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void repeatString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertBinaryArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    public static int[] createSequenceArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }


    // Написал методы для вывода массивов в консоль
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}