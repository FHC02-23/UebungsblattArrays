public class EinMalEins {

    public static void main(String[] args) {
        int[][] array = new int[3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        printArray(array);
        System.out.println();

        printArray(calculateEinMalEins(8));
    }

    public static void printArray(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            int[] numbers = arrayToPrint[i];
            System.out.print((i + 1) + "-er Reihe: ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] calculateEinMalEins(int n) {
        int[][] array = new int[n][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
