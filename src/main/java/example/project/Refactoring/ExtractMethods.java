package example.project.Refactoring;

public class ExtractMethods {

    /**
     * This is a method to reengineer using `extract methods` refactoring technique.
     * TODO: complete `foo_after_refactoring()` method below using the refactoring.
     */
    public static void foo_before_refactoring() {
        // initialise an array of random numbers with the size of 10
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        // print the array with a given delimiter
        String delimiter = " ";
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + delimiter);
        }
        System.out.println();

        // initialise another array of random numbers with the size of 10
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        // print the array with a given delimiter
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + delimiter);
        }
        System.out.println();
    }

    public static void foo_after_refactoring() {
        // initialise an array of random numbers with the size of 10
        int[] array1 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array1, " ");

        // initialise another array of random numbers with the size of 10
        int[] array2 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array2, " ");
    }

    private static void printArrayWithDelimiter(int[] array1, String delimiter) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + delimiter);
        }
        System.out.println();
    }

    private static int[] initialiseArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}
